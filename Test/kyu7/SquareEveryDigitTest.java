package kyu7;

import org.junit.jupiter.api.*;

public class SquareEveryDigitTest {
    @Test
    public void test() {
        Assertions.assertEquals(811181, SquareEveryDigit.squareDigits(9119));
        Assertions.assertEquals(0, SquareEveryDigit.squareDigits(0));
    }
}
