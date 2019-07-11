package org.functionalkoans.forscala.lesson2

import org.functionalkoans.forscala.support.KoanSuite

/**
  * Lesson 2 - About val and var
  *
  * In this lesson we'll take a look at how to create values and variables in Scala.
  * Values are created with the val keyword. They are immutable and cannot be changed
  * once they are assigned to.  Variables can be changed once they are created.
  *
  * In the Scala world we prefer immutability, so we will almost always use val going forward.
  */
class AboutValAndVar extends KoanSuite {

  koan("Vals are values and may not be reassigned") {
    val a = 5
    a should be(__)

    // What happens if you uncomment these lines?
    // a = 7
    // a should be (7)
  }

  koan("Vars are variables and may be reassigned") {
    var a = 5
    a = 7
    a should be(__)
  }

  koan("Types are inferred by default, but you can add the type for clarity") {
    val ten: Int = 10
    val hello: String = "Hello"
    val message: String = hello + " " + ten
    message should be(__)
  }

  koan("A val can be assigned from a multi-line expression if they are enclosed in {}") {
    val myInteger = {
      val a = 1
      val b = 2
      a + b
    }
    myInteger should be(__)
  }

  koan("A lazy val will not evaluated until it is called and is only evaluated once") {
    var timesCalled = 0
    val lazyInt = {
      timesCalled = timesCalled + 1
      19
    }

    timesCalled should be(__)

    lazyInt should be(19)

    timesCalled should be(__)

    println(lazyInt) // call lazy a second time

    timesCalled should be(__)
  }
}
