package com.rajni.course_one.switchNLoops;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int date = scanner.nextInt();
        int day = 0;
        switch (month) {
            case "January":
                day = date;
                break;
            case "February":
                day = 31 + date;
                break;
            case "March":
                day = 31 + 28 + date;
                break;
            case "April":
                day = 31 + 28 + 31 + date;
                break;
            case "May":
                day = 31 + 28 + 31 + 30 + date;
                break;
            case "June":
                day = 31 + 28 + 31 + 30 + 31 + date;
                break;
            case "July":
                day = 31 + 28 + 31 + 30 + 31 + 30 + date;
                break;
            case "August":
                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + date;
                break;
            case "September":
                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + date;
                break;
            case "October":
                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + date;
                break;
            case "November":
                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + date;
                break;
            case "December":
                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + date;
                break;
        }
        System.out.println(day%7);

        if(day % 7 == 0 || day % 7 == 6)  {
            System.out.println("Hurray !");
        } else {
            System.out.println("Ohh its Workday");
        }
    }
}
