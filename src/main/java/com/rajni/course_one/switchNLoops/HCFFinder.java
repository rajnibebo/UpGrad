package com.rajni.course_one.switchNLoops;

import java.util.Scanner;

public class HCFFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        int hcf = 0;
        int count = 1;
        while (count <= number1 || count <= number2) {
            if (number1 % count == 0 && number2 % count == 0) {
                hcf = count;
            }
            count++;
        }
        System.out.println("HCF is ::"+hcf);
        scanner.close();
    }
}
