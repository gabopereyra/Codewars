package kyu3;

import org.junit.jupiter.api.*;
import java.math.BigInteger;

public class AnagramsTest {
    @Test
    public void testKnownInputs() {
        Anagrams anagram = new Anagrams();

        Assertions.assertEquals(BigInteger.ONE, anagram.listPosition("A"));
        Assertions.assertEquals(BigInteger.valueOf(2), anagram.listPosition("ABAB"));
        Assertions.assertEquals(BigInteger.ONE, anagram.listPosition("AAAB"));
        Assertions.assertEquals(BigInteger.valueOf(4), anagram.listPosition("BAAA"));
        Assertions.assertEquals(BigInteger.valueOf(24572), anagram.listPosition("QUESTION"));
        Assertions.assertEquals(BigInteger.valueOf(10743), anagram.listPosition("BOOKKEEPER"));
    }
}
