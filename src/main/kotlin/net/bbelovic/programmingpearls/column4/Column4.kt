package net.bbelovic.programmingpearls.column4

fun bsearch(t: Int, arr: Array<Int>): Int {
    var l = 0
    var u = arr.size - 1
    while (l <= u) {
        val m = (l + u) / 2
        when {
            arr[m] == t -> return m
            arr[m] < t -> l = m + 1
            else -> u = m - 1
        }
    }
    return -1
}