package aoc2018

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class Day17Test {

    @Test
    fun part1() {
        val input = " /n ".split("\n")
        assertThat(Day17.part1(input)).isEqualTo(1)
    }

    @Test
    fun part2() {
        val input = " /n ".split("\n")
        assertThat(Day17.part2(input)).isEqualTo(2)
    }
}
