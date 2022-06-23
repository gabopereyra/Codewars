//LEVEL: kyu 8
//link: https://www.codewars.com/kata/5168bb5dfe9a00b126000018/train/java

/**DESCRIPTION
 * Complete the solution so that it reverses the string passed into it.
 *
 * 'world'  =>  'dlrow'
 * 'word'   =>  'drow'
 * */

package kyu8;

public class ReversedString {
    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
