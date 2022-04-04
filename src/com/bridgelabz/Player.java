package com.bridgelabz;

public class Player {
    String firstname;
    String lastName;
    int playerTurn;


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPlayerTurn() {
        return playerTurn;
    }

    public void setPlayerTurn(int playerTurn) {
        this.playerTurn = playerTurn;
    }

    public Player(String firstname, String lastName) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.playerTurn = 0;

    }

    @Override
    public String toString() {
        return "Player{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", playerTurn=" + playerTurn +
                '}';
    }
}