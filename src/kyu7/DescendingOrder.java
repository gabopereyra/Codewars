//LEVEL: kyu 7
//link: https://www.codewars.com/kata/5467e4d82edf8bbf40000155/train/java

/*DESCRIPTION
Your task is to make a function that can take any non-negative integer as an argument and return it with
its digits in descending order. Essentially, rearrange the digits to create the highest possible number.

Examples:
Input: 42145 Output: 54421
Input: 145263 Output: 654321
Input: 123456789 Output: 987654321
 */

package kyu7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        return Integer.parseInt(String.valueOf(num)
                .chars().mapToObj(a -> String.valueOf((char) a))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining("")));
    }

    @Test
    public void test_01() {
        Assertions.assertEquals(0, sortDesc(0));
    }

    @Test
    public void test_02() {
        Assertions.assertEquals(51, sortDesc(15));
    }

    @Test
    public void test_03() {
        Assertions.assertEquals(987654321, sortDesc(123456789));
    }
}
