package com.rajni.course_one.switchNLoops;

import java.util.Scanner;

public class IncomeTaxTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = scanner.nextDouble();
        int age = scanner.nextInt();
        double taxAmount = 0.0;
        double upperBound = income;

        if(income >= 250001 /*&& income <= 300000*/) {
            if(age < 60) {
                if(income > 300000) {
                    upperBound = 300000;
                }
                taxAmount = (upperBound - 250000) * 0.10;
            }
        }
        upperBound = income;
        if(income >= 300001  /*&& income <= 500000*/) {
            if(age < 80) {
                if(income > 500000) {
                    upperBound = 500000;
                }
                taxAmount += (upperBound - 300000) * 0.10;
            }
        }
        upperBound = income;
        if(income >= 500001  /*&& income <= 1000000*/) {
            if(income > 1000000) {
                upperBound = 1000000;
            }
            taxAmount += (upperBound - 500000) * 0.20;
        }
        upperBound = income;
        if(income > 1000000){
            if(income > 1000000) {
                upperBound = 1000000;
            }
            taxAmount += (upperBound - 1000000) * 0.30;
        }
        System.out.println(taxAmount);
    }
}
