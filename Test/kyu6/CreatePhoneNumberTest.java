package kyu6;

import org.junit.jupiter.api.*;

public class CreatePhoneNumberTest {

    @Test
    public void tests() {
        Assertions.assertEquals("(123) 456-7890", CreatePhoneNumber.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
    @Test
    public void testsOtherWay() {
        Assertions.assertEquals("(123) 456-7890", CreatePhoneNumber.createPhoneNumberOtherWay(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
    @Test
    public void testsWithStream() {
        Assertions.assertEquals("(123) 456-7890", CreatePhoneNumber.createPhoneNumberWithStream(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}
