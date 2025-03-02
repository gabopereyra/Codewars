//LEVEL: kyu 6
//link: https://www.codewars.com/kata/545cedaa9943f7fe7b000048/train/java

/*DESCRIPTION
A pangram is a sentence that contains every single letter of the alphabet at least once.
For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram,
because it uses the letters A-Z at least once (case is irrelevant).

Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
 */

package kyu6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class PangramChecker {
    public boolean check(String sentence){
         return (Arrays.stream(sentence.split(""))
                 .map(String::toLowerCase).distinct()
                 .filter(value -> value.matches("[a-z]")).count()) == 26;
    }

    @Test
    public void test1() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        Assertions.assertEquals(true, check(pangram1));
    }
    @Test
    public void test2() {
        String pangram2 = "You shall not pass!";
        Assertions. assertEquals(false, check(pangram2));
    }
}
