package com.kristian.labb;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Instantiate
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Variables
        String player1;
        String player2;
        int numDice;
        int rounds = 3;
        int player1Sum = 0;
        int player2Sum = 0;

        // Player1 - Name
        System.out.println("Enter the name for player 1:");
        player1 = sc.nextLine();
        System.out.println("Player 1's name is " + player1);

        // Player2 - Name
        System.out.println("Enter the name for player 2:");
        player2 = sc.nextLine();
        System.out.println("Player 2's name is " + player2);

        // Number of Dice
        System.out.println("Enter the number of dice you want to play with:");
        numDice = sc.nextInt();



        // // // // // //
        // Game Logic  //
        // // // // // //


        // Player1 turn
        System.out.println(player1 + " is throwing!");

        for (int i = 0; i < rounds; i++){
            for (int j = 0; j < numDice; j++) {

            int roll = random.nextInt(6) + 1;
            System.out.println(roll); // Throw Dice

            player1Sum += roll;
            }

            System.out.println("The sum is: " + player1Sum);
        }


        // Player2 turn
        System.out.println(player2 + " is throwing!");

        for (int i = 0; i < rounds; i++) {
            for (int j = 0; j < numDice; j++) {

            int roll = random.nextInt(6) + 1;
            System.out.println(roll); // Throw Dice

            player2Sum += roll;
            }

            System.out.println("The sum is: " + player2Sum);
        }

         // The sum of both players
        System.out.println(player1 + " score: " + player1Sum);
        System.out.println(player2 + " score: " + player2Sum);

        // The Winner is...
        if (player1Sum > player2Sum){
            System.out.println("And the winner is... " + player1 + ", Congratulations!");
        } else if (player2Sum > player1Sum){
            System.out.println("And the winner is... " + player2 + ", Congratulations!");
        }else {
            System.out.println("You're equally lucky, buy a lottery ticket!");
        }

    }
}