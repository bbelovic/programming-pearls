package net.bbelovic.programmingpearls.column1

import java.nio.file.Files
import java.nio.file.Path
import java.util.*

fun readLines(path: Path): List<Int> =
        Files.readAllLines(path)
                .map { i -> i.toInt() }
                .toList()

val bitSet = BitSet()

val toBitSet: (BitSet, Int) -> BitSet = { bs, x -> bs.set(x); bs}