/*DESCRIPTION
Implement a function that computes the difference between two lists. The function should remove all occurrences of elements from the first list (a) that are present in the second list (b). The order of elements in the first list should be preserved in the result.
Examples

If a = [1, 2] and b = [1], the result should be [2].

If a = [1, 2, 2, 2, 3] and b = [2], the result should be [1, 3].
*/

package kyu6;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayDiff {

    public static int[] arrayDiff(int[] a, int[] b) {
        Set<Integer> bList = new HashSet<>();
        for(int value : b){
            bList.add(value);
        }

        List<Integer> aList = new ArrayList<>();
        for(int value : a){
            if(!bList.contains(value)){
                aList.add(value);
            }
        }

        return aList.stream().mapToInt(v -> v).toArray();

        /*
        Other possibles solutions:
            return IntStream.of(a).filter(x -> IntStream.of(b).noneMatch(y -> y == x)).toArray();
        *
            List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
            List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
            listA.removeAll(listB);
            return listA.stream().mapToInt(e -> e).toArray();
        * */
    }


    @Test
    public void sampleTests() {
        assertArrayEquals(new int[] {2}, arrayDiff(new int [] {1,2}, new int[] {1}));
        assertArrayEquals(new int[] {2,2}, arrayDiff(new int [] {1,2,2}, new int[] {1}));
        assertArrayEquals(new int[] {1}, arrayDiff(new int [] {1,2,2}, new int[] {2}));
        assertArrayEquals(new int[] {1,2,2}, arrayDiff(new int [] {1,2,2}, new int[] {}));
        assertArrayEquals(new int[] {}, arrayDiff(new int [] {}, new int[] {1,2}));
    }
}
