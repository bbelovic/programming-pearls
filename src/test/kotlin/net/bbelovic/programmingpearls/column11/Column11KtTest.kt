package net.bbelovic.programmingpearls.column11

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.random.Random

internal class Column11KtTest {
    @ParameterizedTest
    @MethodSource("testDataPartition")
    fun testPartition(input: Array<Int>, l: Int, u: Int, expectedArray: Array<Int>, expectedM: Int) {
        val actualM = partition(input, l, u)
        assertEquals(expectedM, actualM)
        assertArrayEquals(expectedArray, input)
    }

    companion object {
        @JvmStatic
        private fun testDataPartition() = listOf(
                Arguments { arrayOf(arrayOf(7, 2, 1, 9, 5, 3, 0), 0, 6, arrayOf(0, 2, 1, 5, 3, 7, 9), 5) },
                Arguments { arrayOf(arrayOf(7, 2, 1, 9), 0, 3, arrayOf(1, 2, 7, 9), 2) },
                Arguments { arrayOf(arrayOf(5, 3, 0), 0, 2, arrayOf(0, 3, 5), 2) }
        )

        @JvmStatic
        private fun testDataQSort() = listOf(
                Arguments { arrayOf(arrayOf(7, 2, 1, 9, 5, 3, 0), arrayOf(0, 1, 2, 3, 5, 7, 9)) },
                Arguments { arrayOf(arrayOf(7, 7, 7, 7, 7, 7, 7), arrayOf(7, 7, 7, 7, 7, 7, 7)) },
                Arguments { arrayOf(arrayOf(7, 2), arrayOf(2, 7)) },
                Arguments { arrayOf(arrayOf(1), arrayOf(1)) },
                Arguments { arrayOf(emptyArray(), emptyArray<Int>()) }
        )
    }

    @ParameterizedTest
    @MethodSource("testDataQSort")
    fun testQSort1(input: Array<Int>, expected: Array<Int>) {
        qsort1(input, 0, input.size - 1)
        assertArrayEquals(expected, input)
    }

    @Test
    fun testLargeInput() {
        val input = Array(1_000_000) { i -> Random.nextInt(0, 10_000_000)}
        qsort1(input, 0, input.size - 1)

    }
}