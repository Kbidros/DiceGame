package com.kristian.test;

import com.kristian.labb.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DetermineWinnerTest {
    @Test
    public void determineWinner() {

        Player player1 = new Player("Alice");
        Player player2 = new Player("Bob");
        Player player3 = new Player("Charlie");

        player1.addToScore(10);
        player2.addToScore(15);
        player3.addToScore(5);

        Player[] players = {player1, player2, player3};

        Player winningPlayer = players[0];
        for (Player player : players) {
            if (player.getScore() > winningPlayer.getScore()) {
                winningPlayer = player;
            }
        }

        assertEquals(player2, winningPlayer); // Bob should be the winner here
    }
}
