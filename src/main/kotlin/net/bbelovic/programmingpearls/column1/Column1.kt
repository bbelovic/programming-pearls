package net.bbelovic.programmingpearls.column1

import java.io.PrintWriter
import java.nio.file.Files
import java.nio.file.Paths
import java.util.*
import java.util.stream.Collectors
import java.util.stream.LongStream

val bitSet = BitSet()

val toBitSet: (BitSet, Int) -> BitSet = { bs, x -> bs.set(x); bs}


fun readLines(input: List<String>): BitSet {
    return input.asSequence()
            .map { i -> i.toInt() }
            .fold(BitSet()) { bs: BitSet, x: Int -> bs.set(x); bs}
}

fun sorted(bitSet: BitSet): List<Int> {
    return bitSet
            .stream()
            .boxed()
            .sorted()
            .collect(Collectors.toList<Int>())
}

fun generateRandomNumbers(): LongStream {
    val lower = 999_999L
    val upper = 10_000_000L
    val rnd = Random()
    return rnd.longs(20, lower, upper)
}

fun write(file: String) {
    try {
        val pw = PrintWriter(file)
        generateRandomNumbers().forEach { value -> pw.println(value.toString()) }
        pw.flush()
    } catch (e: Exception) {
        e.printStackTrace()
    }

}


fun main() {
    val reader = Files.newBufferedReader(Paths.get("abc2.txt"))
    val bitSet = BitSet()


    val result = reader.lineSequence()
            .map { i -> i.toInt() }
            .fold(bitSet, toBitSet)
    val writer = Files.newBufferedWriter(Paths.get("result3.txt"))


    writer.use {
        val sorted = sorted(result)
        for (x in sorted) {
            it.write(x.toString())
            it.newLine()
        }
    }

}