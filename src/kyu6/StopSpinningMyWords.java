//LEVEL: kyu 6
//link: https://www.codewars.com/kata/5264d2b162488dc400000001/train/java

/*DESCRIPTION
*Write a function that takes in a string of one or more words, and returns the same string,
* but with all five or more letter words reversed (Just like the name of this Kata).
* Strings passed in will consist of only letters and spaces. Spaces will be included only
* when more than one word is present.

Examples:
* spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
* spinWords( "This is a test") => returns "This is a test"
* spinWords( "This is another test" )=> returns "This is rehtona test"
* */

package kyu6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class StopSpinningMyWords {
    public static String spinWords(String sentence) {
        StringTokenizer st = new StringTokenizer(sentence);
        String finalString = "";

        while (st.hasMoreTokens()) {
            String auxToken = st.nextToken();
            if (auxToken.length() >= 5) {
                String aux = "";
                for (int i = auxToken.length() - 1; i >= 0; i--) {
                    aux += auxToken.substring(i, i + 1);
                }
                finalString += aux + " ";
            } else {
                finalString += auxToken + " ";
            }
        }

        finalString = finalString.trim();

        return finalString;
    }

    public static String spinWordsWithStream(String sentence) {
        return Arrays.stream(sentence.split(" ")).
                map(i -> (i.length()>4 ? new StringBuilder(i).reverse().toString() : i))
                .collect(Collectors.joining(" "));
    }

    @Test
    public void test() {
        Assertions.assertEquals("emocleW", spinWords("Welcome"));
        Assertions.assertEquals("Hey wollef sroirraw", spinWords("Hey fellow warriors"));
    }

    @Test
    public void testWithStream() {
        Assertions.assertEquals("emocleW", spinWordsWithStream("Welcome"));
        Assertions.assertEquals("Hey wollef sroirraw", spinWordsWithStream("Hey fellow warriors"));
    }
}
