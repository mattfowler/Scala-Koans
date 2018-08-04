package org.functionalkoans.forscala.support

import org.scalatest.events.Event
import org.scalatest.Stopper
import language.reflectiveCalls

object Master extends Stopper {
  var studentNeedsToMeditate = false


  type HasTestNameAndSuiteName = {
    val suiteName: String
    val testName: String
  }


  def studentFailed (event: HasTestNameAndSuiteName): String = {
    studentNeedsToMeditate = true
    meditationMessage(event)
  }

  private def meditationMessage(event: HasTestNameAndSuiteName) = {
    "Please meditate on koan \"%s\" of suite \"%s\"" format (event.testName, event.suiteName)
  }

  override def stopRequested: Boolean = studentNeedsToMeditate

  override def requestStop(): Unit = ()
}

