package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000, but greater than 1000.");
//        } else if (score < 1000) {
//            System.out.println("Your score was less than 1000.");
//        } else {
//            System.out.println("Got here.");
//        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        // Print out a second score on the screen with the following
        // score set to 1000
        // levelCompleted set to 8
        // bonus set to 200
        // But make sure the first printout above still runs

        score = 1000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int secondScore = score + (levelCompleted * bonus);
            System.out.println("The second score is " + secondScore);
        }
    }
}
