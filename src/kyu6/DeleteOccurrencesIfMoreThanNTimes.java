//LEVEL: kyu 6
//link: https://www.codewars.com/kata/54ba84be607a92aa900000f1/train/java

/*DESCRIPTION
* WEnough is enough!
* Alice and Bob were on a holiday. Both of them took many pictures of the places they've been,
* and now they want to show Charlie their entire collection. However, Charlie doesn't like
* these sessions, since the motif usually repeats. He isn't fond of seeing the Eiffel tower 40 times.
* He tells them that he will only sit for the session if they show the same motif at most N times.
*  Luckily, Alice and Bob are able to encode the motif as a number. Can you help them to remove
* numbers such that their list contains each number only up to N times, without changing the order?

* Task
Given a list and a number, create a new list that contains each number of list at most N times, without reordering.
    For example if the input number is 2, and the input list is [1,2,3,1,2,1,2,3],
    you take [1,2,3,1,2], drop the next [1,2] since this would lead to 1 and 2 being in the result 3 times,
    and then take 3, which leads to [1,2,3,1,2,3].

With list [20,37,20,21] and number 1, the result would be [20,37,21].
* */

package kyu6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.IntStream;

public class DeleteOccurrencesIfMoreThanNTimes {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {

        List<Integer> finalList = new ArrayList<Integer>();

        for (Integer i : elements) {
            if (Collections.frequency(finalList, i) < maxOccurrences) {
                finalList.add(i);
            }
        }

        int[] arrayFinal = new int[finalList.size()];
        for (int i = 0; i < finalList.size(); i++) {
            arrayFinal[i] = finalList.get(i);
        }

        return arrayFinal;
    }

    public static int[] deleteNthWithStream(int[] elements, int maxOccurrences) {
        Map<Integer, Integer> occurrence = new HashMap<>();
        return IntStream.of(elements)
                .filter(motif -> occurrence.merge(motif, 1, Integer::sum) <= maxOccurrences)
                .toArray();
    }

    @Test
    public void deleteNth(){
        Assertions.assertArrayEquals(
                new int[] { 20, 37, 21 },
                deleteNth( new int[] { 20, 37, 20, 21 }, 1 )
        );
        Assertions.assertArrayEquals(
                new int[] { 1, 1, 3, 3, 7, 2, 2, 2 },
                deleteNth( new int[] { 1, 1, 3, 3, 7, 2, 2, 2, 2 }, 3 )

        );
        Assertions.assertArrayEquals(
                new int[] { 1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5 },
                deleteNth( new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }, 3 )
        );
        Assertions.assertArrayEquals(
                new int[] { 1, 1, 1, 1, 1 },
                deleteNth( new int[] { 1, 1, 1, 1, 1 }, 5 )
        );
        Assertions.assertArrayEquals(
                new int[] { },
                deleteNth( new int[] { }, 5 )
        );
    }

    @Test
    public void deleteNthWithStream(){
        Assertions.assertArrayEquals(
                new int[] { 20, 37, 21 },
                deleteNthWithStream( new int[] { 20, 37, 20, 21 }, 1 )
        );
        Assertions.assertArrayEquals(
                new int[] { 1, 1, 3, 3, 7, 2, 2, 2 },
                deleteNthWithStream( new int[] { 1, 1, 3, 3, 7, 2, 2, 2, 2 }, 3 )

        );
        Assertions.assertArrayEquals(
                new int[] { 1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5 },
                deleteNthWithStream( new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }, 3 )
        );
        Assertions.assertArrayEquals(
                new int[] { 1, 1, 1, 1, 1 },
                deleteNthWithStream( new int[] { 1, 1, 1, 1, 1 }, 5 )
        );
        Assertions.assertArrayEquals(
                new int[] { },
                deleteNthWithStream( new int[] { }, 5 )
        );
    }
}
