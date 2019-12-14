package org.functionalkoans.forscala.lesson5

import org.functionalkoans.forscala.support.KoanSuite

/**
  * Lesson 5 - About functions
  *
  * Scala is a functional language, so functions are important! In Scala we can create functions
  * a few ways.  The first is named functions which we create with the def keyword and have a name
  * we can use to call them.  The second is anonymous functions which have no name.
  * We can pass around anonymous functions to other functions as parameters.
  *
  */
class AboutFunctions extends KoanSuite {


  koan("A named function is created with the def keyword and a function name") {
    def add(x: Int, y: Int): Int = {
      x + y // return is optional, the last statement in the function is returned.
    }

    add(2, 2) should be(__)
  }

  koan("A function may have default arguments") {
    def add(x: Int, y: Int, z: Int = 1): Int = {
      x + y + z
    }

    add(2, 2) should be(__)
    add(2, 2, 2) should be(__)
  }

  koan("An anonymous function is defined by 'parameter => function definition' syntax") {
    val addOne = (x: Int) => x + 1

    addOne(1) should be(__)

    // Note the type of Int => Int.  The => means 'returns'
    // Also note we don't need to put a type on x if we do this
    // because it is inferred.
    val addTwo: Int => Int = x => x + 2

    addTwo(1) should be(__)
  }

  koan("We can assign a named function to a value") {
    // note we can omit curly braces if the function is one line.
    def multiply(x: Int, y: Int) = x * y

    // Note the type is now (Int, Int) => Int, because the function takes two ints
    // and returns one
    val multiplyValue: (Int, Int) => Int = multiply

    multiplyValue(2, 2) should be(__)
  }

  koan("We can pass an anonymous function to a function as a parameter") {

    def useAnonymousFunction(myFunction: Int => Int): Int = {
      myFunction(5)
    }

    useAnonymousFunction(x => x + 1) should be(__)
    useAnonymousFunction(x => x * 2) should be(__)

    // We can also use underscore shorthand.  When we use underscore in an anonymous
    // function the underscore refers to the first parameter of the function.
    // In this case the below is equivalent to x => x + 3.  Underscore allows us to
    // omit the x => x
    useAnonymousFunction(_ + 3) should be(__)
  }

}
