package kyu8;

import org.junit.jupiter.api.*;

public class ConvertNumberToStringTest {
    @Test
    public void tests() {
        Assertions.assertEquals("67", ConvertNumberToString.numberToString(67));
        Assertions.assertEquals("123", ConvertNumberToString.numberToString(123));
        Assertions.assertEquals("999", ConvertNumberToString.numberToString(999));
    }
}
