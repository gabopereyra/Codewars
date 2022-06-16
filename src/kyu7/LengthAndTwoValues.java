//LEVEL: kyu 7
//link: https://www.codewars.com/kata/62a611067274990047f431a8/train/java

/**
 * DESCRIPTION
 * Given an integer n and two other values, build an array of size n filled with these two values alternating.
 * <p>
 * Examples
 * <p>
 * 5, true, false     -->  [true, false, true, false, true]
 * 10, "blue", "red"  -->  ["blue", "red", "blue", "red", "blue", "red", "blue", "red", "blue", "red"]
 * 0, "one", "two"    -->  []
 */

package kyu7;

public class LengthAndTwoValues {
        public static String[] alternate(int n, String firstValue, String secondValue) {
        String[] finalString = new String[n];
        int i = 0;

        while(i<n){
            finalString[i] = firstValue;
            if((i+1) != n){
                finalString[i+1] = secondValue;
            }
            i+=2;
        }

        return finalString;
    }
    public static String[] alternateWithStream(int n, String firstValue, String secondValue) {
        return java.util.stream.IntStream.range(0, n).mapToObj(i -> i % 2 == 0 ? firstValue : secondValue).toArray(String[]::new);
    }
}
