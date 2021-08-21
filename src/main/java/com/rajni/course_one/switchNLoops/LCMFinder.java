package com.rajni.course_one.switchNLoops;

import java.util.Scanner;

public class LCMFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int lcm = 0;
        int count = 1;
        while(true) {
            if(count % number1 == 0 && count % number2 == 0) {
                lcm = count;
                break;
            }
            count++;
        }
        System.out.println("LCM is ::"+lcm);

    }
}
