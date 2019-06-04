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

fun rotateLeft2(arr: CharArray, moves: Int) {
    val t = arr[0]
    var rotated = 0
    var cnt = 0
    while (true) {
        val srcIdx = ((cnt+1) * moves) % arr.size
        val destIdx = (cnt * moves) % arr.size

        arr[destIdx] = arr[srcIdx]
        ++rotated
        cnt += 1
        if (srcIdx == 0) {
            arr[destIdx] = t
            break
        }
    }
    println("rotated: $rotated")

}

fun main() {
    val arr = charArrayOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h')
    rotateLeft2(arr, 3)
    print(arr)
}