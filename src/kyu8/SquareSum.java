//LEVEL: kyu 8
//link: https://www.codewars.com/kata/515e271a311df0350d00000f/train/java

/**DESCRIPTION
 * Complete the square sum function so that it squares each number passed into it and then sums the results together.
 *
 * For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.
 */

package kyu8;

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
}
