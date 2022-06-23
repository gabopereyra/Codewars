//LEVEL: kyu 6
//link: https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java

/*DESCRIPTION
* Write a function that accepts an array of 10 integers (between 0 and 9),
* that returns a string of those numbers in the form of a phone number.

Example
Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"

The returned format must be correct in order to complete this challenge.
Don't forget the space after the closing parentheses!
* */

package kyu6;

import java.util.stream.IntStream;

public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        String number = "";
        number += "(";
        for (int i=0; i<3; i++){
            number += numbers[i];
        }
        number += ") ";
        for (int i=3; i<6; i++){
            number += numbers[i];
        }
        number += "-";
        for (int i=6; i< numbers.length; i++){
            number += numbers[i];
        }

        return number;
    }

    public static String createPhoneNumberOtherWay(int[] numbers) {
        String phoneNumber = new String("(xxx) xxx-xxxx");

        for (int i : numbers) {
            phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(i));
        }

        return phoneNumber;
    }

    public static String createPhoneNumberWithStream(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", IntStream.of(numbers).boxed().toArray());
    }
}
