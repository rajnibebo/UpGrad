package com.rajni.course_one.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        try {
            File file = new File("src/main/resources/AliceInWonderLand1.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found !! Sorry !!!");
        }
    }
}
