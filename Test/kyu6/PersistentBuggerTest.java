package kyu6;

import org.junit.jupiter.api.*;

public class PersistentBuggerTest {
    @Test
    public void BasicTests() {
        Assertions.assertEquals(3, PersistentBugger.persistence(39));
        Assertions.assertEquals(0, PersistentBugger.persistence(4));
        Assertions.assertEquals(2, PersistentBugger.persistence(25));
        Assertions.assertEquals(4, PersistentBugger.persistence(999));
    }
}
