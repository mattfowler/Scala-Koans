package org.functionalkoans.forscala.lesson7

import org.functionalkoans.forscala.support.KoanSuite


/**
  * Lesson 7 - About Collections Operations
  *
  * Scala collections have a rich set of transformation methods that allow us to apply functions to each element
  * in a collection and return a new collection.  This eliminates the need for writing loops in many cases.
  *
  * In this lesson we'll take a look at two operations, mapping and filtering.  In later lessons we'll take a look
  * at some of the more advanced operations that we have on collections.
  *
  */
class AboutCollectionsOperations extends KoanSuite {


  koan("We can use map to apply an anonymous function to every element of a sequence and create a new list") {
    val numbers = Seq(1, 2, 3)

    val numbersPlusOne = numbers.map(number => number + 1)

    numbersPlusOne should be(Seq(__, __, __))

    //numbers.map ... creates a new list. .equals is reference equality
    numbers.equals(numbersPlusOne) should be(__)
  }

  koan("We can also use underscore syntax with map to save ourselves some typing") {
    val numbers = Seq(1, 2, 3)

    // here _ represents the number we are currently mapping over in the list
    val numbersPlusOne = numbers.map(_ + 1)

    numbersPlusOne should be(Seq(__, __, __))
  }

  koan("We can use map to multiply all elements by two") {
    val numbers = Seq(1, 2, 3)

    val numbersTimesTwo = numbers.map(?)

    numbersTimesTwo should be(Seq(2, 4, 6))
  }

  koan("We can remove elements from a list by using filter and passing in an anonymous function which returns a boolean") {
    val numbers = Seq(1, 2, 3, 4)
    val evens = numbers.filter(_ % 2 == 0)

    evens should be(Seq(__, __))
  }

  koan("We can use filter to remove all elements greater than 2") {
    val numbers = Seq(1, 2, 3, 4)

    val evens = numbers.filter(?)

    evens should be(Seq(1, 2))
  }

  koan("We can chain maps and filters together for concise code") {
    val numbers = Seq(1, 2, 3, 4)

    val evensTimesTwo = numbers.filter(?).map(?)

    evensTimesTwo should be(Seq(4, 8))
  }
}
