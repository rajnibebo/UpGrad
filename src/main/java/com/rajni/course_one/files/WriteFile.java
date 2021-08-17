package com.rajni.course_one.files;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) {
        writeUserInput();
        writePrimeNumbers();
    }

    static void writeUserInput() {
        try {
            FileWriter fileWriter = new FileWriter("src/main/resources/UserOutput.txt");
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            fileWriter.write(line);
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void writePrimeNumbers() {
        try {
            FileWriter fileWriter = new FileWriter("src/main/resources/PrimeNumbers.txt");
            for(int i = 2 ; i < 1000; i++) {
                boolean prime = true;
                for(int j = 2; j < Math.sqrt(i); j++) {
                    if(i % j == 0) {
                        prime = false;
                        break;
                    }
                }
                if(prime) {
                    System.out.println("Writing to file ::"+i);
                    fileWriter.write(i + " ");
                }
            }
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
