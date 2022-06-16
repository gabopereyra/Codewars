package kyu8;

import org.junit.jupiter.api.*;

public class SquareSumTest {
    @Test
    public void testWithForLoop()
    {
        Assertions.assertEquals(9, SquareSum.squareSum(new int[] {1,2,2}));
        Assertions.assertEquals(5, SquareSum.squareSum(new int[] {1,2}));
        Assertions.assertEquals(50, SquareSum.squareSum(new int[] {5,-3,4}));
        Assertions.assertEquals(0, SquareSum.squareSum(new int[] {}));
    }

    @Test
    public void testWithStream()
    {
        Assertions.assertEquals(9, SquareSum.squareSumWithStream(new int[] {1,2,2}));
        Assertions.assertEquals(5, SquareSum.squareSumWithStream(new int[] {1,2}));
        Assertions.assertEquals(50, SquareSum.squareSumWithStream(new int[] {5,-3,4}));
        Assertions.assertEquals(0, SquareSum.squareSumWithStream(new int[] {}));
        Assertions.assertEquals(136, SquareSum.squareSumWithStream(new int[] {1,3,5,4,2,9}));
    }
}
