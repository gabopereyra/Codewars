//LEVEL: kyu 6
//link: https://www.codewars.com/kata/5266876b8f4bf2da9b000362/train/java

/**DESCRIPTION
 * You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items.
 * We want to create the text that should be displayed next to such an item.
 * Implement the function which takes an array containing the names of people that like an item.
 *
 **It must return the display text as shown in the examples:
 * []                                -->  "no one likes this"
 * ["Peter"]                         -->  "Peter likes this"
 * ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
 * ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
 * ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
 */

package kyu6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WhoLikesIt {
    public static String finalString(String... names) {
        String finalString = "";

        switch (names.length) {
            case 0:
                finalString = "no one likes this";
                break;
            case 1:
                finalString = names[0] + " likes this";
                break;
            case 2:
                finalString = names[0] +" and "+names[1]+" like this";
                break;
            case 3:
                finalString = names[0]+", "+names[1] +" and "+names[2]+" like this";
                break;
            default:
                finalString = names[0]+", "+names[1] +" and "+(names.length-2)+" others like this";
                break;
        }
        return finalString;
    }

    @Test
    public void staticTests() {
        Assertions.assertEquals("no one likes this", finalString());
        Assertions.assertEquals("Peter likes this", finalString("Peter"));
        Assertions.assertEquals("Jacob and Alex like this", finalString("Jacob", "Alex"));
        Assertions.assertEquals("Max, John and Mark like this", finalString("Max", "John", "Mark"));
        Assertions.assertEquals("Alex, Jacob and 2 others like this", finalString("Alex", "Jacob", "Mark", "Max"));
        Assertions.assertEquals("Alex, Jacob and 3 others like this", finalString("Alex", "Jacob", "Mark", "Max", "Pedro"));
    }

}