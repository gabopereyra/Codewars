//LEVEL: kyu 7
//link: https://www.codewars.com/kata/5667e8f4e3f572a8f2000039/train/java

/**DESCRIPTION
 *This time no story, no theory. The examples below show you how to write function accum:

  Examples:

  accum("abcd") -> "A-Bb-Ccc-Dddd"
  accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
  accum("cwAt") -> "C-Ww-Aaa-Tttt"

 * The parameter of accum is a string which includes only letters from a..z and A..Z.
 */

package kyu7;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Mumbling {
    public static String accum(String s) {
        String finalString = "";

        for (int i=0; i<s.length(); i++){
            String aux = s.substring(i, i+1).toUpperCase(); //To convert the first letter to UpperCase

            for(int j=0; j<i; j++){
                aux += s.substring(i, i+1).toLowerCase(); //To add the other letters in function of the position
            }

            finalString += ("-"+aux); //Add the '-' to separate
        }

        return(finalString.substring(1)); //To eliminate the first '-'
    }

    public static String accumWithStream(String s){
        String[] aux = s.split("");
        return IntStream.range(0, aux.length)
                        .mapToObj(i -> aux[i].toUpperCase() + aux[i].toLowerCase().repeat(i))
                        .collect(Collectors.joining("-"));
    }
}
