//LEVEL: kyu 3
//link: https://www.codewars.com/kata/53e57dada0cb0400ba000688/train/java

/*DESCRIPTION
Consider a "word" as any sequence of capital letters A-Z (not limited to just "dictionary words").
For any word with at least two different letters, there are other words composed of the same letters
but in a different order (for instance, STATIONARILY/ANTIROYALIST, which happen to both be dictionary words;
for our purposes "AAIILNORSTTY" is also a "word" composed of the same letters as these two).

We can then assign a number to every word, based on where it falls in an alphabetically sorted list of
all words made up of the same group of letters. One way to do this would be to generate the entire list
of words and find the desired one, but this would be slow if the word is long.

Given a word, return its number. Your function should be able to accept any word 25 letters or less in
length (possibly with some letters repeated), and take no more than 500 milliseconds to run.
To compare, when the solution code runs the 27 test cases in JS, it takes 101ms.

Sample words, with their rank:
ABAB = 2
AAAB = 1
BAAA = 4
QUESTION = 24572
BOOKKEEPER = 10743
 */

package kyu3;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Anagrams {
    public BigInteger listPosition(String word) {
        BigInteger rank = BigInteger.ONE;
        BigInteger suffixPermCount = BigInteger.ONE;

        Map<Character, BigInteger> charCounts = new HashMap<>();

        for (int i = word.length() - 1; i > -1; i--) {
            char x = word.charAt(i);
            BigInteger xCount = charCounts.containsKey(x) ? charCounts.get(x).add(BigInteger.ONE) : BigInteger.ONE;
            charCounts.put(x, xCount);
            for (java.util.Map.Entry<Character, BigInteger> e : charCounts.entrySet()) {
                if (e.getKey() < x) {
                    rank = rank.add(suffixPermCount.multiply(e.getValue()).divide(xCount));
                }
            }
            suffixPermCount = suffixPermCount.multiply(BigInteger.valueOf(word.length() - i));
            suffixPermCount = suffixPermCount.divide(xCount);
        }
        return rank;
    }
}
