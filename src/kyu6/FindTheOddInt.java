//Level kyu6
//link: https://www.codewars.com/kata/54da5a58ea159efa38000836/java

/*
Find the odd int
Description:
Given an array of integers, find the one that appears an odd number of times.

There will always be only one integer that appears an odd number of times.
Examples

[7] should return 7, because it occurs 1 time (which is odd).
[0] should return 0, because it occurs 1 time (which is odd).
[1,1,2] should return 2, because it occurs 1 time (which is odd).
[0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
[1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
 */

package kyu6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static java.util.Arrays.stream;

public class FindTheOddInt {
    public static int findIt(int[] a) {
        return stream(a).reduce(0, (x, y) -> x ^ y);
    }

    private static void doTest(int[] input, int expected) {
        String message = String.format("for array = %s\n", Arrays.toString(input));
        int actual = findIt(input);
        Assertions.assertEquals(expected, actual, message);
    }

    @Test
    public void sampleTests() {
        doTest(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}, 5);
        doTest(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}, -1);
        doTest(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}, 5);
        doTest(new int[]{10}, 10);
        doTest(new int[]{1,1,1,1,1,1,10,1,1,1,1}, 10);
        doTest(new int[]{5,4,3,2,1,5,4,3,2,10,10}, 1);
    }
}
