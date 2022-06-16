package kyu8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumArrayTest {
    @Test
    public void testSum() {
        Assertions.assertEquals(0,      SumArray.sum(new double[] { }),                1e-4);
        Assertions.assertEquals(-2.398, SumArray.sum(new double[] {-2.398}),           1e-4);
        Assertions.assertEquals(6,      SumArray.sum(new double[] {1, 2, 3}),          1e-4);
        Assertions.assertEquals(6.6,    SumArray.sum(new double[] {1.1, 2.2, 3.3}),    1e-4);
        Assertions. assertEquals(9.2,    SumArray.sum(new double[] {1, 5.2, 4, 0, -1}), 1e-4);
        Assertions.assertEquals(320,    SumArray.sum(new double[] {30, 89, 100, 101}), 1e-4);
    }

    @Test
    public void testSumWithStream() {
        Assertions.assertEquals(0,      SumArray.sumWithStream(new double[] { }),                1e-4);
        Assertions.assertEquals(-2.398, SumArray.sumWithStream(new double[] {-2.398}),           1e-4);
        Assertions.assertEquals(6,      SumArray.sumWithStream(new double[] {1, 2, 3}),          1e-4);
        Assertions.assertEquals(6.6,    SumArray.sumWithStream(new double[] {1.1, 2.2, 3.3}),    1e-4);
        Assertions. assertEquals(9.2,    SumArray.sumWithStream(new double[] {1, 5.2, 4, 0, -1}), 1e-4);
        Assertions.assertEquals(320,    SumArray.sumWithStream(new double[] {30, 89, 100, 101}), 1e-4);
    }
}
