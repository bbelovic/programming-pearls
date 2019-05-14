package net.bbelovic.programmingpearls.column1

import java.nio.file.Files
import java.nio.file.Path

fun readLines(path: Path): List<Int> =
        Files.readAllLines(path)
                .map { i -> i.toInt() }
                .toList()

fun mapToBitMap