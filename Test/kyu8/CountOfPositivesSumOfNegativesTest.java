package kyu8;

import org.junit.jupiter.api.*;

public class CountOfPositivesSumOfNegativesTest {
    @Test
    public void countPositivesSumNegatives_BasicTest() {
        int[] expectedResult = new int[] {10, -65};
        Assertions.assertArrayEquals(expectedResult, CountOfPositivesSumOfNegatives.countPositivesSumNegatives(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}));
    }

    @Test
    public void countPositivesSumNegatives_InputWithZeroes() {
        int[] expectedResult = new int[] {8, -50};
        Assertions.assertArrayEquals(expectedResult, CountOfPositivesSumOfNegatives.countPositivesSumNegatives(new int[] {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}));
    }

    @Test
    public void basicTestWithStream() {
        int[] expectedResult = new int[] {10, -65};
        Assertions.assertArrayEquals(expectedResult, CountOfPositivesSumOfNegatives.withStream(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}));
    }

    @Test
    public void inputWithZeroesWithStream() {
        int[] expectedResult = new int[] {8, -50};
        Assertions.assertArrayEquals(expectedResult, CountOfPositivesSumOfNegatives.withStream(new int[] {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}));
    }
}
