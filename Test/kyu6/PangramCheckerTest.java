package kyu6;

import org.junit.jupiter.api.*;

public class PangramCheckerTest {
    @Test
    public void test1() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        PangramChecker pc = new PangramChecker();
        Assertions.assertEquals(true, pc.check(pangram1));
    }
    @Test
    public void test2() {
        String pangram2 = "You shall not pass!";
        PangramChecker pc = new PangramChecker();
        Assertions. assertEquals(false, pc.check(pangram2));
    }
}
