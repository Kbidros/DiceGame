package com.kristian.test;

import com.kristian.labb.Dice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {
    @Test
    public void testRollInRange() {
        Dice dice = new Dice();
        for (int i = 0; i < 1000; i++) {
            int result = dice.roll();
            assertTrue(result >= 1 && result <= 6, "Dice roll result out of range: " + result);
        }
    }

}