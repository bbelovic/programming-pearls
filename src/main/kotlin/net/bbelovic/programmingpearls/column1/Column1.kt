package net.bbelovic.programmingpearls.column1

import java.nio.file.Files
import java.nio.file.Path
import java.util.*
import java.util.stream.Collectors

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

