package com.rajni.course_two;

public class Card {
    private int value;
    private String suit;

    private static final String HEARTS = "Hearts";
    private static final String DIAMONDS = "Diamonds";
    private static final String SPADES = "Spades";
    private static final String CLUBS = "Clubs";

    public Card() {

    }

    public Card(int value, String suit) {
        this.suit = suit;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getSuitPriority() {
        int priority = 0;
        switch (suit) {
            case SPADES:
                priority = 1;
                break;
            case DIAMONDS:
                priority = 2;
                break;
            case HEARTS:
                priority = 3;
                break;
            case CLUBS:
                priority = 4;
                break;
            default:
                System.out.println("Invalid Suit selected");
                break;
        }
        return priority;
    }
}
