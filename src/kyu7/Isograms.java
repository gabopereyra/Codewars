//LEVEL: kyu 7
//link: https://www.codewars.com/kata/54ba84be607a92aa900000f1/train/java

/*DESCRIPTION
* An isogram is a word that has no repeating letters, consecutive or non-consecutive.
* Implement a function that determines whether a string that contains only letters is an isogram.
* Assume the empty string is an isogram. Ignore letter case.

Example: (Input --> Output)

"Dermatoglyphics" --> true
"aba" --> false
"moOse" --> false (ignore letter case)
* */


package kyu7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;

public class Isograms {
    public static boolean  isIsogram(String str) {

        String aux = str.chars().mapToObj(i -> String.valueOf((char) i).toLowerCase()).distinct().collect(Collectors.joining());

        return str.length() == aux.length();
    }

    @Test
    public void FixedTests() {
        Assertions.assertEquals(true, isIsogram("Dermatoglyphics"));
        Assertions.assertEquals(false, isIsogram("moose"));
        Assertions.assertEquals(true, isIsogram("isogram"));
        Assertions.assertEquals(false, isIsogram("isIsogram"));
        Assertions.assertEquals(false, isIsogram("aba"));
        Assertions.assertEquals(false, isIsogram("moOse"));
        Assertions.assertEquals(true, isIsogram("thumbscrewjapingly"));
        Assertions.assertEquals(true, isIsogram(""));
    }
}
