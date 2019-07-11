package org.functionalkoans.forscala.lesson4

import org.functionalkoans.forscala.support.KoanSuite

/**
  * Lesson 4 - About basic collections
  *
  * Scala has a collections library to store lists and arrays of items.  In this lesson
  * we'll see how to create and work two basic collections.
  *
  * Vector - which represents an array.  It has constant time lookups.
  * List - Which represents a linked list. It has linear time lookups.
  *
  * Both List and Vector are subtypes of Seq, short for Sequence.
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

}
