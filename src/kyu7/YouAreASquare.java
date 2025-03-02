//LEVEL: kyu 7
//link: https://www.codewars.com/kata/54c27a33fb7da0db0100040e/train/java

/**DESCRIPTION
 * A square of squares
 * You like building blocks. You especially like building blocks that are squares. And what you even like more, is to arrange them into a square of square building blocks!
 *  However, sometimes, you can't arrange them into a square. Instead, you end up with an ordinary rectangle! T
 *  hose blasted things! If you just had a way to know, whether you're currently working in vain… Wait! That's it!
 *  You just have to check if your number of building blocks is a perfect square.

 Task
 Given an integral number, determine if it's a square number:
 In mathematics, a square number or perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself.
 The tests will always use some integral number, so don't worry about that in dynamic typed languages.

     Examples

     -1  =>  false
     0  =>  true
     3  =>  false
     4  =>  true
     25  =>  true
     26  =>  false
*/

package kyu7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class YouAreASquare {
    public static boolean isSquare(int n) {
        return (Math.sqrt(n)%1 == 0);
    }

    @Test
    public void shouldWorkForSomeExamples() throws Exception {
        Assertions.assertFalse(isSquare(-1), "negative numbers aren't square numbers");
        Assertions.assertFalse(isSquare(3), "3 isn't a square number");
        Assertions.assertFalse(isSquare(26), "26 isn't a square number");
        Assertions.assertFalse(isSquare(17), "17 isn't a square number");

        Assertions.assertTrue(isSquare(0), "0 is a square number (0 * 0)");
        Assertions.assertTrue(isSquare(4), "4 is a square number (2 * 2)");
        Assertions.assertTrue(isSquare(25),"25 is a square number (5 * 5)");
        Assertions.assertTrue(isSquare(36),"36 is a square number (6 * 6)");
        Assertions.assertTrue(isSquare(121),"25 is a square number (11 * 11)");

    }
}
