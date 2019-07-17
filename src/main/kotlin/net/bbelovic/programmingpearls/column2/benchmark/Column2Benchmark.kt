package net.bbelovic.programmingpearls.column2.benchmark

import net.bbelovic.programmingpearls.column2.rotateLeft
import net.bbelovic.programmingpearls.column2.rotateLeft4
import org.openjdk.jmh.annotations.*

@State(value = Scope.Thread)
@BenchmarkMode(value = [Mode.Throughput])
open class Column2Benchmark {
    @Benchmark
    fun benchmarkColumn2_rotateLeft1() {
        val input = "abcdefgh".toCharArray()
        rotateLeft(input, 3)
    }

    @Benchmark
    fun benchmarkColumn2_rotateLeft4() {
        val input = "abcdefgh".toCharArray()
        rotateLeft4(input, 3)

    }
}