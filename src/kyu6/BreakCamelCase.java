//LEVEL: kyu 6
//link: https://www.codewars.com/kata/5208f99aee097e6552000148/train/java

/*DESCRIPTION
Complete the solution so that the function will break up camel casing, using a space between words.
Example

"camelCasing"  =>  "camel Casing"
"identifier"   =>  "identifier"
""             =>  ""

* */

package kyu6;

import java.util.stream.Collectors;

public class BreakCamelCase {
    public static String camelCase(String input) {
        return input.chars().
                mapToObj(a -> (String.valueOf((char) a).toUpperCase().equals(String.valueOf((char) a))) ? " "+String.valueOf((char) a) : String.valueOf((char) a))
                .collect(Collectors.joining(""));
    }

    static String camelCaseRegex(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }
}
