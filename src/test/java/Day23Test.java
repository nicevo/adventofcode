import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class Day23Test {
    @Test
    public void testPart1() {
        assertEquals(0, Day23.part1(("").split("\n")));
    }

    @Test
    public void testPart2() throws IOException, InterruptedException {
        assertEquals(1, Day23.part2(("").split("\n")));

    }
}