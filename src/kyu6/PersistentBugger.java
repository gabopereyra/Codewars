//LEVEL: kyu 6
//link: https://www.codewars.com/kata/54ba84be607a92aa900000f1/train/java

/*DESCRIPTION
* Write a function, persistence, that takes in a positive parameter num and returns its
* multiplicative persistence, which is the number of times you must multiply the digits
* in num until you reach a single digit.

For example (Input --> Output):
39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
4 --> 0 (because 4 is already a one-digit number)
* */

package kyu6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersistentBugger {
    public static int persistence(long n) {
        int count = 0;
        while(n>9){
            String[] nums = String.valueOf(n).split("");
            long aux =1;
            for(String i:nums){
                aux *= Long.valueOf(i);
                n = aux;
            }
            count++;
        }
        return count;
    }

    @Test
    public void BasicTests() {
        Assertions.assertEquals(3, persistence(39));
        Assertions.assertEquals(0, persistence(4));
        Assertions.assertEquals(2, persistence(25));
        Assertions.assertEquals(4, persistence(999));
    }
}
