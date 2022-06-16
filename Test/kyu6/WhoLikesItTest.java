package kyu6;

import org.junit.jupiter.api.*;

public class WhoLikesItTest {
        @Test
        public void staticTests() {
            Assertions.assertEquals("no one likes this", WhoLikesIt.finalString());
            Assertions.assertEquals("Peter likes this", WhoLikesIt.finalString("Peter"));
            Assertions.assertEquals("Jacob and Alex like this", WhoLikesIt.finalString("Jacob", "Alex"));
            Assertions.assertEquals("Max, John and Mark like this", WhoLikesIt.finalString("Max", "John", "Mark"));
            Assertions.assertEquals("Alex, Jacob and 2 others like this", WhoLikesIt.finalString("Alex", "Jacob", "Mark", "Max"));
            Assertions.assertEquals("Alex, Jacob and 3 others like this", WhoLikesIt.finalString("Alex", "Jacob", "Mark", "Max", "Pedro"));
        }
} //end public class

