package org.functionalkoans.forscala

import support.KoanSuite
import java.util.Date

/**
  * Lesson 3 - About Tuples
  *
  * In this lesson we'll learn about Tuples. A tuple is a data type that can hold a fixed number
  * of items each with a distinct type.  This is different from a list or array because we can't
  * add or remove new elements to a tuple and each element can have an unrelated type.
  *
  */
class AboutTuples extends KoanSuite {

  koan("A tuple is a way to group two or more items together as one value") {
    val tuple: (String, String) = ("apple", "dog")
    tuple should be(__)
  }

  koan("Tuple items may be accessed by using tuple._itemNumber syntax") {
    val tuple: (String, Int) = ("apple", 2)
    val fruit = tuple._1
    val number = tuple._2

    fruit should be(__)
    number should be(__)
  }

  koan("Tuples may be of mixed type") {
    //The type of tuple5 is (String, Int, Double, Date, BigDecimal)
    val tuple5 = ("a", 1, 2.2, new Date(), BigDecimal(5))

    tuple5._2 should be(__)
    tuple5._5 should be(__)
  }
}
