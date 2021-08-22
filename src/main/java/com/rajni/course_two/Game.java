package com.rajni.course_two;

public class Game {
    private int points1;
    private int points2;

    public void game(Card card1, Card card2) {
        int value1 = card1.getValue();
        int value2 = card2.getValue();

        if(value1 < value2) {
            points2++;
        } else if(value1 > value2) {
            points1++;
        } else {
            // check the priority of suit
            int priority1 = card1.getSuitPriority();
            int priority2 = card2.getSuitPriority();
            if(priority1 < priority2) {
                points1++;
            } else if(priority1 > priority2) {
                points2++;
            }
            System.out.println("points of player 1 :" + " " + points1);
            System.out.println("points of player 2 :" + " " + points2);
        }
    }
}
