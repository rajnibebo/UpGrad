package com.rajni.course_one.switchNLoops;

public class Alphabets {
    public static void main(String[] args) {
        int ch = 'a';
        while(ch != 123) {
            System.out.print((char) ch);
            System.out.print(" ");
            ch++;
        }
        System.out.println("Int's max value is ::");
        System.out.println((char) Integer.MAX_VALUE);
        System.out.println("Int's min value is ::");
        System.out.println((char) Integer.MIN_VALUE);
    }
}
