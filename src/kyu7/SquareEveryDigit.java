//LEVEL: kyu 7
//link: https://www.codewars.com/kata/546e2562b03326a88e000020/train/java

/*DESCRIPTION
Welcome. In this kata, you are asked to square every digit of a number and concatenate them.

For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.

Note: The function accepts an integer and returns an integer
 */

package kyu7;

import java.util.stream.Collectors;

public class SquareEveryDigit {
    public static int squareDigits(int n) {
        return Integer.parseInt(String.valueOf(n)
                .chars()
                .map(i -> Integer.parseInt(String.valueOf((char) i)))
                .map(i -> i * i)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("")));
    }
}
