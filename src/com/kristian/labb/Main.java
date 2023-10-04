package com.kristian.labb;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Instantiate
        DiceGameScanner diceGameScanner = new DiceGameScanner();
        Random random = new Random();


        // Number of players
        int numPlayers = diceGameScanner.getNumberOfPlayers("Enter the number of players:");
        diceGameScanner.nextLine();

        // Get player names
        Player[] players = new Player[numPlayers];

        for (int i = 0; i < numPlayers; i++) {

            String playerNames = diceGameScanner.getPlayerName("Enter the name for player " + (i + 1) + ":");
            players[i] = new Player(playerNames);
            System.out.println("Player " + (i + 1) + " 's name is " + players[i].getName());

        }

        // Number of Dice
        int numDice = diceGameScanner.getNumberOfDice("How many dice do you want to play with?:");
        int rounds = 2;

        for (int round = 0; round < rounds; round++) {
            for (Player player : players) {
                System.out.println(player.getName() + " is throwing!");

                int playerSum = 0;

                for (int j = 0; j < numDice; j++) {
                    int roll = random.nextInt(6) + 1;
                    System.out.println(roll);
                    playerSum += roll;
                }

                player.addToScore(playerSum);

                System.out.println("The sum is: " + playerSum);
            }
        }

        // Display scores and determine the winner
       Player winningPlayer = players[0];
        for (int i = 0; i < numPlayers; i++) {
            if (players[i].getScore() > winningPlayer.getScore()) {
                winningPlayer = players[i];
            }
        }
        for (Player player : players) {
            System.out.println(player.getName() + " total score: " + player.getScore());
        }

        System.out.println("And the winner is... " + winningPlayer.getName() + ", Congratulations!");
    }
}