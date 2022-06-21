package kyu5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class IsMyFiendCheatingTest {
    @Test
    public void test12() {
        List<long[]> res = new ArrayList<>();
        res.add(new long[] {15, 21});
        res.add(new long[] {21, 15});
        List<long[]> a = IsMyFiendCheating.removNb(26);
        Assertions.assertArrayEquals(res.get(0), a.get(0));
        Assertions.assertArrayEquals(res.get(1), a.get(1));
    }
    @Test
    public void test14() {
        List<long[]> res = new ArrayList<long[]>();
        List<long[]> a = IsMyFiendCheating.removNb(100);
        Assertions.assertTrue(res.size() == a.size());
    }
}