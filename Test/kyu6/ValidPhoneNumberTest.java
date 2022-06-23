package kyu6;

import org.junit.jupiter.api.*;

public class ValidPhoneNumberTest {
    @Test
    public void tests() {
        Assertions.assertEquals(false, ValidPhoneNumber.validPhoneNumber("(098) 123 4567"));
        Assertions.assertEquals(false, ValidPhoneNumber.validPhoneNumber("(1111)555 2345"));
        Assertions.assertEquals(true, ValidPhoneNumber.validPhoneNumber("(123) 456-7890"));
    }
}
