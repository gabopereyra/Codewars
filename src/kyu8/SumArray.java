//LEVEL: kyu 8
//link: https://www.codewars.com/kata/53dc54212259ed3d4f00071c/train/java

/**DESCRIPTION
 * Write a function that takes an array of numbers and returns the sum of the numbers.
 * The numbers can be negative or non-integer. If the array does not contain any numbers then you should return 0.
 *
 Examples:
 Input: [1, 5.2, 4, 0, -1]
 Output: 9.2

 Input: []
 Output: 0

 Input: [-2.398]
 Output: -2.398

 Assumptions
 You can assume that you are only given numbers.
 You cannot assume the size of the array.
 You can assume that you do get an array and if the array is empty, return 0.

 Tests expect accuracy of 1e-4.
 What We're Testing

 We're testing basic loops and math operations. This is for beginners who are just learning loops and math operations.
 Advanced users may find this extremely easy and can easily write this in one line.
 */

package kyu8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SumArray {
    public static double sum(double[] numbers) {
        double sum = 0.0;
        for(int i=0; i<numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }

    public static double sumWithStream(double[] numbers) {
        return Arrays.stream(numbers).sum();
    }

    @Test
    public void testSum() {
        Assertions.assertEquals(0,      sum(new double[] { }),                1e-4);
        Assertions.assertEquals(-2.398, sum(new double[] {-2.398}),           1e-4);
        Assertions.assertEquals(6,      sum(new double[] {1, 2, 3}),          1e-4);
        Assertions.assertEquals(6.6,    sum(new double[] {1.1, 2.2, 3.3}),    1e-4);
        Assertions. assertEquals(9.2,    sum(new double[] {1, 5.2, 4, 0, -1}), 1e-4);
        Assertions.assertEquals(320,    sum(new double[] {30, 89, 100, 101}), 1e-4);
    }

    @Test
    public void testSumWithStream() {
        Assertions.assertEquals(0,      sumWithStream(new double[] { }),                1e-4);
        Assertions.assertEquals(-2.398, sumWithStream(new double[] {-2.398}),           1e-4);
        Assertions.assertEquals(6,      sumWithStream(new double[] {1, 2, 3}),          1e-4);
        Assertions.assertEquals(6.6,    sumWithStream(new double[] {1.1, 2.2, 3.3}),    1e-4);
        Assertions. assertEquals(9.2,    sumWithStream(new double[] {1, 5.2, 4, 0, -1}), 1e-4);
        Assertions.assertEquals(320,    sumWithStream(new double[] {30, 89, 100, 101}), 1e-4);
    }
}
