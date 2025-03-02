//LEVEL: kyu 8
//link: https://www.codewars.com/kata/59342039eb450e39970000a6/train/java

/**DESCRIPTION
 * Given a number n, return the number of positive odd numbers below n, EASY!
 *
    Examples (Input -> Output)

    7  -> 3 (because odd numbers below 7 are [1, 3, 5])
    15 -> 7 (because odd numbers below 15 are [1, 3, 5, 7, 9, 11, 13])
 * Expect large Inputs!
 * */

package kyu8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountOddNumbers {
    public static int oddCount(int n){
        return n/2;
    }

    @Test
    public void fixedTests() {
        Assertions.assertEquals(7, oddCount(15));
        Assertions.assertEquals(7511, oddCount(15023));
    }
}
