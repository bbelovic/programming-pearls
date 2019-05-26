package net.bbelovic.programmingpearls.column1

import java.io.PrintWriter
import java.nio.file.Files
import java.nio.file.Paths
import java.util.*
import java.util.stream.Collectors
import java.util.stream.LongStream

val bitSet = BitSet()


fun generateRandomNumbers(): LongStream {
    val lower = 999_999L
    val upper = 10_000_000L
    val rnd = Random()
    return rnd.longs(20, lower, upper)
}

fun fileAsSequence(filename: String) = Files.newBufferedReader(Paths.get(filename)).lineSequence()

fun foldToBitmap(fileLines: Sequence<String>): BitSet {
    val bitSet = BitSet()
    return fileLines.map { line -> line.toInt() }
            .fold(bitSet) {bs, x -> bs.set(x); bs}
}

fun writeBitmap(filename: String, bitSet: BitSet) {
    val writer = Files.newBufferedWriter(Paths.get(filename))
    writer.use {
        val wr = it
        bitSet.stream().forEach { wr.write(it.toString()); wr.newLine()}
    }
}

fun main() {
    val sequence = fileAsSequence("abc.txt")
    val bitmap = foldToBitmap(sequence)
    writeBitmap("actual.txt", bitmap)
}