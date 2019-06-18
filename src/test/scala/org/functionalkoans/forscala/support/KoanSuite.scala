package org.functionalkoans.forscala.support

import org.scalatest._
import org.scalatest.events.{Event, TestFailed, TestPending}
import org.scalatest.exceptions.TestPendingException
import org.scalatest.matchers.Matcher

trait KoanSuite extends FunSuite with CancelAfterFailure with Matchers {

  def koan(name: String)(fun: => Unit) {
    test(name.stripMargin('|'))(fun)
  }

  def __ : Matcher[Any] = {
    throw new TestPendingException
  }

  protected class ___ extends Exception {
    override def toString = "___"
  }

  override def runTests(testName: Option[String], args: Args): Status = {
    class KoanReporter(wrappedReporter: Reporter) extends Reporter {

      override def apply(event: Event): Unit = {
        event match {
          case _: TestFailed => args.stopper.requestStop()
          case _: TestPending => args.stopper.requestStop()
          case _ =>
        }
        wrappedReporter(event)
      }
    }

    testName match {
      case Some(name) => runTest(name, args)
      case None =>
        val koanReporter = new KoanReporter(args.reporter)
        val results = testNames.toStream.map(test => runTest(test, args.copy(reporter = koanReporter)))
                               .takeWhile(status => status.succeeds())

        if (results.length == testNames.size) SucceededStatus else FailedStatus
    }
  }

}
