//LEVEL: kyu 6
//link: https://www.codewars.com/kata/514b92a657cdc65150000006/train/java

/**DESCRIPTION
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in. Additionally, if the number is negative, return 0 (for languages that do have them).
 *
 * Note: If the number is a multiple of both 3 and 5, only count it once.
 */

package kyu6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class MultiplesOf3Or5 {
    public static int solution(int number) {
        int result = 0;
        if (number < 4) {
            return result;
        }
        for (int i = 3; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }
        return result;
    }

    public static int solutionWithStream(int number) {
        return IntStream.range(0, number)
                .filter(n -> (n % 3 == 0) || (n % 5 == 0))
                .sum();
    }

    @Test
    public void test() {
        Assertions.assertEquals(23, solution(10)); //3 5 6 9
        Assertions.assertEquals(78, solution(20)); //3 5 6 9 10 12 15 18
        Assertions.assertEquals(195, solution(30)); //3 5 6 9 10 12 15 18 20 21 24 25 27
    }

    @Test
    public void testWithStream() {
        Assertions.assertEquals(23, solutionWithStream(10)); //3 5 6 9
        Assertions.assertEquals(78, solutionWithStream(20)); //3 5 6 9 10 12 15 18
        Assertions.assertEquals(195, solutionWithStream(30)); //3 5 6 9 10 12 15 18 20 21 24 25 27
    }
}
