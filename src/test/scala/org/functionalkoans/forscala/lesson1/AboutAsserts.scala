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
  * Sometimes we will give you a test that is failing and ask you to make it pass. In this case
  * the test will fail and say 'TestFailedException' until you make the code pass.
  *
  * Usually we'll use Scalatest's should matchers for this. Should matchers take the form of:
  *
  * actualValue should be(expectedValue)
  *
  */
class AboutAsserts extends KoanSuite with Matchers {

  koan("We can use should matchers to do assertions") {
    true should be(__) // should be true
  }

  koan("Sometimes we present you with a failing test that you should make pass") {
    4 should be (3)
  }

}
