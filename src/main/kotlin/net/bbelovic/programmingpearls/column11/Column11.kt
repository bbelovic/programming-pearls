package net.bbelovic.programmingpearls.column11

fun qsort1(input: Array<Int>, l: Int, u: Int) {
    if (l >= u) return
    val m = partition(input, l, u)
    qsort1(input, l, m - 1)
    qsort1(input, m + 1, u)
}

fun partition(input: Array<Int>, l: Int, u: Int): Int {
    val a = l + 1
    var m = l
    val t = input[m]
    val b = u
    for (x in a..b) {
        if (input[x] < t) {
            swap(input , ++m, x)
        }
    }
    swap(input, l, m)
    return m
}

private fun swap(input: Array<Int>, first: Int, second: Int) {
    val pom = input[first]
    input[first] = input[second]
    input[second] = pom
}