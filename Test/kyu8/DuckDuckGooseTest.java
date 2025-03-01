package kyu8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DuckDuckGooseTest {
    @Test
    public void tests() {
        Player[] players = makePlayerArr(new String[] {"a", "b", "c", "d", "c", "e", "f", "g", "h", "z"});
        Assertions.assertEquals("a", DuckDuckGoose.duckDuckGoose(players, 1));
        Assertions.assertEquals("c", DuckDuckGoose.duckDuckGoose(players, 3));
        Assertions.assertEquals("z", DuckDuckGoose.duckDuckGoose(players, 10));
        Assertions.assertEquals("z", DuckDuckGoose.duckDuckGoose(players, 20));
        Assertions.assertEquals("z", DuckDuckGoose.duckDuckGoose(players, 30));
        Assertions.assertEquals("g", DuckDuckGoose.duckDuckGoose(players, 18));
        Assertions.assertEquals("g", DuckDuckGoose.duckDuckGoose(players, 28));
        Assertions.assertEquals("b", DuckDuckGoose.duckDuckGoose(players, 12));
        Assertions.assertEquals("b", DuckDuckGoose.duckDuckGoose(players, 2));
        Assertions.assertEquals("f", DuckDuckGoose.duckDuckGoose(players, 7));
    }

    private Player[] makePlayerArr(String[] names) {
        Player[] players = new Player[names.length];
        for (int i = 0; i < names.length; i++) {
            players[i] = new Player(names[i]);
        }
        return players;
    }
}