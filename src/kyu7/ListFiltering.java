//LEVEL: kyu 7
//link: https://www.codewars.com/kata/53dbd5315a3c69eed20002dd/train/java

/*DESCRIPTION
In this kata you will create a function that takes a list of non-negative integers and strings and returns a new
list with the strings filtered out.

Example

Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
Kata.filterList(List.of(1, 2, "a", "b", 0, 15)) => List.of(1,2,0,15)
Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123
 */

package kyu7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class ListFiltering {
    public static List<Object> filterList(final List<Object> list) {
        return list.stream().filter(value -> value instanceof Integer).collect(Collectors.toList());
    }

    @Test
    public void examples() {
        Assertions.assertEquals(List.of(1, 2), filterList(List.of(1, 2, "a", "b")), "For input: [1, 2, \"a\", \"b\"]");
        Assertions.assertEquals(List.of(1, 0, 15), filterList(List.of(1, "a", "b", 0, 15)), "For input: [1, \"a\", \"b\", 0, 15]");
        Assertions.assertEquals(List.of(1, 2, 123), filterList(List.of(1, 2, "aasf", "1", "123", 123)), "For input: [1, 2, \"aasf\", \"1\", \"123\", 123]");
    }
}
