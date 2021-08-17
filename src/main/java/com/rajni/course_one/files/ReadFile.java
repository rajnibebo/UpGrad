package com.rajni.course_one.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("src/main/resources/AliceInWonderLand.txt");
        Scanner scanner = new Scanner(inputFile);
        //testByLine(scanner);
        testByWord(scanner);
        scanner.close();
    }

    static void testByLine(Scanner scanner) {
        int lineNumber = 1;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(lineNumber+" : "+line);
            lineNumber++;
        }
    }

    static void testByWord(Scanner scanner) {
        int lineNumber = 1;
        while (scanner.hasNext()) {
            String word = scanner.next();
            System.out.println(lineNumber+" : "+word);
            lineNumber++;
        }
    }
}
