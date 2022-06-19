package kyu6;

import org.junit.jupiter.api.*;

import java.text.DecimalFormat;

public class BrakingWellTest {

    private BrakingWell exercise = new BrakingWell();

    private static void assertFuzzyEquals(double act, double exp) {
        boolean inrange = Math.abs(act - exp) <= 1e-2;
        if (inrange == false) {
            DecimalFormat df = new DecimalFormat("#.00");
            System.out.println("At 1e-2: Expected must be " + df.format(exp) +", but got " + df.format(act));
        }
       Assertions.assertTrue(inrange);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: dist");
        assertFuzzyEquals(exercise.dist(144, 0.3), 311.83146449201496);
        assertFuzzyEquals(exercise.dist(92, 0.5), 92.12909477605366);
        assertFuzzyEquals(exercise.dist(142, 0.2), 435.94398509960854);
        assertFuzzyEquals(exercise.dist(96, 0.2), 207.8876429946766);
    }
    @Test
    public void test2() {
        System.out.println("Fixed Tests: speed");
        assertFuzzyEquals(exercise.speed(159, 0.8), 153.79671564846308);
        assertFuzzyEquals(exercise.speed(164, 0.7), 147.91115701756493);
        assertFuzzyEquals(exercise.speed(153, 0.7), 142.14404997566152);
        assertFuzzyEquals(exercise.speed(88, 0.9), 113.64202099481099);
    }
}
