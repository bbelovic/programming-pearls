package net.bbelovic.programmingpearls.column4

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Column4KtTest {
    @ParameterizedTest
    @MethodSource("testData")
    fun testBSearch(arr: Array<Int>, searchedElement: Int, expectedPos: Int) {
        val actualPos = bsearch(searchedElement, arr)
        assertEquals(expectedPos, actualPos)
    }

    companion object {
        @JvmStatic
        private fun testData() = listOf(
                Arguments { arrayOf(Array(10) {x -> x+1}, 8,  7)},
                Arguments { arrayOf(Array(2) {x -> x+1}, 2, 1)},
                Arguments { arrayOf(Array(1) {x -> x+1}, 1, 0)},
                Arguments { arrayOf(Array(0) {x -> x+1}, 8, -1)}
        )
    }
}