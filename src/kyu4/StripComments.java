//LEVEL: kyu 4
//link: https://www.codewars.com/kata/51c8e37cee245da6b40000bd/train/java

/*DESCRIPTION
Complete the solution so that it strips all text that follows any of a set of comment markers passed in.
Any whitespace at the end of the line should also be stripped out.

Example:

Given an input string of:

apples, pears # and bananas
grapes
bananas !apples

 */

package kyu4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StripComments {
    public static String stripComments(String text, String[] commentSymbols) {
        String regex = Arrays.stream(commentSymbols).
                map(a -> a.matches("[a-zA-Z]") ? (a += ".*") : "\\"+(a += ".*"))
                .collect(Collectors.joining("|"));

        return Arrays.asList(text.split("\n"))
                .stream()
                .map(a -> a.replaceAll(regex, "").stripTrailing())
                .collect(Collectors.joining("\n"));
    }

    @Test
    public void stripComments() throws Exception {
        Assertions.assertEquals(
                "apples, pears\ngrapes\nbananas",
                stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", new String[]{"#", "!"})
        );

        Assertions.assertEquals(
                "a\nc\nd",
                stripComments("a #b\nc\nd $e f g", new String[]{"#", "$"})
        );

    }
}
