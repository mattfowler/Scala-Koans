package org.functionalkoans.forscala.lesson6

import org.functionalkoans.forscala.support.KoanSuite

/**
  * Lesson 6 - About flow control
  *
  * Scala has all the normal flow control operations you'd expect in a language.  However
  * Scala adds a few features that make flow control a bit more pleasant to work with,
  * for instance, if and for are also expressions.
  *
  */
class AboutFlowControl extends KoanSuite {

  koan("If can be used to conditionally execute code ") {
    def addIfOdd(x: Int): Int = {
      if (x % 2 == 0) {
        2
      } else {
        x + 1
      }
    }

    addIfOdd(2) should be(__)
    addIfOdd(3) should be(__)
  }

  koan("If is an expression and can be assigned to a value") {
    val value = 3
    // note brackets are optional if the block is one line
    val message = if (value == 3) "three" else "not three"

    message should be(__)
  }

  koan("A for expression can loop over a range of values using 'start to end' syntax") {
    var count = 0
    for (value <- 1 to 5) {
      count = count + value
    }

    count should be(__)
  }

  koan("A for expression can be used as a generator to generate sequences") {
    val values: Seq[Int] = for(value <- 1 to 2) yield value

    values should be(__)
  }

}
