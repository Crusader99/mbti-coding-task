package com.mbti.codingtask

import kotlin.system.exitProcess


/**
 * Entry point of a simple console application for testing interval merging.
 */
fun main(args: Array<String>) {
    println("Welcome to the Interval Merge Application!")

    val inputString = args.joinToString(" ")
    if (inputString.isBlank()) {
        // Don't cancel, because the user may want to provide an empty list of intervals
        System.err.println("Warn: Empty list of intervals provided!")
        System.err.println("Please enter intervals in the format '[start,end]', each separated a space.")
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
