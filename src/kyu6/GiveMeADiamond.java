//LEVEL: kyu 6
//link: https://www.codewars.com/kata/5503013e34137eeeaa001648/train/java

/**
 * DESCRIPTION
 * Jamie is a programmer, and James' girlfriend. She likes diamonds, and wants a diamond string from James.
 * Since James doesn't know how to make this happen, he needs your help.
 * <p>
 * Task
 * You need to return a string that looks like a diamond shape when printed on the screen, using asterisk (*) characters.
 * Trailing spaces should be removed, and every line must be terminated with a newline character (\n).
 * <p>
 * Return null/nil/None/... if the input is an even number or negative, as it is not possible to print a diamond of even or negative size.
 * Examples:
 * A size 3 diamond:
 * <p>
 * **
 * <p>
 * <p>
 * ...which would appear as a string of " *\n***\n *\n"
 * <p>
 * A size 5 diamond:
 * <p>
 * **
 * ****
 * **
 * <p>
 * ...that is:
 * <p>
 * "  *\n ***\n*****\n ***\n  *\n"
 */

package kyu6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GiveMeADiamond {
    public static String print(int n) {
        if (n <= 0 || n % 2 == 0) {
            return null;
        }

        String superior = "";
        String central = "";
        String inferior = "";

        central += "*".repeat(n) + "\n";

        for (int i = 1; i < n; i += 2) {
            superior += " ".repeat((n - i) / 2);
            superior += "*".repeat(i);
            superior += "\n";
        }
        for (int i = 1; i <= (n / 2); i++) {
            inferior += " ".repeat(i);
            inferior += "*".repeat(n - (2 * i));
            inferior += "\n";
        }

        return superior + central + inferior;
    }

    public static String printWithStream(int n) {
        if (n < 0 || n % 2 == 0) {
            return null;
        }

        return IntStream.range(0, n * 2)
                .filter(i -> i % 2 > 0)
                .map(i -> i > n ? n - (i - n) : i)
                .mapToObj(i -> " ".repeat((n - i) / 2) + "*".repeat(i) + "\n")
                .collect(Collectors.joining());
    }

    @Test
    public void testDiamond3() {
        StringBuffer expected = new StringBuffer();
        expected.append(" *\n");
        expected.append("***\n");
        expected.append(" *\n");

        Assertions.assertEquals(expected.toString(), print(3));
    }

    @Test
    public void testDiamond5() {
        StringBuffer expected = new StringBuffer();
        expected.append("  *\n");
        expected.append(" ***\n");
        expected.append("*****\n");
        expected.append(" ***\n");
        expected.append("  *\n");

        Assertions.assertEquals(expected.toString(), print(5));
    }

    @Test
    public void testDiamond1() {
        StringBuffer expected = new StringBuffer();
        expected.append("*\n");
        Assertions.assertEquals(expected.toString(), print(1));
    }

    @Test
    public void testDiamond0() {
        Assertions.assertEquals(null, print(0));
    }

    @Test
    public void testDiamondMinus2() {
        Assertions.assertEquals(null, print(-2));
    }

    @Test
    public void testDiamond2() {
        Assertions.assertEquals(null, print(2));
    }

    ///
    @Test
    public void testDiamond3WithStream() {
        StringBuffer expected = new StringBuffer();
        expected.append(" *\n");
        expected.append("***\n");
        expected.append(" *\n");

        Assertions.assertEquals(expected.toString(), printWithStream(3));
    }

    @Test
    public void testDiamond5WithStream() {
        StringBuffer expected = new StringBuffer();
        expected.append("  *\n");
        expected.append(" ***\n");
        expected.append("*****\n");
        expected.append(" ***\n");
        expected.append("  *\n");

        Assertions.assertEquals(expected.toString(), printWithStream(5));
    }

    @Test
    public void testDiamond1WithStream() {
        StringBuffer expected = new StringBuffer();
        expected.append("*\n");
        Assertions.assertEquals(expected.toString(), printWithStream(1));
    }

    @Test
    public void testDiamond0WithStream() {
        Assertions.assertEquals(null, printWithStream(0));
    }

    @Test
    public void testDiamondMinus2WithStream() {
        Assertions.assertEquals(null, printWithStream(-2));
    }

    @Test
    public void testDiamond2WithStream() {
        Assertions.assertEquals(null, printWithStream(2));
    }
}
