package com.bridgelabz;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Deck {
    static String[] suit = { "Spades", "Hearts", "Diamond", "Clubs" };
    static String[] rank = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
    String[][] cardCombo = new String[4][13];

    static Scanner inp = new Scanner(System.in);
    static List<Player> playerList = new ArrayList<Player>();


    void assignCard() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                cardCombo[i][j] = suit[i] + rank[j];
            }
        }

    }
    public static void addPlayer(int numberOfPlayers) {
        System.out.println("Enter players details");
        if (numberOfPlayers <= 4 && numberOfPlayers > 2) {
            for (int i = 0; i < numberOfPlayers; i++) {
                System.out.println("Enter first name");
                String fn = inp.nextLine();
                System.out.println("Enter Last name");
                String ln = inp.nextLine();
                Player player = new Player(fn, ln);
                playerList.add(player);
                for (int j = 0; j < playerList.size(); j++) {
                    System.out.println(playerList.get(j));
                }
            }

        } else {
            System.out.println("More than 4 player not allowed");
        }
    }
    public void playerOrder(int numberOfPlayers){
            System.out.println("Enter Player Order");
            for (int i=0;i<numberOfPlayers;i++){
                System.out.println("Player Order:" +(i+1));
                int turn = inp.nextInt();
            }
        }

    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println("Enter number of players");
        int number= inp.nextInt();
        deck.assignCard();
        deck.addPlayer(number);
        deck.playerOrder(number);

    }
}


