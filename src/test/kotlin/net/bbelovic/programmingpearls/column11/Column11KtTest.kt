package net.bbelovic.programmingpearls.column11

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Column11KtTest {
    @Test
    fun testPartition() {
        val input = arrayOf(7, 2, 1, 9, 5, 3, 0)
        val actualM = partition(input, 0, input.size - 1)
        val expectedArray = arrayOf(0, 2, 1, 5, 3, 7, 9)
        assertEquals(5, actualM)
        assertArrayEquals(expectedArray, input)
    }

    @Test
    fun testQSort1() {
        val input = arrayOf(7, 2, 1, 9, 5, 3, 0)
        val expected = arrayOf(0, 1, 2, 3, 5, 7, 9)
        qsort1(input, 0, input.size - 1)
        assertArrayEquals(expected, input)

    }
}