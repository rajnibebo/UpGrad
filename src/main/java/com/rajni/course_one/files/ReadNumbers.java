package com.rajni.course_one.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadNumbers {
    public static void main(String[] args) throws FileNotFoundException {

        calculateSum();
        calculateMean();
    }

    static  void calculateSum() throws FileNotFoundException {
        File file = new File("src/main/resources/Numbers.txt");
        Scanner scanner = new Scanner(file);
        int sum = 0;
        while (scanner.hasNext()) {
            sum += scanner.nextInt();
        }
        System.out.println(sum);
    }

    static void calculateMean() throws FileNotFoundException{
        File file = new File("src/main/resources/Numbers.txt");
        Scanner scanner = new Scanner(file);
        int sum = 0;
        int count = 0;
        while (scanner.hasNext()) {
            sum += scanner.nextInt();
            count++;
        }
        double mean = Double.valueOf(sum)/count;
        System.out.println(mean);
    }
}
