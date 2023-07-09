package com.mbti.codingtask


/**
 * Extension function to convert a [String] with intervals in format '[start,end]',
 * each separated a space into a [List] of [Interval] objects.
 *
 * @return [Interval] objects parsed from the given string.
 */
fun String.parseIntervalsToList(): List<Interval> {
    return trim().split(" ").filter { it.isNotBlank() }.map { intervalText ->
        val (start, end) = intervalText.removeSurrounding("[", "]").split(",", ";").map { it.toInt() }
        check(start <= end) { "Only intervals with a <= b for [a,b] are allowed" }
        Interval(start, end)
    }
}

/**
 * Extension function to convert a list of [Interval] objects to a human-readable string.
 *
 * @return [String] in a human-readable format. Example output: [2,23] [25,30].
 */
fun List<Interval>.formatToString(): String {
    return joinToString(" ") { interval ->
        val start = interval.first
        val end = interval.last
        "[$start,$end]"
    }
}
