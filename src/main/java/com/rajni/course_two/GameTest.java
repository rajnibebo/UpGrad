package com.rajni.course_two;

import java.util.Scanner;

public class GameTest {
    public static void main(String[] args) {
        Card card1 = new Card();
        Card card2 = new Card();

        Scanner scanner = new Scanner(System.in);
        card1.setValue(scanner.nextInt());
        scanner.nextLine();
        card1.setSuit(scanner.nextLine());
        card2.setValue(scanner.nextInt());
        scanner.nextLine();
        card2.setSuit(scanner.nextLine());

        Game game = new Game();
        game.game(card1, card2);
    }
}
