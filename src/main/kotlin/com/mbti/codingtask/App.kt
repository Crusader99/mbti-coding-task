package com.mbti.codingtask

/**
 * Entry point of this Kotlin application.
 */
fun main() {
    val intervals = listOf(25..30, 2..19, 14..23, 4..8)
    println(merge(intervals))
}

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
    TODO("Currently not implemented")
}