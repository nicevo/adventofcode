package aoc2018

import java.io.File

object Day20 {
    fun part1(input: List<String>): Int {
        return 1
    }

    fun part2(input: List<String>): Int {
        return 2
    }
}

fun main(args: Array<String>) {

    val imputFile = Day01::class.java.classLoader.getResource("aoc2018/day20")
    val input = File(imputFile.path).readLines()
    println("Part1: " + Day03.part1(input))
    println("Part2: " + Day03.part2(input))
}