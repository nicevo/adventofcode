package aoc2017;

import aoc2017.Day21;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class Day21Test {
    @Test
    public void testPart1() {
        assertEquals(0, Day21.part1(("../.# => ##./#../...\n" +
                ".#./..#/### => #..#/..../..../#..#").split("\n")));
    }

    @Test
    public void testPart2() throws IOException, InterruptedException {
        assertEquals(1, Day21.part2(("").split("\n")));


    }
}