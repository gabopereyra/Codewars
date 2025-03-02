//LEVEL: kyu 8
//link: https://www.codewars.com/kata/5265326f5fda8eb1160004c8/train/java

/*DESCRIPTION
* Write a function that accepts an array of 10 integers (between 0 and 9),
* that returns a string of those numbers in the form of a phone number.

Example
Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"

The returned format must be correct in order to complete this challenge.
Don't forget the space after the closing parentheses!
* */

package kyu8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConvertNumberToString {
    public static String numberToString(int num) {
        return String.valueOf(num);
    }

    @Test
    public void tests() {
        Assertions.assertEquals("67", numberToString(67));
        Assertions.assertEquals("123", numberToString(123));
        Assertions.assertEquals("999", numberToString(999));
    }
}
