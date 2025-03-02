//LEVEL: kyu 4
//link: https://www.codewars.com/kata/54d496788776e49e6b00052f/train/java

/*DESCRIPTION
* Given an array of positive or negative integers
    I= [i1,..,in]
    you have to produce a sorted array P of the form
    [ [p, sum of all ij of I for which p is a prime factor (p positive) of ij] ...]

*   P will be sorted by increasing order of the prime numbers. The final result has to be given as a string in Java, C#, C, C++ and as an array of arrays in other languages.

* Example:
I = {12, 15}; // result = "(2 12)(3 27)(5 15)"
[2, 3, 5] is the list of all prime factors of the elements of I, hence the result.

Notes:
    It can happen that a sum is 0 if some numbers are negative!
    Example: I = [15, 30, -45] 5 divides 15, 30 and (-45) so 5 appears in the result,
    the sum of the numbers for which 5 is a factor is 0 so we have [5, 0] in the result amongst others.
* */

package kyu4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;


public class SumByFactors {
    public static String sumOfDivided(int[] l) {
        int max = Arrays.stream(l).map(Math::abs).max().getAsInt();
        int[] primos = IntStream.range(2, (max+1)).parallel().filter(num -> isPrime(num, l)).toArray();

        List result = new ArrayList();

        for (int i = 0; i < primos.length; i++) {
            int suma = 0;
            for (int j = 0; j <l.length; j++){
                if (l[j] % primos[i] == 0){
                    suma += l[j];
                }
            }
            result.add("("+primos[i] + " "+suma+")");
        }

        return (String) result.stream().collect(joining(""));
    }
    private static boolean isPrime(int number, int[] l) {
        for (int i = (int) Math.sqrt(number); i > 1; i--) {
            if (number % i == 0) {
                return false;
            }
        }
        for (int i=0; i < l.length; i++){
            if (l[i]%number == 0)
                return true;
        }
        return false;
    } //end function


    public static String sumOfDividedOther(int[] l) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int number:l) {
            int i = number < 0 ? -number:number; //Conversion from negative to positive.
            for(int j = 2; j <= i; j++) {
                if (i%j == 0) map.put(j, map.get(j) == null ? number : map.get(j)+number);
                while(i%j == 0) i /= j;
            }
        }
        return map.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .map(e -> String.format("(%d %d)",e.getKey(),e.getValue()))
                .reduce((x,y) -> x+y)
                .get();
    }


    @Test
    public void testOne() {
        int[] lst = new int[]{12, 15};
        Assertions.assertEquals("(2 12)(3 27)(5 15)", SumByFactors.sumOfDivided(lst));
    }

    @Test
    public void testTwo() {
        int[] lst = new int[]{107, 158, 204, 100, 118, 123, 126, 110, 116, 100};
        Assertions.assertEquals("(2 1032)(3 453)(5 310)(7 126)(11 110)(17 204)(29 116)(41 123)(59 118)(79 158)(107 107)", SumByFactors.sumOfDivided(lst));
    }

    @Test
    public void testThree() {
        int[] lst = new int[]{125, -67, 499, 318, 193, 130, -67, 274, 349, 154, 297, 448, -27, 179, 208, 4, 7, 357, 319};
        Assertions.assertEquals("(2 1536)(3 945)(5 255)(7 966)(11 770)(13 338)(17 357)(29 319)(53 318)(67 -134)(137 274)(179 179)(193 193)(349 349)(499 499)", SumByFactors.sumOfDivided(lst));
    }

    @Test
    public void testOneOther() {
        int[] lst = new int[]{12, 15};
        Assertions.assertEquals("(2 12)(3 27)(5 15)", sumOfDividedOther(lst));
    }

    @Test
    public void testTwoOther() {
        int[] lst = new int[]{107, 158, 204, 100, 118, 123, 126, 110, 116, 100};
        Assertions.assertEquals("(2 1032)(3 453)(5 310)(7 126)(11 110)(17 204)(29 116)(41 123)(59 118)(79 158)(107 107)", sumOfDividedOther(lst));
    }

    @Test
    public void testThreeOther() {
        int[] lst = new int[]{125, -67, 499, 318, 193, 130, -67, 274, 349, 154, 297, 448, -27, 179, 208, 4, 7, 357, 319};
        Assertions.assertEquals("(2 1536)(3 945)(5 255)(7 966)(11 770)(13 338)(17 357)(29 319)(53 318)(67 -134)(137 274)(179 179)(193 193)(349 349)(499 499)", sumOfDividedOther(lst));
    }

}

