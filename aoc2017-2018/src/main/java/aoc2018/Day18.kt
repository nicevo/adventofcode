package aoc2018

import java.io.File

object Day18 {
    fun part1(input: List<String>): Int {
        return 1
    }

    fun part2(input: List<String>): Int {
        return 2
    }
}

fun main(args: Array<String>) {

    val inputFile = Day18::class.java.classLoader.getResource("aoc2018/day18")
    val input = File(inputFile.path).readLines()
    println("Part1: " + Day18.part1(input))
    println("Part2: " + Day18.part2(input))
}