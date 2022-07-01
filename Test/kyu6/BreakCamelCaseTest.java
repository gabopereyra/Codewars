package kyu6;

import org.junit.jupiter.api.*;

public class BreakCamelCaseTest {
    @Test
    public void tests() {
        Assertions.assertEquals("camel Casing", BreakCamelCase.camelCase("camelCasing"));
        Assertions.assertEquals("camel Casing Test", BreakCamelCase.camelCase("camelCasingTest"));
        Assertions.assertEquals( "camelcasingtest", BreakCamelCase.camelCase("camelcasingtest"));
    }
    @Test
    public void testsWithRegex() {
        Assertions.assertEquals("camel Casing", BreakCamelCase.camelCaseRegex("camelCasing"));
        Assertions.assertEquals("camel Casing Test", BreakCamelCase.camelCaseRegex("camelCasingTest"));
        Assertions.assertEquals( "camelcasingtest", BreakCamelCase.camelCaseRegex("camelcasingtest"));
    }
}
