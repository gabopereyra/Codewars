package kyu6;

import org.junit.jupiter.api.*;

public class DeleteOccurrencesIfMoreThanNTimesTest {
    @Test
    public void deleteNth() throws Exception {
       Assertions.assertArrayEquals(
                new int[] { 20, 37, 21 },
                DeleteOccurrencesIfMoreThanNTimes.deleteNth( new int[] { 20, 37, 20, 21 }, 1 )
        );
        Assertions.assertArrayEquals(
                new int[] { 1, 1, 3, 3, 7, 2, 2, 2 },
                DeleteOccurrencesIfMoreThanNTimes.deleteNth( new int[] { 1, 1, 3, 3, 7, 2, 2, 2, 2 }, 3 )

        );
        Assertions.assertArrayEquals(
                new int[] { 1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5 },
                DeleteOccurrencesIfMoreThanNTimes.deleteNth( new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }, 3 )
        );
        Assertions.assertArrayEquals(
                new int[] { 1, 1, 1, 1, 1 },
                DeleteOccurrencesIfMoreThanNTimes.deleteNth( new int[] { 1, 1, 1, 1, 1 }, 5 )
        );
        Assertions.assertArrayEquals(
                new int[] { },
                DeleteOccurrencesIfMoreThanNTimes.deleteNth( new int[] { }, 5 )
        );
    }

    @Test
    public void deleteNthWithStream() throws Exception {
        Assertions.assertArrayEquals(
                new int[] { 20, 37, 21 },
                DeleteOccurrencesIfMoreThanNTimes.deleteNthWithStream( new int[] { 20, 37, 20, 21 }, 1 )
        );
        Assertions.assertArrayEquals(
                new int[] { 1, 1, 3, 3, 7, 2, 2, 2 },
                DeleteOccurrencesIfMoreThanNTimes.deleteNthWithStream( new int[] { 1, 1, 3, 3, 7, 2, 2, 2, 2 }, 3 )

        );
        Assertions.assertArrayEquals(
                new int[] { 1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5 },
                DeleteOccurrencesIfMoreThanNTimes.deleteNthWithStream( new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }, 3 )
        );
        Assertions.assertArrayEquals(
                new int[] { 1, 1, 1, 1, 1 },
                DeleteOccurrencesIfMoreThanNTimes.deleteNthWithStream( new int[] { 1, 1, 1, 1, 1 }, 5 )
        );
        Assertions.assertArrayEquals(
                new int[] { },
                DeleteOccurrencesIfMoreThanNTimes.deleteNthWithStream( new int[] { }, 5 )
        );
    }
}
