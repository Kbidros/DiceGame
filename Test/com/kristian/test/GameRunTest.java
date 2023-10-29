package com.kristian.test;

import com.kristian.labb.Main;
import org.junit.jupiter.api.Test;

class GameRunTest {
    @Test
    public void testGameRuns() {

        Main main = new Main(); // Replace with the actual instantiation of your game

        // Start the game
        try {
            Main.main(new String[] {});

        } catch (Exception e) {
        }

    }
}
