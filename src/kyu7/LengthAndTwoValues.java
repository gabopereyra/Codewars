//LEVEL: kyu 7
//link: https://www.codewars.com/kata/62a611067274990047f431a8/train/java

/**
 * DESCRIPTION
 * Given an integer n and two other values, build an array of size n filled with these two values alternating.
 *
 * Examples
 *
 * 5, true, false     -->  [true, false, true, false, true]
 * 10, "blue", "red"  -->  ["blue", "red", "blue", "red", "blue", "red", "blue", "red", "blue", "red"]
 * 0, "one", "two"    -->  []
 */

package kyu7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class LengthAndTwoValues {
        public static String[] alternate(int n, String firstValue, String secondValue) {
        String[] finalString = new String[n];
        int i = 0;

        while(i<n){
            finalString[i] = firstValue;
            if((i+1) != n){
                finalString[i+1] = secondValue;
            }
            i+=2;
        }

        return finalString;
    }
    public static String[] alternateWithStream(int n, String firstValue, String secondValue) {
        return java.util.stream.IntStream.range(0, n).mapToObj(i -> i % 2 == 0 ? firstValue : secondValue).toArray(String[]::new);
    }

    @Test
    void smallArray() {
        assertEquals(new String[]{"true", "false", "true", "false", "true"},
                5, "true", "false");
    }

    @Test
    void largerArray() {
        assertEquals(new String[]{"blue", "red", "blue", "red", "blue", "red", "blue", "red", "blue", "red", "blue", "red", "blue", "red", "blue", "red", "blue", "red", "blue", "red"},
                20, "blue", "red");
    }

    @Test
    void withZero() {
        assertEquals(new String[0], 0, "lemons", "apples");
    }

    private void assertEquals(String[] expected, int n, String firstValue, String secondValue) {
        String[] actual = alternate(n, firstValue, secondValue);
        Assertions.assertArrayEquals(expected, actual, String.format("For input (%d, \"%s\", \"%s\")%nExpected: %s%nActual: %s%n", n, firstValue, secondValue, Arrays.toString(expected), Arrays.toString(actual)));
    }

    @Test
    void smallArrayWithStream() {
        assertEqualsWithStream(new String[]{"true", "false", "true", "false", "true"},
                5, "true", "false");
    }

    @Test
    void largerArrayWithStream() {
        assertEqualsWithStream(new String[]{"blue", "red", "blue", "red", "blue", "red", "blue", "red", "blue", "red", "blue", "red", "blue", "red", "blue", "red", "blue", "red", "blue", "red"},
                20, "blue", "red");
    }

    @Test
    void withZeroWithStream() {
        assertEqualsWithStream(new String[0], 0, "lemons", "apples");
    }

    private void assertEqualsWithStream(String[] expected, int n, String firstValue, String secondValue) {
        String[] actual = alternateWithStream(n, firstValue, secondValue);
        Assertions.assertArrayEquals(expected, actual, String.format("For input (%d, \"%s\", \"%s\")%nExpected: %s%nActual: %s%n", n, firstValue, secondValue, Arrays.toString(expected), Arrays.toString(actual)));
    }
}
