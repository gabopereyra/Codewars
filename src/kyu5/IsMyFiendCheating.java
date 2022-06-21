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

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class IsMyFiendCheating {
    public static List<long[]> removNb(long n) {
        List<long[]> res = new ArrayList<>();
        long sum = IntStream.range(1, (int) n+1).sum();
        long minimum = sum/n;
        long maximum = n;


        while (minimum < maximum){
            long sumAux = sum - (minimum+maximum);
            long product = (minimum*maximum);

            if(product>sumAux){
                maximum--;
            } else if (product <sumAux) {
                minimum++;
            } else if (product == sumAux) {
                res.add(new long[] {minimum, maximum});
                res.add(new long[] {maximum, minimum});
                minimum++;
            }
        }
        return res;
    }
}
