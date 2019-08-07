package net.bbelovic.programmingpearls.column11

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class Column11KtTest {
    @Test
    fun testPartition() {
        val input = arrayOf(7, 2, 1, 9, 5, 3, 0)
        partition(input)
        val expected = arrayOf(0, 2, 1, 5, 3, 7, 9)
        Assertions.assertArrayEquals(expected, input)
    }
}