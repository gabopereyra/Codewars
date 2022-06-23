package kyu6;

import org.junit.jupiter.api.*;

public class PlayingWithDigitsTest {
    @Test
    public void Test1() {
        Assertions.assertEquals(1, PlayingWithDigits.digPow(89, 1));
    }
    @Test
    public void Test2() {
        Assertions.assertEquals(-1, PlayingWithDigits.digPow(92, 1));
    }
    @Test
    public void Test3() {
        Assertions.assertEquals(51, PlayingWithDigits.digPow(46288, 3));
    }
}
