package net.bbelovic.programmingpearls.column11.benchmark

import net.bbelovic.programmingpearls.column11.qsort1
import org.openjdk.jmh.annotations.*
import java.util.*
import kotlin.random.Random

@State(Scope.Thread)
@BenchmarkMode(value = [Mode.AverageTime])
@Warmup(iterations = 5)
@Fork(value = 3)
open class Column11Benchmark {
    private lateinit var input: Array<Int>
    @Benchmark
    fun sortUsingJdkSort() {
        Arrays.sort(input)
    }

    @Benchmark
    fun sortUsingQsort1() {
        qsort1(input, 0, input.size - 1)
    }

    @Setup
    fun prepareInput() {
        input = Array(1_000_000) {Random.nextInt(0, 10_000_000)}
    }
}