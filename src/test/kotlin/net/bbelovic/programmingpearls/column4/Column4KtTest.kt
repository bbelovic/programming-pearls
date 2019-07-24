package net.bbelovic.programmingpearls.column4

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Column4KtTest {
    @Test
    fun testBSearch() {
        val arr = Array(10) {x -> x+1}
        val actual = bsearch(8, arr)
        assertEquals(7, actual)
    }
}