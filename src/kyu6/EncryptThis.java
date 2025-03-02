//LEVEL: kyu 6
//link: https://www.codewars.com/kata/5848565e273af816fb000449/train/java

/**DESCRIPTION
 * You want to create secret messages which can be deciphered by the Decipher this! kata. Here are the conditions:
 *
 *     Your message is a string containing space separated words.
 *     You need to encrypt each word in the message using the following rules:
 *         The first letter must be converted to its ASCII code.
 *         The second letter must be switched with the last letter
 *     Keepin' it simple: There are no special characters in the input.
 *
 * EXAMPLES:
 * Kata.encryptThis("Hello") => "72olle"
 * Kata.encryptThis("good") => "103doo"
 * Kata.encryptThis("hello world") => "104olle 119drlo
 */

package kyu6;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncryptThis {
    public static String encryptThis(String text) {
        if(text.trim().equals("")) return text;

        return Arrays.stream(text.split(" "))
                .map(word-> {
                    StringBuilder sb = new StringBuilder(word);
                    if(sb.length() > 2){
                        char second = sb.charAt(1);
                        char last = sb.charAt(sb.length() - 1);

                        sb.setCharAt(1, last);
                        sb.setCharAt(sb.length()-1, second);
                    }

                    int asciiValue = sb.charAt(0);
                    StringBuilder sbFinal = new StringBuilder(String.valueOf(asciiValue));
                    sb.delete(0,1);

                    sbFinal.append(sb);

                   return sbFinal.toString();
                }).collect(Collectors.joining(" "));
    }

    @Test
    public void exampleTests() {
        assertEquals("", encryptThis(""));
        assertEquals("65 119esi 111dl 111lw 108dvei 105n 97n 111ka", encryptThis("A wise old owl lived in an oak"));
        assertEquals("84eh 109ero 104e 115wa 116eh 108sse 104e 115eokp", encryptThis("The more he saw the less he spoke"));
        assertEquals("84eh 108sse 104e 115eokp 116eh 109ero 104e 104dare", encryptThis("The less he spoke the more he heard"));
        assertEquals("87yh 99na 119e 110to 97ll 98e 108eki 116tah 119esi 111dl 98dri", encryptThis("Why can we not all be like that wise old bird"));
        assertEquals("84kanh 121uo 80roti 102ro 97ll 121ruo 104ple", encryptThis("Thank you Piotr for all your help"));
    }
}
