package net.bbelovic.programmingpearls.column2

import org.junit.Assert

class Column2KtTest {
    fun testGcd(): Unit {
        val actualGcd = gcd(8, 3)
        val expectedGcd = 1
        Assert.assertEquals(expectedGcd, actualGcd)
    }
}