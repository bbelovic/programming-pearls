package net.bbelovic.programmingpearls.column2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource


class Column2KtTest {
    @ParameterizedTest
    @MethodSource("gdcTestData")
    fun testGcd(a: Int, b: Int, expectedGcd: Int) {
        val actualGcd = gcd(a, b)
        assertEquals(expectedGcd, actualGcd)
    }


    @Test
    fun testRotateLeft() {
        val input = "abcdefghijklmnoprstuvxyz1234567890".toCharArray()
        rotateLeft2(input, 8)
        val expected = "ijklmnoprstuvxyz1234567890abcdefgh".toCharArray()
        assertEquals(expected, input)
    }

    companion object {
        @JvmStatic
        private fun gdcTestData() = listOf(
                Arguments{ arrayOf(8, 3, 1)},
                Arguments{ arrayOf(3, 8, 1)},
                Arguments{ arrayOf(48, 18, 6)},
                Arguments{ arrayOf(34, 8, 2)},
                Arguments{ arrayOf(9, 4, 1)}
        )
    }
}