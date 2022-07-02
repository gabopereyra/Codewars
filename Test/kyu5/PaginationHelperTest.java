package kyu5;

import org.junit.jupiter.api.*;

import java.util.Arrays;

public class PaginationHelperTest {
    PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
    PaginationHelper<Character> helperEmpty = new PaginationHelper(Arrays.asList(), 4);

    @Test
    public void pageCount() {
        Assertions.assertEquals(2, helper.pageCount());
    }

    @Test
    public void itemCount() {
        Assertions.assertEquals(6, helper.itemCount());
    }

    @Test
    public void pageItemCount() {
        Assertions.assertEquals(4, helper.pageItemCount(0));
        Assertions.assertEquals(2, helper.pageItemCount(1));
        Assertions.assertEquals(-1, helper.pageItemCount(2));
    }

    @Test
    public void pageIndex() {
        Assertions.assertEquals(1, helper.pageIndex(5));
        Assertions.assertEquals(0, helper.pageIndex(2));
        Assertions.assertEquals(-1, helper.pageIndex(20));
        Assertions.assertEquals(-1, helper.pageIndex(-5));
    }

    @Test
    public void pageItemCountEmptyCollection() {
        Assertions.assertEquals(-1, helperEmpty.pageItemCount(0));
    }

    @Test
    public void pageIndexEmptyCollection() {
        Assertions.assertEquals(-1, helperEmpty.pageIndex(5));
    }

}