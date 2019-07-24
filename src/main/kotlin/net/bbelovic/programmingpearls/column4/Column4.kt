package net.bbelovic.programmingpearls.column4

import java.util.*

fun bsearch(t: Int, arr: Array<Int>): Int {
    return Arrays.binarySearch(arr, t)
}