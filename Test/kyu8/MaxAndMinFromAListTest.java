package kyu8;

import org.junit.jupiter.api.*;

public class MaxAndMinFromAListTest {

    private MaxAndMinFromAList exercise = new MaxAndMinFromAList();

    @Test
    public void testExamples() {
        Assertions.assertEquals(-110, exercise.min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        Assertions.assertEquals(0, exercise.min(new int[]{42, 54, 65, 87, 0}));
        Assertions.assertEquals(566, exercise.max(new int[]{4,6,2,1,9,63,-134,566}));
        Assertions.assertEquals(5, exercise.max(new int[]{5}));
    }

    @Test
    public void testExamplesWithStream() {
        Assertions.assertEquals(-110, exercise.minWithStream(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        Assertions.assertEquals(0, exercise.minWithStream(new int[]{42, 54, 65, 87, 0}));
        Assertions.assertEquals(566, exercise.maxWithStream(new int[]{4,6,2,1,9,63,-134,566}));
        Assertions.assertEquals(5, exercise.maxWithStream(new int[]{5}));
    }
}
