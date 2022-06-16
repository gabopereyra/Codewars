package kyu8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountOddNumbersTest {
    @Test
    public void fixedTests() {
        Assertions.assertEquals(7, CountOddNumbers.oddCount(15));
        Assertions.assertEquals(7511, CountOddNumbers.oddCount(15023));
    }
}
