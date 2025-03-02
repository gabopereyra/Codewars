//LEVEL: kyu 5
//link: https://www.codewars.com/kata/5547cc7dcad755e480000004/train/java

/**DESCRIPTION
 * A friend of mine takes the sequence of all numbers from 1 to n (where n > 0).
 * Within that sequence, he chooses two numbers, a and b.
 * He says that the product of a and b should be equal to the sum of all numbers in the sequence, excluding a and b.
 * Given a number n, could you tell me the numbers he excluded from the sequence?
 *
 * The function takes the parameter: n (n is always strictly greater than 0) and returns an array or a string
 * (depending on the language) of the form:
        [(a, b), ...] or [[a, b], ...] or {{a, b}, ...} or or [{a, b}, ...]
 *
 * With all (a, b) which are the possible removed numbers in the sequence 1 to n.
 * [(a, b), ...] or [[a, b], ...] or {{a, b}, ...} or ... will be sorted in increasing order of the "a".
 *
 * It happens that there are several possible (a, b).
 * The function returns an empty array (or an empty string) if no possible numbers are found
 * which will prove that my friend has not told the truth! (Go: in this case return nil).
 *
 * Examples:
    removNb(26) should return [(15, 21), (21, 15)]
 */

package kyu5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class IsMyFiendCheating {
    public static List<long[]> removNb(long n) {
        List<long[]> result = new ArrayList<>();
        long sum = n * (n + 1) / 2;

        for (long x = 1; x <= n; x++) {

            long y = (sum - x) / (x + 1);
            if (y <= n && x * y == sum - x - y) {
                result.add(new long[] {x, y});
            }
        }

        return result;
    }

    @Test
    public void test12() {
        List<long[]> res = new ArrayList<>();
        res.add(new long[] {15, 21});
        res.add(new long[] {21, 15});
        List<long[]> a = removNb(26);
        Assertions.assertArrayEquals(res.get(0), a.get(0));
        Assertions.assertArrayEquals(res.get(1), a.get(1));
    }
    @Test
    public void test14() {
        List<long[]> res = new ArrayList<long[]>();
        List<long[]> a = removNb(100);
        Assertions.assertTrue(res.size() == a.size());
    }
}
