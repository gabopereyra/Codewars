//LEVEL: kyu 6
//link: https://www.codewars.com/kata/525f47c79f2f25a4db000025/train/java

/**DESCRIPTION
 * Write a function that accepts a string, and returns true if it is in the form of a phone number.
 * Assume that any integer from 0-9 in any of the spots will produce a valid phone number.
 *
 * Only worry about the following format:
 * (123) 456-7890 (don't forget the space after the close parentheses)
 *
 * Examples:
 * "(123) 456-7890"  => true
 * "(1111)555 2345"  => false
 * "(098) 123 4567"  => false
 */

package kyu6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPhoneNumber {
    public static boolean validPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\(\\d{3}\\)\\s\\d{3}-\\d{4}");
    }
}
