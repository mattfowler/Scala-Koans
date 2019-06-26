package org.functionalkoans.forscala

import org.functionalkoans.forscala.support.KoanSuite
import org.scalatest.Sequential

import scala.collection.immutable.IndexedSeq

class Koans extends Sequential {
  override val nestedSuites: IndexedSeq[KoanSuite] =
    IndexedSeq(
      new AboutAsserts,
      new AboutValAndVar,
      new AboutTuples,
      new AboutFunctions,
      new AboutConstructors,
      new AboutLists,
      new AboutMaps,
      new AboutSets,
      new AboutSequencesAndArrays,
      new AboutMutableMaps,
      new AboutMutableSets,
      new AboutOptions,
      new AboutPatternMatching,
      new AboutCaseClasses,
      new AboutHigherOrderFunctions,
      new AboutPartiallyAppliedFunctions,
      new AboutPartialFunctions,
      new AboutForExpressions,
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