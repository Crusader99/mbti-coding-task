package com.mbti.codingtask

import kotlin.system.exitProcess


/**
 * Entry point of a simple console application for testing interval merging.
 */
fun main(args: Array<String>) {
    println("Welcome to the Interval Merge Application!")

    val inputString = args.joinToString(" ")
    if (inputString.isBlank()) {
        System.err.println("No input arguments provided!")
        System.err.println("Please enter intervals that should be merged in the format '[start,end]', each separated a space.")
        exitProcess(1)
    }

    // Parse console input with error handling
    val inputIntervals = try {
        inputString.parseIntervalsToList()
    } catch (ex: Exception) {
        System.err.println("Invalid input format!")
        ex.printStackTrace()
        exitProcess(1)
    }

    val mergedIntervals = merge(inputIntervals)
    println("Input: ${inputIntervals.formatToString()}")
    println("Output: ${mergedIntervals.formatToString()}")
}

/**
 * Extension function to convert a [String] with intervals in format '[start,end]',
 * each separated a space into a [List] of [Interval] objects.
 *
 * @return [Interval] objects parsed from the given string.
 */
private fun String.parseIntervalsToList(): List<Interval> {
    return trim().split(" ").filter { it.isNotBlank() }.map { intervalText ->
        val (start, end) = intervalText.removeSurrounding("[", "]").split(",", ";").map { it.toInt() }
        Interval(start, end)
    }
}

/**
 * Extension function to convert a list of [Interval] objects to a human-readable string.
 *
 * @return String in a human-readable format. Example output: [2,23] [25,30].
 */
private fun List<Interval>.formatToString(): String {
    return joinToString(" ") { interval ->
        val start = interval.first
        val end = interval.last
        "[$start,$end]"
    }
}