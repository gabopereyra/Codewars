/*DESCRIPTION
1, 246, 2, 123, 3, 82, 6, 41 are the divisors of number 246.

Squaring these divisors we get: 1, 60516, 4, 15129, 9, 6724, 36, 1681.

The sum of these squares is 84100 which is 290 * 290.
Task

Find all integers between m and n (m and n are integers with 1 <= m <= n) such that the sum of their squared divisors is itself a square.

We will return an array of subarrays or of tuples (in C an array of Pair) or a string.

The subarrays (or tuples or Pairs) will have two elements: first the number the squared divisors of which is a square and then the sum of the squared divisors.
Example:

m =  1, n = 250 --> [[1, 1], [42, 2500], [246, 84100]]
m = 42, n = 250 --> [[42, 2500], [246, 84100]]

The form of the examples may change according to the language, see "Sample Tests".
Note

In Fortran - as in any other language - the returned string is not permitted to contain any redundant trailing whitespace: you can use dynamically allocated character strings.

*/

package kyu5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.LongStream;

import static org.junit.jupiter.api.Assertions.*;

public class IntegersRecreationOne {
    public static String listSquared(long m, long n) {
        return Arrays.deepToString(
                LongStream.rangeClosed(m,n)
                .mapToObj( e -> new keyDivisors(e, getDivisors(e)))
                .map( e -> new long[]{e.key(), Arrays.stream(e.divisors()).map(v-> (long) Math.pow(v,2)).sum()})
                .filter( v -> {
                    var sum = v[1];
                    var square = Math.sqrt(sum);
                    return sum % square == 0;
                })
                .toArray()
        );
    }

    private static long[] getDivisors(long value){
        return LongStream.rangeClosed(1, value).filter( e -> value%e == 0).toArray();
    }

    private record keyDivisors(long key, long[] divisors){}

    @Test
    public void test1() {
        assertEquals("[[1, 1], [42, 2500], [246, 84100]]", listSquared(1, 250));
    }
    @Test
    public void test2() {
        assertEquals("[[42, 2500], [246, 84100]]", listSquared(42, 250));
    }
    @Test
    public void test3() {
        assertEquals("[[287, 84100]]", listSquared(250, 500));
    }

}

