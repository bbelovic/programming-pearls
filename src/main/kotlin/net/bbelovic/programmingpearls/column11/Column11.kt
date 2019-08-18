package net.bbelovic.programmingpearls.column11

fun partition(input: Array<Int>) {
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

}

private fun swap(input: Array<Int>, first: Int, second: Int) {
    val pom = input[first]
    input[first] = input[second]
    input[second] = pom
}