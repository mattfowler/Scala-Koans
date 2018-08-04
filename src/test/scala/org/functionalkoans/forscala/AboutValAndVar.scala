package org.functionalkoans.forscala

import support.KoanSuite

class AboutValAndVar extends KoanSuite {

  koan("Vars are variables, and may be reassigned") {
    var a = 5
    a should be(10)   //Fix this.

    a = 7
    a should be(__)
  }

  koan("vals are values, and may not be reassigned, analogous to final in Java") {
    val a = 5
    a should be(__)

    // What happens if you uncomment these lines?
    // a = 7
    // a should be (7)
  }

  koan("All vals and var types are inferred by default, but you can add the type explicitly") {
    val a:Int = 10
    var b:String = "Hello" //NOTE: vars are not preferred in the Scala world
    b = b + " " + 10
    b should be (__)
  }

  koan("If you want to include a space in your variable or value use backticks") {
    val `my greatest gift in dollars` = 500
    (`my greatest gift in dollars` + 30) should be (__) //Whoa!
  }

  koan("Any strange characters that you wish to use in a variable or value can be used after an underscore") {
    val isThisMySalaryPerYear_? = 50000
    val thisShouldBeMyRaise_! = isThisMySalaryPerYear_? + 50000
    thisShouldBeMyRaise_! should be (__)
  }

  koan("Backticks can also be used to spite your co-workers and send them into a spiral of confusion and agony!") {
    val `void` = 100
    val `false` = true
    val `return` = 90

    (if (`false`) `void` else `return`) should be(__)
  }

  koan("A lazy val is assignment that will not evaluated until it is called. Note there is no lazy var") {
    var history = ""
    lazy val a = {history = history + "5"; 19}
    history should be(__)
    a should be (__)
    history should be(__)
  }
}
