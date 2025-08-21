/*DESCRIPTION
The makeLooper() function (or make_looper in your language) takes a string (of non-zero length) as an argument. It returns a function. The function it returns will return successive characters of the string on successive invocations. It will start back at the beginning of the string once it reaches the end.

For example:
Supplier<Character> abc = Solution.makeLooper("abc");
abc.get(); // 'a'
abc.get(); // 'b'
abc.get(); // 'c'
abc.get(); // 'a' (loops back to the first character after reaching the end)

Different loopers should not affect each other, so be wary of unmanaged global state.
*/

package kyu5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class LazyRepeater {
    public static Supplier<Character> makeLooper2(String str) {
        return (() -> {
            class Counter{
                final String word = str;
                static int counter = 0;
                public Character getAndSum(){
                    int aux = counter;
                    counter++;
                    if(counter == word.length()) counter = 0;

                    return word.charAt(aux);
                }
            }

            var counter = new Counter();
            return counter.getAndSum();
        });
    }

    public static Supplier<Character> makeLooper(String str) {
        class Counter {
            String word = str;
            int counter = 0;
            Character getAndSum() {
                int aux = counter;
                counter++;
                if(counter == word.length()) counter = 0;

                return word.charAt(aux);
            }
        }

        Counter c = new Counter();

        return () -> c.getAndSum();
    }


    @Test
    void sampleTests() {
        Supplier<Character> looper = makeLooper("abc");

        assertEquals('a', looper.get());
        assertEquals('b', looper.get());
        assertEquals('c', looper.get());
        assertEquals('a', looper.get());
    }
}


