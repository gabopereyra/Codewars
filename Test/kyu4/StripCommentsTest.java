package kyu4;

import org.junit.jupiter.api.*;

public class StripCommentsTest {
    @Test
    public void stripComments() throws Exception {
        Assertions.assertEquals(
                "apples, pears\ngrapes\nbananas",
                StripComments.stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", new String[]{"#", "!"})
        );

        Assertions.assertEquals(
                "a\nc\nd",
                StripComments.stripComments("a #b\nc\nd $e f g", new String[]{"#", "$"})
        );

    }
}
