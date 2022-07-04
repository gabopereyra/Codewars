package kyu7;

import org.junit.jupiter.api.*;

import java.util.List;

public class ListFilteringTest {
    @Test
    public void examples() {
        Assertions.assertEquals(List.of(1, 2), ListFiltering.filterList(List.of(1, 2, "a", "b")), "For input: [1, 2, \"a\", \"b\"]");
        Assertions.assertEquals(List.of(1, 0, 15), ListFiltering.filterList(List.of(1, "a", "b", 0, 15)), "For input: [1, \"a\", \"b\", 0, 15]");
        Assertions.assertEquals(List.of(1, 2, 123), ListFiltering.filterList(List.of(1, 2, "aasf", "1", "123", 123)), "For input: [1, 2, \"aasf\", \"1\", \"123\", 123]");
    }
}
