//LEVEL: kyu 7
//link: https://www.codewars.com/kata/54ff3102c1bad923760001f3/train/java

/*DESCRIPTION
Return the number (count) of vowels in the given string.

We will consider a, e, i, o, u as vowels for this Kata (but not y).

The input string will only consist of lower case letters and/or spaces.
 */

package kyu7;

public class VowelCount {
    public static int getCount(String str) {
        return (int) str.toLowerCase().chars().filter(a -> a=='a' || a=='e' ||a=='i' ||a=='o' ||a=='u').count();
    }

}
