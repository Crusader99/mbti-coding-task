package com.mbti.codingtask

import com.mbti.codingtask.utils.assertMergeIntervals
import kotlin.test.Test


/**
 * Mercedes-Benz Tech Innovation: Coding Task
 *
 * This class contains JUnit 5 test units used to find bugs in interval merge algorithm. The
 * tests use the helper function [assertMergeIntervals] to reuse the same test logic and make
 * the code more readable. The test methode names explain what is tested in a specific test
 * unit.
 */
class MergeTest {

    @Test
    fun testGivenExampleFromTaskSheet() = assertMergeIntervals(
        fromGivenInput = listOf(25..30, 2..19, 14..23, 4..8),
        toExpectedOutput = listOf(2..23, 25..30)
    )

    @Test
    fun testEmptyInputIntervalList() = assertMergeIntervals(
        fromGivenInput = emptyList(),
        toExpectedOutput = emptyList()
    )

    @Test
    fun testSingleIntervalInput() = assertMergeIntervals(
        fromGivenInput = listOf(2..19),
        toExpectedOutput = listOf(2..19)
    )

    @Test
    fun testIntervalsWithSameBorder() = assertMergeIntervals(
        fromGivenInput = listOf(2..19, 19..29, 1..2),
        toExpectedOutput = listOf(1..29)
    )

    @Test
    fun testNonOverlappingIntervals() = assertMergeIntervals(
        fromGivenInput = listOf(2..3, 4..5),
        toExpectedOutput = listOf(2..3, 4..5)
    )

    @Test
    fun testSmallIntervals() = assertMergeIntervals(
        fromGivenInput = listOf(2..2, 3..3),
        toExpectedOutput = listOf(2..2, 3..3)
    )

    @Test
    fun testSameInterval() = assertMergeIntervals(
        fromGivenInput = listOf(2..2, 2..2),
        toExpectedOutput = listOf(2..2)
    )

    @Test
    fun testIgnoreFirstIntervalBecauseSameStart() = assertMergeIntervals(
        fromGivenInput = listOf(2..2, 2..3),
        toExpectedOutput = listOf(2..3)
    )

    @Test
    fun testIgnoreFirstIntervalBecauseSameEnd() = assertMergeIntervals(
        fromGivenInput = listOf(3..3, 2..3),
        toExpectedOutput = listOf(2..3)
    )

    @Test
    fun testIgnoreLastIntervalBecauseSameEnd() = assertMergeIntervals(
        fromGivenInput = listOf(2..3, 3..3),
        toExpectedOutput = listOf(2..3)
    )

    @Test
    fun testIgnoreLastIntervalBecauseSameStart() = assertMergeIntervals(
        fromGivenInput = listOf(2..3, 2..2),
        toExpectedOutput = listOf(2..3)
    )


}
