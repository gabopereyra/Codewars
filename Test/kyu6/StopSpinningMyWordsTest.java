package kyu6;

import org.junit.jupiter.api.*;

public class StopSpinningMyWordsTest {
    @Test
    public void test() {
       Assertions.assertEquals("emocleW", StopSpinningMyWords.spinWords("Welcome"));
        Assertions.assertEquals("Hey wollef sroirraw", StopSpinningMyWords.spinWords("Hey fellow warriors"));
    }

    @Test
    public void testWithStream() {
        Assertions.assertEquals("emocleW", StopSpinningMyWords.spinWordsWithStream("Welcome"));
        Assertions.assertEquals("Hey wollef sroirraw", StopSpinningMyWords.spinWordsWithStream("Hey fellow warriors"));
    }
}
