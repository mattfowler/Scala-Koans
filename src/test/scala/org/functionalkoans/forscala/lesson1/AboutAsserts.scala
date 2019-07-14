package org.functionalkoans.forscala.lesson1

import org.functionalkoans.forscala.support.KoanSuite
import org.scalatest.Matchers

/**
  * Lesson 1 - About Asserts
  *
  * In this lesson we'll learn about assertions . An assertion will assert if a condition is true,
  * if it is, the test will pass and we can move on to the next one.  If it does not pass the test
  * will fail and we need to fix it.
  *
  * Most tests will have a double underscore in them.  This is a cue to you to fill the underscore
  * in with the correct value to make the test pass.  A test will show as 'pending' until you
  * do so.
  *
  * Sometimes we will give you a test that with an already written assertion.  In this case there will be a block
  * of code with a ? in it.  This is your cue to provide the code that will make the assertion pass.
  *
  * We'll use Scalatest's should matchers for this. Should matchers take the form of:
  *
  * actualValue should be(expectedValue)
  *
  */
class AboutAsserts extends KoanSuite with Matchers {

  koan("We can use should matchers to do assertions") {
    true should be(__) // should be true
  }

  koan("We can fill in a ? to make an expected assertion pass") {
    val one: Int = ?

    one should be(1)
  }

}
