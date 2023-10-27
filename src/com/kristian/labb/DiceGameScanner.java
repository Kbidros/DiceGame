package com.kristian.labb;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DiceGameScanner {
    private Scanner sc;

    public DiceGameScanner(){
        sc = new Scanner(System.in);

    }

    public String getPlayerName (String name){
        System.out.println(name);
        return sc.nextLine();

    }

    public int getNumberOfPlayers (String players){
        System.out.println(players);
        try {
            return sc.nextInt();
        }catch (InputMismatchException e){

            System.out.println("Invalid input, please enter an integer.");
            sc.nextLine();
            return getNumberOfPlayers(players);
        }

    }

    public int getNumberOfDice (String dice ) {
        System.out.println(dice);
        try {
            return sc.nextInt();
        }catch (InputMismatchException e){

            System.out.println("Invalid input, please enter an integer.");
            sc.nextLine();
            return getNumberOfDice(dice);
        }

    }

    public int getNumberOfRounds(String numRounds) {
        System.out.println(numRounds);
        try {
            return sc.nextInt();
        }catch (InputMismatchException e){

            System.out.println("Invalid input, please enter an integer.");
            sc.nextLine();
            return getNumberOfRounds(numRounds);
        }

    }


    public void nextLine() {
        sc.nextLine();
    }

}
