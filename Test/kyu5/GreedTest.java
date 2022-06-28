package kyu5;

import org.junit.jupiter.api.*;

public class GreedTest {
    @Test
    public void testExample() {
        Assertions.assertEquals(250, Greed.greedy(new int[]{5, 1, 3, 4, 1}), "Score for [5,1,3,4,1] must be 250:");
        Assertions.assertEquals(1100, Greed.greedy(new int[]{1, 1, 1, 3, 1}), "Score for [1,1,1,3,1] must be 1100:");
        Assertions.assertEquals(450, Greed.greedy(new int[]{2, 4, 4, 5, 4}), "Score for [2,4,4,5,4] must be 450:");
    }

    @Test
    public void testExampleOtherWay() {
        Assertions.assertEquals(250, Greed.greedyOther(new int[]{5, 1, 3, 4, 1}), "Score for [5,1,3,4,1] must be 250:");
        Assertions.assertEquals(1100, Greed.greedyOther(new int[]{1, 1, 1, 3, 1}), "Score for [1,1,1,3,1] must be 1100:");
        Assertions.assertEquals(450, Greed.greedyOther(new int[]{2, 4, 4, 5, 4}), "Score for [2,4,4,5,4] must be 450:");
    }
}
