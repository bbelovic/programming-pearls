package net.bbelovic.programmingpearls.column2.benchmark

import net.bbelovic.programmingpearls.column2.rotateLeft
import net.bbelovic.programmingpearls.column2.rotateLeft4
import org.openjdk.jmh.annotations.*

@State(value = Scope.Thread)
@BenchmarkMode(value = [Mode.AverageTime])
@Warmup(iterations = 5)
@Fork(value = 2)
open class Column2Benchmark {
    @Benchmark
    fun benchmarkColumn2_rotateLeft1() {
        val input = "abcdefghijklmnoprstuvxyz1234567890abcdefghijklmnoprstuvxyz1234567890".toCharArray()
        rotateLeft(input, 8)
    }

    @Benchmark
    fun benchmarkColumn2_rotateLeft4() {
        val input = "abcdefghijklmnoprstuvxyz1234567890abcdefghijklmnoprstuvxyz1234567890".toCharArray()
        rotateLeft4(input, 8)
    }
}