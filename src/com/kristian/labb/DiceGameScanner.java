package com.kristian.labb;

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
        return sc.nextInt();

    }

    public int getNumberOfDice (String dice ) {
        System.out.println(dice);
        return sc.nextInt();

    }

    public int getNumberOfRounds(String numRounds) {
        System.out.println(numRounds);
        return sc.nextInt();
    }


    public void nextLine() {
        sc.nextLine();
    }

}
