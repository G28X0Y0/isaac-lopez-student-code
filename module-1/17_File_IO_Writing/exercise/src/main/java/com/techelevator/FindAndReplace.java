package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word to look for: ");
        String searchWord = input.nextLine();
        System.out.println("Enter replacement word: ");
        String replaceWord = input.nextLine();
        System.out.println("Enter source file path: ");
        File source = new File(input.nextLine());
        System.out.println("What is the designation path: ");
        File destination = new File(input.nextLine());


        try {
            Scanner sourceIn = new Scanner(source);
            PrintWriter sourceOut = new PrintWriter(destination);
            while (sourceIn.hasNextLine()){
                String lineOfInput = sourceIn.nextLine();
                sourceOut.println(lineOfInput.replaceAll(searchWord, replaceWord));
                sourceOut.flush();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File(s) does not exist!");
        }


    }

}
