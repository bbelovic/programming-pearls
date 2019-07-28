package net.bbelovic.programmingpearls.column4.benchmark

import net.bbelovic.programmingpearls.column4.bsearch
import org.openjdk.jmh.annotations.*
import org.openjdk.jmh.annotations.Mode.AverageTime
import java.util.*

@State(Scope.Thread)
@BenchmarkMode(value = [AverageTime])
open class Column4Benchmark {
    private lateinit var arr: Array<Int>
    @Benchmark
    fun benchMarkColumn4_bsearch(): Int {
        return bsearch(8999, arr)
    }

    @Benchmark
    fun benchmarkColumn4_jdkBinarySearch(): Int {
        return Arrays.binarySearch(arr, 8999)
    }

    @Setup
    fun prepare() {
        arr =  Array(10_000) {x -> x + 1}
    }
}