package aoc2017;

import aoc2017.Day15;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Day15Test {
    @Test
    public void testPart1() {
        assertEquals(1352636452, Day15.genNext(65 ,Day15.genA, Day15.multA));
        assertEquals(1992081072, Day15.genNext(1352636452 , Day15.genA, Day15.multA));
//        assertEquals(245556042, aoc2017.Day15.genNext(1181022009 ,aoc2017.Day15.genA));
//        assertEquals(1181022009, aoc2017.Day15.genNext(1092455 ,aoc2017.Day15.genA));
//        assertEquals(1181022009, aoc2017.Day15.genNext(1092455 ,aoc2017.Day15.genA));
//        assertEquals(430625591, aoc2017.Day15.genNext(8921 ,aoc2017.Day15.genB));
//        assertEquals("1010101101100111", aoc2017.Day15.getlast16bits(1092455));
//        assertEquals("1101001100110111", aoc2017.Day15.getlast16bits(430625591));
//        assertEquals("1111011100111001", aoc2017.Day15.getlast16bits(1181022009));
//        assertEquals("1000010110001000", aoc2017.Day15.getlast16bits(1233683848));

//        assertEquals(1, aoc2017.Day15.part1(1,2));
    }

    @Test
    public void testPart2() {
        assertEquals(2, Day15.part2(""));
    }
}