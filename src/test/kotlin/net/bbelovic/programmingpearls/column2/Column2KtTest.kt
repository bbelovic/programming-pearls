package net.bbelovic.programmingpearls.column2

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource


class Column2KtTest {
    @ParameterizedTest
    @MethodSource("gdcTestData")
    fun testGcd(a: Int, b: Int, expectedGcd: Int) {
        val actualGcd = gcd(a, b)
        Assertions.assertEquals(expectedGcd, actualGcd)
    }

    companion object {
        @JvmStatic
        private fun gdcTestData() = listOf(Arguments{ arrayOf(8, 3, 1)})
    }
}