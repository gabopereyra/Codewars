package kyu4;

import org.junit.jupiter.api.*;

public class SumByFactorsTest {
    @Test
    public void testOne() {
        int[] lst = new int[]{12, 15};
        Assertions.assertEquals("(2 12)(3 27)(5 15)", SumByFactors.sumOfDivided(lst));
    }

    @Test
    public void testTwo() {
        int[] lst = new int[]{107, 158, 204, 100, 118, 123, 126, 110, 116, 100};
        Assertions.assertEquals("(2 1032)(3 453)(5 310)(7 126)(11 110)(17 204)(29 116)(41 123)(59 118)(79 158)(107 107)", SumByFactors.sumOfDivided(lst));
    }

    @Test
    public void testThree() {
        int[] lst = new int[]{125, -67, 499, 318, 193, 130, -67, 274, 349, 154, 297, 448, -27, 179, 208, 4, 7, 357, 319};
        Assertions.assertEquals("(2 1536)(3 945)(5 255)(7 966)(11 770)(13 338)(17 357)(29 319)(53 318)(67 -134)(137 274)(179 179)(193 193)(349 349)(499 499)", SumByFactors.sumOfDivided(lst));
    }

    @Test
    public void testOneOther() {
        int[] lst = new int[]{12, 15};
        Assertions.assertEquals("(2 12)(3 27)(5 15)", SumByFactors.sumOfDividedOther(lst));
    }

    @Test
    public void testTwoOther() {
        int[] lst = new int[]{107, 158, 204, 100, 118, 123, 126, 110, 116, 100};
        Assertions.assertEquals("(2 1032)(3 453)(5 310)(7 126)(11 110)(17 204)(29 116)(41 123)(59 118)(79 158)(107 107)", SumByFactors.sumOfDividedOther(lst));
    }

    @Test
    public void testThreeOther() {
        int[] lst = new int[]{125, -67, 499, 318, 193, 130, -67, 274, 349, 154, 297, 448, -27, 179, 208, 4, 7, 357, 319};
        Assertions.assertEquals("(2 1536)(3 945)(5 255)(7 966)(11 770)(13 338)(17 357)(29 319)(53 318)(67 -134)(137 274)(179 179)(193 193)(349 349)(499 499)", SumByFactors.sumOfDividedOther(lst));
    }

}
