package com.rajni.course_one.arrays;

public class Array {
    public static void main(String[] args) {
        printBackwards(new int[] {1,2,3,4,5});
    }
    public static void printBackwards(int[] numbers) {
        for(int i=numbers.length-1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}