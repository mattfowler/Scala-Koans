package org.functionalkoans.forscala.lesson8

import org.functionalkoans.forscala.support.KoanSuite

/**
 *
 * Lesson 8 - About Basic Pattern Matching
 *
 * Pattern matching is a way to check a value against a pattern and execute some code if the value matches the pattern.
 * It is similar to the switch statement in Java and will let us match on the exact value of a variable, but it also
 * lets us do some more advanced things such as match on the type of the value itself. We can use this feature to
 * replace complex if statements.
 *
 * A match expression is defined by a value, the match keyword and one or more case clauses.  You can also specify a
 * 'wildcard' case which is the default case if none of the other cases match.  The below will evaluate to 1 if `value`
 * is 1, otherwise it will always evaluate to zero.
 *
 * value match {
 *   case 1 => 1
 *   case _ => 0  //the default 'fall through behavior'
 * }
 *
 * Pattern matching is extremely powerful in Scala and we'll see more of this power when we get to case classes.
 */
class AboutBasicPatternMatching extends KoanSuite {

  koan("We can pattern match on the exact value of a variable and provide a default if there is no match") {
    def numberToString(number: Int) = {
      number match {
        case 1 => "one"
        case 2 => "two"
        case _ => "other"
      }
    }

    numberToString(1) should be(__)
    numberToString(2) should be(__)
    numberToString(3) should be(__)
  }

  koan("We can pattern match on just a type") {
    def matchOnType(variable: Any): String = {
      variable match {
        case number: Int => s"$number is an Integer"
        case str: String => s"$str is a String"
        case other       => s"$other is something else"
      }
    }

    matchOnType(1) should be(__)
    matchOnType("testing") should be(__)
    matchOnType(4.3) should be(__)
  }

  koan("""We can also add guards in pattern matching. This will only execute the code if the condition inside
                  the if statement is true""") {
    def isMultipleOfThreeOrEven(number: Int) = {
      number match {
        case number if(number % 2 == 0) => true
        case number if(number % 3 == 0) => true
        case _                          => false
      }
    }

    isMultipleOfThreeOrEven(2) should be(__)
    isMultipleOfThreeOrEven(5) should be(__)
    isMultipleOfThreeOrEven(9) should be(__)
  }

  koan("""We can use pattern matching so solve a common interview question, fizzbuzz. If a number is divisible
      by both three and five we return 'fizzbuzz'. If it is only divisible by three we return 'fizz'. If it is only
      divisible by five, we return 'buzz'. Otherwise we just return the number as a string""") {
    def fizzBuzz(number: Int): String = {
      number match {
        case number if(?) => ?
        case number if(?) => ?
        case number if(?) => ?
        case number       => number.toString
      }
    }

    fizzBuzz(3) should be("fizz")
    fizzBuzz(5) should be("buzz")
    fizzBuzz(15) should be("fizzbuzz")
    fizzBuzz(11) should be("11")
  }

}
