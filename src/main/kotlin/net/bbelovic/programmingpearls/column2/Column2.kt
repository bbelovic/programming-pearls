package net.bbelovic.programmingpearls.column2

fun rotateLeft(arr: CharArray, moves: Int) {
    for (j in 0 until moves) {
        val c = arr[0]
        for (i in 1 until arr.size) {
            arr[i - 1] = arr[i]
        }
        arr[arr.size - 1] = c
    }
}

fun main() {
    val arr = charArrayOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h')
    rotateLeft(arr, 1)
    print(arr)
}