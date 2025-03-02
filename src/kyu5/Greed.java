//LEVEL: kyu 5
//link: https://www.codewars.com/kata/5270d0d18625160ada0000e4/train/java

/*DESCRIPTION
* Greed is a dice game played with five six-sided dice. Your mission, should you choose to accept it,
* is to score a throw according to these rules. You will always be given an array with five six-sided dice values.
 Three 1's => 1000 points
 Three 6's =>  600 points
 Three 5's =>  500 points
 Three 4's =>  400 points
 Three 3's =>  300 points
 Three 2's =>  200 points
 One   1   =>  100 points
 One   5   =>   50 point
 *
 A single die can only be counted once in each roll.
 For example, a given "5" can only count as part of a triplet (contributing to the 500 points)
 or as a single 50 points, but not both in the same roll.

Example scoring

 Throw       Score
 ---------   ------------------
 5 1 3 4 1   250:  50 (for the 5) + 2 * 100 (for the 1s)
 1 1 1 3 1   1100: 1000 (for three 1s) + 100 (for the other 1)
 2 4 4 5 4   450:  400 (for three 4s) + 50 (for the 5)
 2 4 4 5 4   450:  400 (for three 4s) + 50 (for the 5)
* */

package kyu5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Greed {
    public static int greedy(int[] dice){
        int score = 0;

        int[] count = new int[6];
        Arrays.stream(dice).map(i -> count[i-1]++).toArray();

        if(count[0] >= 3){
            score += (1000 + (count[0]-3)*100);
        } else {
            score += (100* count[0]);
        }

        if(count[4] >= 3){
            score += (500 + (count[4]-3)*50);
        } else {
            score += (50* count[4]);
        }

        if(count[1] >= 3){
            score += 200;
        }
        if(count[2] >= 3){
            score += 300;
        }
        if(count[3] >= 3){
            score += 400;
        }
        if(count[5] >= 3){
            score += 600;
        }

        return score;
    }

    public static int greedyOther(int[] dice){
        int score = 0;
        int[] count = new int[]{0, 0, 0, 0, 0, 0};
        int[] weight = new int[]{100, 0, 0, 0, 50, 0};
        int[] weight3 = new int[]{1000, 200, 300, 400, 500, 600};

        for (int die : dice) count[die-1]++;

        for (int i = 0; i < count.length; i++){
            score+=(count[i]/3*weight3[i]) + (count[i]%3 * weight[i]);
        }

        return score;
    }

    @Test
    public void testExample() {
        Assertions.assertEquals(250, greedy(new int[]{5, 1, 3, 4, 1}), "Score for [5,1,3,4,1] must be 250:");
        Assertions.assertEquals(1100, greedy(new int[]{1, 1, 1, 3, 1}), "Score for [1,1,1,3,1] must be 1100:");
        Assertions.assertEquals(450, greedy(new int[]{2, 4, 4, 5, 4}), "Score for [2,4,4,5,4] must be 450:");
    }

    @Test
    public void testExampleOtherWay() {
        Assertions.assertEquals(250, greedyOther(new int[]{5, 1, 3, 4, 1}), "Score for [5,1,3,4,1] must be 250:");
        Assertions.assertEquals(1100, greedyOther(new int[]{1, 1, 1, 3, 1}), "Score for [1,1,1,3,1] must be 1100:");
        Assertions.assertEquals(450, greedyOther(new int[]{2, 4, 4, 5, 4}), "Score for [2,4,4,5,4] must be 450:");
    }
}
