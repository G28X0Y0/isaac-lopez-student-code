package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Module1CodingAssessment {

    static File input = new File("MovieInput.csv");
    static List<Rental> productList = new ArrayList<Rental>();
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Rental rental = new Rental("Shrek 2", "DVD", true);
        readInputFile(input);
        listTotal(productList);

    }

    public static void readInputFile(File input) {
        try (Scanner scanner = new Scanner(input)) {
            while (scanner.hasNextLine()) {
                String[] lineArr = scanner.nextLine().split(",");
                Boolean.parseBoolean(lineArr[2]);
                Rental rental = new Rental(lineArr[0], lineArr[1], Boolean.parseBoolean(lineArr[2]));
                productList.add(rental);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("CSV goofed");
            ;
        }
    }

    public static void listTotal(List<Rental> input) {
        double counter = 0.0;
        for (int i = 0; i < input.size(); i++) {
            counter = counter + input.get(i).getRentalPrice();
        }
        System.out.println("Total rental cost for all movies: " + counter);
    }
}
