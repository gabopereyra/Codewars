package kyu7;

import org.junit.jupiter.api.*;

public class IsogramsTest {
    @Test
    public void FixedTests() {
        Assertions.assertEquals(true, Isograms.isIsogram("Dermatoglyphics"));
        Assertions.assertEquals(false, Isograms.isIsogram("moose"));
        Assertions.assertEquals(true, Isograms.isIsogram("isogram"));
        Assertions.assertEquals(false, Isograms.isIsogram("isIsogram"));
        Assertions.assertEquals(false, Isograms.isIsogram("aba"));
        Assertions.assertEquals(false, Isograms.isIsogram("moOse"));
        Assertions.assertEquals(true, Isograms.isIsogram("thumbscrewjapingly"));
        Assertions.assertEquals(true, Isograms.isIsogram(""));
    }
}
