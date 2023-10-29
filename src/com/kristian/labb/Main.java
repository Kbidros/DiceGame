// DiceGame
// Created by Kristian, uploaded 2023-10-08
// A die game allowing you to choose the following:
// Number of players
// Number of dice
// Number of rounds
// Entering player names
// Each player gets to throw 1+ die a round
// The game displays the scores and also determines the winner
// Scanner has its own class, and so does Player
// If you type a character when asked for a number, the game will ask you to input an integer.
//
// For more information and detailed instructions, please see the README file.

package com.kristian.labb;


public class Main {
    public static void main(String[] args) {

        // Instantiate
        DiceGameScanner diceGameScanner = new DiceGameScanner();
        Dice dice = new Dice();

        System.out.println("Welcome to the game!");

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


        // Number of rounds + rolling

        int numRounds = diceGameScanner.getNumberOfRounds("How many rounds do you want to play?:");


        for (int round = 0; round < numRounds; round++) {
            for (Player player : players) {
                System.out.println(player.getName() + " is throwing!");

                int playerSum = 0;

                for (int j = 0; j < numDice; j++) {
                    int roll = dice.roll();
                    System.out.println(roll);
                    playerSum += roll;
                }

                player.addToScore(playerSum);

                System.out.println("The sum is: " + playerSum);
            }
        }

        // Display scores and determine the winner!!

        // DisplayScores
        for (Player player : players) {
            System.out.println(player.getName() + " total score: " + player.getScore());
        }

        // Winner!!
       Player winningPlayer = players[0];
        for (int i = 0; i < numPlayers; i++) {
            if (players[i].getScore() > winningPlayer.getScore()) {
                winningPlayer = players[i];
            }
        }

        System.out.println("And the winner is... " + winningPlayer.getName() + ", Congratulations!");
    }
}