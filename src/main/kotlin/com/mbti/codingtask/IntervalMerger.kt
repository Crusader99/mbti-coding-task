package com.mbti.codingtask

import java.util.*


/**
 * Reuse existing [IntRange] class from standard library as interval.
 */
typealias Interval = IntRange

/**
 * Algorithm that merges overlapping intervals, while non-overlapping intervals remain unchanged.
 *
 * @param intervals - Multiple [Interval] objects that may intersect.
 * @return List of [Interval] objects that do not intersect.
 */
fun merge(intervals: List<Interval>): List<Interval> {
    // Sort intervals based on their start value
    val sortedIntervals = intervals.ifEmpty { return emptyList() }.sortedBy { it.first }

    // Initialize result list with the first interval
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