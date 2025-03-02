//LEVEL: kyu 8
//link: https://www.codewars.com/kata/515e271a311df0350d00000f/train/java

/**DESCRIPTION
 * Complete the square sum function so that it squares each number passed into it and then sums the results together.
 *
 * For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.
 */

package kyu8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SquareSum {
    public static int squareSum(int[] n)
    {
        int sum = 0;
        for(int i=0; i<n.length; i++){
            sum += Math.pow(n[i], 2);
        }
        return sum;
    }

    public static int squareSumWithStream(int[] n)
    {
        return Arrays.stream(n).map(a -> (a*a)).sum();
    }

    @Test
    public void testWithForLoop()
    {
        Assertions.assertEquals(9, squareSum(new int[] {1,2,2}));
        Assertions.assertEquals(5, squareSum(new int[] {1,2}));
        Assertions.assertEquals(50, squareSum(new int[] {5,-3,4}));
        Assertions.assertEquals(0, squareSum(new int[] {}));
    }

    @Test
    public void testWithStream()
    {
        Assertions.assertEquals(9, squareSumWithStream(new int[] {1,2,2}));
        Assertions.assertEquals(5, squareSumWithStream(new int[] {1,2}));
        Assertions.assertEquals(50, squareSumWithStream(new int[] {5,-3,4}));
        Assertions.assertEquals(0, squareSumWithStream(new int[] {}));
        Assertions.assertEquals(136, squareSumWithStream(new int[] {1,3,5,4,2,9}));
    }
}
