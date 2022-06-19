package kyu6;

import org.junit.jupiter.api.*;

public class MultiplesOf3Or5Test {
    @Test
    public void test() {
        Assertions.assertEquals(23, MultiplesOf3Or5.solution(10)); //3 5 6 9
        Assertions.assertEquals(78, MultiplesOf3Or5.solution(20)); //3 5 6 9 10 12 15 18
        Assertions.assertEquals(195, MultiplesOf3Or5.solution(30)); //3 5 6 9 10 12 15 18 20 21 24 25 27
    }

    @Test
    public void testWithStream() {
        Assertions.assertEquals(23, MultiplesOf3Or5.solutionWithStream(10)); //3 5 6 9
        Assertions.assertEquals(78, MultiplesOf3Or5.solutionWithStream(20)); //3 5 6 9 10 12 15 18
        Assertions.assertEquals(195, MultiplesOf3Or5.solutionWithStream(30)); //3 5 6 9 10 12 15 18 20 21 24 25 27
    }
}
