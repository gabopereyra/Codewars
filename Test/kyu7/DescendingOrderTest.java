package kyu7;

import org.junit.jupiter.api.*;

public class DescendingOrderTest {
    @Test
    public void test_01() {
        Assertions.assertEquals(0, DescendingOrder.sortDesc(0));
    }

    @Test
    public void test_02() {
        Assertions.assertEquals(51, DescendingOrder.sortDesc(15));
    }


    @Test
    public void test_03() {
        Assertions.assertEquals(987654321, DescendingOrder.sortDesc(123456789));
    }
}
