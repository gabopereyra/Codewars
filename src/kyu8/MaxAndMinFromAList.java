//LEVEL: kyu 8
//link: https://www.codewars.com/kata/577a98a6ae28071780000989/train/java

/*Your task is to make two functions (max and min, or maximum and minimum, etc., depending on the language)
that receive a list of integers as input and return, respectively, the largest and lowest number in that list.

Examples (Input -> Output)
* [4,6,2,1,9,63,-134,566]         -> max = 566, min = -134
* [-52, 56, 30, 29, -54, 0, -110] -> min = -110, max = 56
* [42, 54, 65, 87, 0]             -> min = 0, max = 87
* [5]                             -> min = 5, max = 5

Notes: You may consider that there will not be any empty arrays/vectors.
* */
package kyu8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MaxAndMinFromAList {
    public int min(int[] list) {
        int minimun = list[0];
        for(int i = 0; i < (list.length-1); i++){
            if(list[i+1] < minimun){
                minimun = list[i+1];
            }
        }
        return minimun;
    }

    public int minWithStream(int[] list) {
        return Arrays.stream(list).min().getAsInt();
    }

    public int max(int[] list) {
        int maximum = list[0];
        for(int i = 0; i < (list.length-1); i++){
            if(list[i+1] > maximum){
                maximum = list[i+1];
            }
        }
        return maximum;
    }

    public int maxWithStream(int[] list) {
        return Arrays.stream(list).max().getAsInt();
    }

    @Test
    public void testExamples() {
        Assertions.assertEquals(-110, min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        Assertions.assertEquals(0, min(new int[]{42, 54, 65, 87, 0}));
        Assertions.assertEquals(566, max(new int[]{4,6,2,1,9,63,-134,566}));
        Assertions.assertEquals(5, max(new int[]{5}));
    }

    @Test
    public void testExamplesWithStream() {
        Assertions.assertEquals(-110, minWithStream(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        Assertions.assertEquals(0, minWithStream(new int[]{42, 54, 65, 87, 0}));
        Assertions.assertEquals(566, maxWithStream(new int[]{4,6,2,1,9,63,-134,566}));
        Assertions.assertEquals(5, maxWithStream(new int[]{5}));
    }
}
