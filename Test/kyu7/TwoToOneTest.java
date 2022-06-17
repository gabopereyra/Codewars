package kyu7;

import org.junit.jupiter.api.*;

public class TwoToOneTest {
    @Test
    public void test() {
        Assertions.assertEquals("aehrsty", TwoToOne.longest("aretheyhere", "yestheyarehere"));
        Assertions.assertEquals("abcdefghilnoprstu", TwoToOne.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
        Assertions.assertEquals("acefghilmnoprstuy", TwoToOne.longest("inmanylanguages", "theresapairoffunctions"));
    }
}
