//LEVEL: kyu 8
//link: https://www.codewars.com/kata/582e0e592029ea10530009ce/train/java

/**DESCRIPTION
 * The objective of Duck, duck, goose is to walk in a circle, tapping on each player's head until one is chosen.
 *
 * Task: Given an array of Player objects (an array of associative arrays in PHP) and an index (1-based), return the name
 * of the chosen Player(name is a property of Player objects, e.g Player.name)
 *
 * Example:
 * duck_duck_goose([a, b, c, d], 1) should return a.name
 * duck_duck_goose([a, b, c, d], 5) should return a.name
 * duck_duck_goose([a, b, c, d], 4) should return d.name
 */

package kyu8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DuckDuckGoose {
   public static String duckDuckGoose(Player[] players, int goose) {
        return players[(goose - 1) % players.length].name;
    }
}

class Player {
   public String name;

    Player(String name){
        this.name = name;
    }
}

class DuckDuckGooseTest {
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

