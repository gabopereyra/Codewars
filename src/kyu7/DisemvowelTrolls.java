//LEVEL: kyu 7
//link: https://www.codewars.com/kata/52fba66badcd10859f00097e/train/java

/*DESCRIPTION
Trolls are attacking your comment section!

A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.

Your task is to write a function that takes a string and return a new string with all vowels removed.

For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".

Note: for this kata y isn't considered a vowel.


 */

package kyu7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DisemvowelTrolls {
    public static String disemvowel(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    @Test
    public void FixedTests() {
        Assertions.assertEquals("Ths wbst s fr lsrs LL!", disemvowel("This website is for losers LOL!")
        );
        Assertions.assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd", disemvowel(
                "No offense but,\nYour writing is among the worst I've ever read"));
        Assertions.assertEquals("Wht r y,  cmmnst?", disemvowel("What are you, a communist?"));
    }
}
