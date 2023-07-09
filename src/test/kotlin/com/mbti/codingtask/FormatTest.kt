package com.mbti.codingtask

import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * Mercedes-Benz Tech Innovation: Coding Task
 *
 * This class contains JUnit 5 test units used to test the interval to string formatter for the console.
 */
class FormatTest {

    @Test
    fun testDataStructureToStringFormatting() {
        val inputIntervals = listOf(25..30, 2..19, 14..23, 4..8)
        val expectedOutput = "[25,30] [2,19] [14,23] [4,8]"
        val actualOutput = inputIntervals.formatToString()
        assertEquals(expectedOutput, actualOutput, "Formatting failed for $inputIntervals")
    }

}