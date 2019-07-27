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
    var i = 0
    var t = arr[i]
    var rotated = 0
    var cnt = 1
    var srcIdx = (cnt * moves) % arr.size
    var destIdx = i % arr.size

    while (true) {
        arr[destIdx] = arr[srcIdx]
        ++rotated
        cnt += 1
        destIdx = srcIdx
        srcIdx = (cnt * moves ) % arr.size
        if (srcIdx == 0) {
            arr[destIdx] = t
            i += 1
            t = arr[i]
//            break
            destIdx = i % arr.size
            cnt = 1
            srcIdx = (cnt * moves) % arr.size
            rotated += 1
        }
        if (rotated == arr.size) {
            break
        }
    }
}

fun rotateLeft3(arr: CharArray, moves: Int) {
    for (i in 0 until gcd(arr.size, moves)) {
        var dest = i
        val c = arr[dest]
        while (true) {
            val src = moves + dest
            if (src % arr.size == i) {
                arr[dest % arr.size] = c
                break
            } else {
                arr[dest % arr.size] = arr[src % arr.size]
            }
            dest = src
        }
    }
}

fun rotateLeft4(arr: CharArray, moves: Int) {
    for (i in 0 until gcd(arr.size, moves)) {
        val t = arr[i]
        var j = i
        while (true) {
            val k = (j + moves) % arr.size
            if (k == i) break
            arr[j] = arr[k]
            j = k
        }
        arr[j] = t
    }
}

fun gcd(a: Int, b: Int): Int {
    var x = a
    var y = b
    while (x % y != 0) {
        val rem = x % y
        x = y
        y = rem
    }
    return y
}