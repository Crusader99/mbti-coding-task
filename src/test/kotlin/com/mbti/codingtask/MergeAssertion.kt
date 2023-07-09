package com.mbti.codingtask

import kotlin.test.assertContentEquals


/**
 * Check if the given intervals are merged correctly.
 *
 * @param fromGivenInput - [Interval] objects that may be overlapping and should be merged
 * @param toExpectedOutput - Expected merged [Interval] objects that should not be overlapping
 */
fun assertMergeIntervals(fromGivenInput: List<Interval>, toExpectedOutput: List<Interval>) {
    val actualOutput = merge(fromGivenInput)
    val errorMessage = "Output intervals do not match expectations"
    assertContentEquals(toExpectedOutput, actualOutput, errorMessage)
}
