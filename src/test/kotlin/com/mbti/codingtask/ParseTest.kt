package com.mbti.codingtask

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertFails


/**
 * Mercedes-Benz Tech Innovation: Coding Task
 *
 * This class contains JUnit 5 test units used to test the interval parse algorithm for the console.
 */
class ParseTest {

    @Test
    fun testStringToDataStructureParsing() {
        val inputText = "[25,30] [2,19] [14,23] [4,8]"
        val expectedOutput = listOf(25..30, 2..19, 14..23, 4..8)
        val actualOutput = inputText.parseIntervalsToList()
        assertContentEquals(expectedOutput, actualOutput, "Parsing failed for $inputText")
    }

    @Test
    fun testInvalidDownwardInterval() {
        // Ensure an error is thrown when creating an invalid interval
        // Only intervals with a <= b for [a,b] are allowed
        assertFails {
            "[10,5]".parseIntervalsToList()
        }
    }

}
