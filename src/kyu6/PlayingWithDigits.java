//LEVEL: kyu 6
//link: https://www.codewars.com/kata/5552101f47fc5178b1000050/train/java

/**
 * DESCRIPTION
 * Some numbers have funny properties. For example:
 * 89 --> 8¹ + 9² = 89 * 1
 * 695 --> 6² + 9³ + 5⁴= 1390 = 695 * 2
 * 46288 --> 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 51
 *
 * Given a positive integer n written as abcd... (a, b, c, d... being digits) and a positive integer p
 * we want to find a positive integer k, if it exists, such that the sum of the digits of n taken to the successive powers of p is equal to k * n.
 *
 * In other words:
 * Is there an integer k such as : (a ^ p + b ^ (p+1) + c ^(p+2) + d ^ (p+3) + ...) = n * k
 *
 * If it is the case we will return k, if not return -1.
 * Note: n and p will always be given as strictly positive integers.
 */

package kyu6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayingWithDigits {
    public static long digPow(int n, int p) {
        char[] digits = String.valueOf(n).toCharArray();
        int sum = 0;
        for (int i = 0; i<digits.length; i++){
            int myInt = Character.getNumericValue(digits[i]);
            sum += Math.pow(myInt, (p+i));
        }
        int division = sum/n;
        if(division*n == sum){
            return division;
        }
        return -1;
    }

    @Test
    public void Test1() {
        Assertions.assertEquals(1, digPow(89, 1));
    }
    @Test
    public void Test2() {
        Assertions.assertEquals(-1, digPow(92, 1));
    }
    @Test
    public void Test3() {
        Assertions.assertEquals(51, digPow(46288, 3));
    }
}
