package com.mbti.codingtask

import java.util.*


/**
 * Reuse existing [IntRange] class from standard library as interval.
 */
typealias Interval = IntRange

/**
 * Algorithm that merges overlapping intervals, while non-overlapping intervals remain unchanged.
 * Example:
 * - Input: [25,30] [2,19] [14,23] [4,8]
 * - Output: [2,23] [25,30]
 * Assumptions:
 * - Intervals are always integer based.
 * - The first number of an interval is always less or equals to the second number. (a <= b for [a,b])
 *
 * @param intervals - Multiple [Interval] objects that may intersect.
 * @return List of [Interval] objects that do not intersect.
 */
fun merge(intervals: List<Interval>): List<Interval> {
    // Sort intervals based on their start value
    val sortedIntervals = intervals.ifEmpty { return emptyList() }.sortedBy { it.first }

    // Initialize result list with the first interval
    // Using a LinkedList because is can be expanded more efficiently compared to an ArrayList
    val mergedIntervals = LinkedList<IntRange>().apply { this += sortedIntervals.first() }

    // Iterate over the remaining intervals
    for (currentInterval in sortedIntervals.asSequence().drop(1)) {
        val lastMergedInterval = mergedIntervals.last()

        // Check if the current interval overlaps with the last merged interval
        if (currentInterval.first <= lastMergedInterval.last) {
            // Update the end time of the last merged interval if needed
            if (currentInterval.last > lastMergedInterval.last) {
                // Create new interval insteadof modifying interval to prevent possible side effects on caller side
                mergedIntervals[mergedIntervals.lastIndex] = lastMergedInterval.first..currentInterval.last
            }
        } else {
            // Add because interval does not overlap
            mergedIntervals += currentInterval
        }
    }

    return mergedIntervals
}
