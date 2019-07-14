package org.functionalkoans.forscala.lesson4

import org.functionalkoans.forscala.support.KoanSuite

/**
  * Lesson 4 - About basic collections
  *
  * Scala has a collections library to store lists, arrays, sets and maps of items.  In this lesson
  * we'll see how to create and work four basic collections.
  *
  * Vector - Represents an array.  It has constant time lookups.
  * List - Represents a linked list. It has linear time lookups.
  * Set - Represents a set of non-duplicated elements.  It has constant time lookups.
  * Map - Represents a mapping of keys to values.  It has constant time lookups.
  *
  * Both List and Vector are subtypes of Seq, short for Sequence.  Set and Map are subtypes of Iterable.
  *
  */
class AboutBasicCollections extends KoanSuite {

  koan("Vector is Scala's way to create an array. We can find an element by index.") {
    val vector: Vector[Int] = Vector(1, 2, 3)

    vector should be(__)

    //Vector has constant time lookup by index
    vector(1) should be(__)
  }

  koan("List is Scala's way to create a linked list. We can find an element by index.") {
    val list: List[Int] = List(1, 2, 3)

    list should be(__)

    //List has linear time lookup by index
    list(1) should be(__)
  }

  koan("A Seq, short for Sequence, is the supertype of both List and Vector") {
    val vector: Seq[Int] = Vector(1, 2, 3)
    val list: Seq[Int] = List(1, 2, 3)

    // == is object equality, it checks to see if the elements are the same.
    vector == list should be(__)
  }

  koan("We can add an element to a collection with the :+ operator") {
    val list: List[Int] = List(1, 2, 3)

    val withFour = list :+ 4

    withFour should be(__)

    //Appending to a sequence in Scala creates a new list
    list == withFour should be(__)
  }

  koan("A Set is a collection which contains no duplicate elements") {
    val set: Set[Int] = Set(1, 2, 3, 3)

    set should be(Set(__, __, __))
  }

  koan("We can check if an element is in a set and get a boolean back") {
    val set: Set[String] = Set("a", "b", "c", "d")

    //Set has constant time lookup
    set("a") should be (__)
    set("z") should be (__)
  }

  koan("We can add an element to a set with the + operator") {
    val set: Set[String] = Set("a", "b", "c", "d")

    val setWithE = set + "e"

    setWithE("e") should be (__)
  }

  koan("A map is a mapping from keys to values.  We can access a value by referencing the key") {
    val map: Map[String, Int] = Map("One" -> 1, "Two" -> 2, "Three" -> 3)

    map("One") should be(__)

    //We can also check if a key exists
    map.contains("Five") should be(__)
  }

  koan("We can add a key -> value pair to a map with the + operator") {
    val map: Map[String, Int] = Map("One" -> 1, "Two" -> 2, "Three" -> 3)

    val withFour = map + ("Four" -> 4)

    withFour("Four") should be(__)
  }

}
