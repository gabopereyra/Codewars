package kyu6;

import org.junit.jupiter.api.*;

public class GiveMeADiamondTest {
    @Test
    public void testDiamond3() {
        StringBuffer expected = new StringBuffer();
        expected.append(" *\n");
        expected.append("***\n");
        expected.append(" *\n");

        Assertions.assertEquals(expected.toString(), GiveMeADiamond.print(3));
    }

    @Test
    public void testDiamond5() {
        StringBuffer expected = new StringBuffer();
        expected.append("  *\n");
        expected.append(" ***\n");
        expected.append("*****\n");
        expected.append(" ***\n");
        expected.append("  *\n");

        Assertions.assertEquals(expected.toString(), GiveMeADiamond.print(5));
    }

    @Test
    public void testDiamond1() {
        StringBuffer expected = new StringBuffer();
        expected.append("*\n");
        Assertions.assertEquals(expected.toString(), GiveMeADiamond.print(1));
    }

    @Test
    public void testDiamond0() {
        Assertions.assertEquals(null, GiveMeADiamond.print(0));
    }

    @Test
    public void testDiamondMinus2() {
        Assertions.assertEquals(null, GiveMeADiamond.print(-2));
    }

    @Test
    public void testDiamond2() {
        Assertions.assertEquals(null, GiveMeADiamond.print(2));
    }

    ///
    @Test
    public void testDiamond3WithStream() {
        StringBuffer expected = new StringBuffer();
        expected.append(" *\n");
        expected.append("***\n");
        expected.append(" *\n");

        Assertions.assertEquals(expected.toString(), GiveMeADiamond.printWithStream(3));
    }

    @Test
    public void testDiamond5WithStream() {
        StringBuffer expected = new StringBuffer();
        expected.append("  *\n");
        expected.append(" ***\n");
        expected.append("*****\n");
        expected.append(" ***\n");
        expected.append("  *\n");

        Assertions.assertEquals(expected.toString(), GiveMeADiamond.printWithStream(5));
    }

    @Test
    public void testDiamond1WithStream() {
        StringBuffer expected = new StringBuffer();
        expected.append("*\n");
        Assertions.assertEquals(expected.toString(), GiveMeADiamond.printWithStream(1));
    }

    @Test
    public void testDiamond0WithStream() {
        Assertions.assertEquals(null, GiveMeADiamond.printWithStream(0));
    }

    @Test
    public void testDiamondMinus2WithStream() {
        Assertions.assertEquals(null, GiveMeADiamond.printWithStream(-2));
    }

    @Test
    public void testDiamond2WithStream() {
        Assertions.assertEquals(null, GiveMeADiamond.printWithStream(2));
    }
}
