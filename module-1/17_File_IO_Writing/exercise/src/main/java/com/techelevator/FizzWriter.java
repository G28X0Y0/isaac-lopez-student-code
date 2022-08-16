package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter destination file: ");

		File destination = new File(input.nextLine());
		try {
			PrintWriter dataOut = new PrintWriter(destination);
			for (int i = 1; i < 301; i++) {
				if(i % 3 == 0 && i % 5 == 0) {
					dataOut.println("FizzBuzz");
					dataOut.flush();
				} else if(i % 3 == 0){
					dataOut.println("Fizz");
					dataOut.flush();
				} else if(i % 5 == 0){
					dataOut.println("Buzz");
					dataOut.flush();
				}
				else{
					dataOut.println(i);
					dataOut.flush();
				}
			}
			dataOut.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");;
		}


	}

}
