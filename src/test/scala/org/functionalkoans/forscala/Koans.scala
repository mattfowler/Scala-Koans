package org.functionalkoans.forscala

import org.functionalkoans.forscala.lesson1.AboutAsserts
import org.functionalkoans.forscala.lesson2.AboutValAndVar
import org.functionalkoans.forscala.lesson3.AboutTuples
import org.functionalkoans.forscala.lesson4.AboutBasicCollections
import org.functionalkoans.forscala.lesson5.AboutFunctions
import org.functionalkoans.forscala.lesson6.AboutFlowControl
import org.functionalkoans.forscala.lesson7.AboutCollectionsOperations
import org.functionalkoans.forscala.support.KoanSuite
import org.scalatest.Sequential

import scala.collection.immutable.IndexedSeq

class Koans extends Sequential {
  override val nestedSuites: IndexedSeq[KoanSuite] =
    IndexedSeq(
      new AboutAsserts,
      new AboutValAndVar,
      new AboutTuples,
      new AboutBasicCollections,
      new AboutFunctions,
      new AboutFlowControl,
      new AboutCollectionsOperations,
      new AboutConstructors,
      new AboutLists,
      new AboutMaps,
      new AboutSets,
      new AboutSequencesAndArrays,
      new AboutOptions,
      new AboutPatternMatching,
      new AboutCaseClasses,
      new AboutHigherOrderFunctions,
      new AboutPartiallyAppliedFunctions,
      new AboutPartialFunctions,
      new AboutEnumerations,
      new AboutEmptyValues,
      new AboutParentClasses,
      new AboutNamedAndDefaultArguments,
      new AboutInfixPrefixAndPostfixOperators,
      new AboutInfixTypes,
      new AboutTypeSignatures,
      new AboutTraits,
      new AboutPreconditions,
      new AboutUniformAccessPrinciple,
      new AboutImplicits,
      new AboutInteroperability,
    )
}