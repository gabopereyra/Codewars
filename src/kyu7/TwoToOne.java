//LEVEL: kyu 7
//link: https://www.codewars.com/kata/5656b6906de340bd1b0000ac/train/java

/**
 * DESCRIPTION
 * Take 2 strings s1 and s2 including only letters from ato z.
 * Return a new sorted string, the longest possible,
 * containing distinct letters - each taken only once - coming from s1 or s2.

 Examples:

 a = "xyaabbbccccdefww"
 b = "xxxxyyyyabklmopq"
 longest(a, b) -> "abcdefklmopqwxy"

 a = "abcdefghijklmnopqrstuvwxyz"
 longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"
 */

package kyu7;

import java.util.stream.Collectors;

public class TwoToOne {
    public static String longest (String s1, String s2) {
        return (s1+s2).codePoints().distinct().mapToObj(c -> String.valueOf((char) c)).sorted().collect(Collectors.joining());
    }
}
