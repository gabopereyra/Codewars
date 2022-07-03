package kyu7;

import org.junit.jupiter.api.*;

public class DisemvowelTrollsTest {
    @Test
    public void FixedTests() {
        Assertions.assertEquals("Ths wbst s fr lsrs LL!", DisemvowelTrolls.disemvowel("This website is for losers LOL!")
        );
        Assertions.assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd", DisemvowelTrolls.disemvowel(
                "No offense but,\nYour writing is among the worst I've ever read"));
        Assertions.assertEquals("Wht r y,  cmmnst?", DisemvowelTrolls.disemvowel("What are you, a communist?"));
    }
}
