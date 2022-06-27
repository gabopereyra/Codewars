package kyu7;

import org.junit.jupiter.api.*;

public class VowelCountTest {
    @Test
    public void testCase1() {
      Assertions.assertEquals(5, VowelCount.getCount("abracadabra"));
    }
}
