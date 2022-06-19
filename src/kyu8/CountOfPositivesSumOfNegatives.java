//LEVEL: kyu 8
//link: https://www.codewars.com/kata/576bb71bbbcf0951d5000044/train/java

/**DESCRIPTION
 * Given an array of integers.
 * Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.
 *
 * If the input is an empty array or is null, return an empty array.
 * Example
 * For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].
 */

package kyu8;

import java.util.Arrays;

public class CountOfPositivesSumOfNegatives {
    public static int[] countPositivesSumNegatives(int[] input)
    {
        if(input==null){
            return new int[0];
        }

        if(input.length == 0){
            return new int[0];
        }

        int[] finalArray = new int[2];

        for(int i=0; i<input.length; i++){
            if(input[i] > 0){
                finalArray[0] += 1;
            }
            else{
                finalArray[1] += input[i];
            }
        }

        return finalArray;
    }

    public static int[] withStream(int[] input){
        return input == null || input.length == 0 ? new int[0] :
                new int[] { (int) Arrays.stream(input).filter(i -> i > 0).count(),
                            Arrays.stream(input).filter(i -> i < 0).sum()
                };
    }

}
