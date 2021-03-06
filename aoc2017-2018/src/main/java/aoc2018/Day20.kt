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

    val inputFile = Day20::class.java.classLoader.getResource("aoc2018/day20")
    val input = File(inputFile.path).readLines()
    println("Part1: " + Day20.part1(input))
    println("Part2: " + Day20.part2(input))
}