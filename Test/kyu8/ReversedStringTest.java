package kyu8;

import org.junit.jupiter.api.*;

public class ReversedStringTest {
    @Test
    public void sampleTests() {
        Assertions.assertEquals("dlrow", ReversedString.solution("world"));
    }

    @Test
    public void sampleTests2() {
        Assertions.assertEquals("olleh", ReversedString.solution("hello"));
    }
}
