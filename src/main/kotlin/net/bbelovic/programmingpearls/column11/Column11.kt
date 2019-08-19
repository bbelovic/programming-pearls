package net.bbelovic.programmingpearls.column11

fun qsort1(input: Array<Int>, l: Int, u: Int) {
    val m = partition(input)
    qsort1(input, 0, m - 1)
    qsort1(input, m + 1, m - 1)
}

fun partition(input: Array<Int>): Int {
    var m = 0
    val a = 1
    val t = input[0]
    val b = input.size - 1
    for (x in a..b) {
        if (input[x] < t) {
            swap(input , ++m, x)
        }
    }
    swap(input, 0, m)
    return m
}

private fun swap(input: Array<Int>, first: Int, second: Int) {
    val pom = input[first]
    input[first] = input[second]
    input[second] = pom
}