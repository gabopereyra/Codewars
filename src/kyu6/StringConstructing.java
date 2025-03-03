//Level kyu6
//link: https://www.codewars.com/kata/58a3a735cebc0630830000c0/train

/*
String Constructing
You are given two string 'a' an 's'. Starting with an empty string we can do the following two operations:
    append the given string a to the end of the current string.
    erase one symbol of the current string.

Your task is to find the least number of operations needed to construct the given string s.
Assume that all the letters from s appear in a at least once.

For a = "aba", s = "abbaab", the result should be 6.
    "" -> "aba" -> "ab" -> "ababa" -> "abba" -> "abbaaba" -> "abbaab".

For a = "aba", s = "a", the result should be 3.
    "" -> "aba" -> "ab" -> "a".

For a = "aba", s = "abaa", the result should be 4
    "" -> "aba" -> "abaaba" -> "abaab" -> "abaa".


 */

package kyu6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class StringConstructing {
    public static int stringConstructing(String a, String s) {
        StringBuilder current = new StringBuilder(a);
        var sList = s.toCharArray();
        int operations = 1;

        while (!current.toString().equals(s)) {
            if (s.startsWith(current.toString())) {
                current.append(a);
            } else {
                var aList = current.toString().toCharArray();
                var diff = Arrays.mismatch(aList, sList);
                current.deleteCharAt(diff);
            }
            operations++;
        }

        return operations;
    }


    @Test
    void testFromExample() {
        Assertions.assertEquals(9, stringConstructing("aba", "abbabba"));
        Assertions.assertEquals(4, stringConstructing("aba", "abaa"));
        Assertions.assertEquals(3, stringConstructing("aba", "a"));
        Assertions.assertEquals(1, stringConstructing("a", "a"));
        Assertions.assertEquals(3, stringConstructing("a", "aaa"));
        Assertions.assertEquals(64, stringConstructing("abcdefgh", "hgfedcba"));
        Assertions.assertEquals(288, stringConstructing("sxdfcgdgxdfgdxxf", "xgdfsxgdxgfsgdfxgfdgfgdfgdgsdfxgfdxgdfxgdgdfgdfxgsdxgdfxgfgsxfgdfgsdfxgdfxgsgsfgxsgsdxgsdfxgsgsdfxgsdfx"));
        Assertions.assertEquals(12, stringConstructing("bbaabcbcbc", "bbcccbabcc"));
    }
}


