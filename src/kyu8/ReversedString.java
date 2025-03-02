//LEVEL: kyu 8
//link: https://www.codewars.com/kata/5168bb5dfe9a00b126000018/train/java

/**DESCRIPTION
 * Complete the solution so that it reverses the string passed into it.
 *
 * 'world'  =>  'dlrow'
 * 'word'   =>  'drow'
 * */

package kyu8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReversedString {
    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    @Test
    public void sampleTests() {
        Assertions.assertEquals("dlrow", ReversedString.solution("world"));
    }

    @Test
    public void sampleTests2() {
        Assertions.assertEquals("olleh", ReversedString.solution("hello"));
    }
}
