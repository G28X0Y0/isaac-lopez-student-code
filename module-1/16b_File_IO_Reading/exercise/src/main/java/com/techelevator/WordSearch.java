package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WordSearch {

	public static void main(String[] args) {
		System.out.println("Please enter a file: ");
		Scanner scanner = new Scanner(System.in);
		String filename = scanner.nextLine();
		File file = new File(filename);
		System.out.println("Please enter a word to search for: ");
		String searchWord = scanner.nextLine();
		System.out.println("Should the word be case sensitive? (Y/N)");

		boolean isCaseSensitive = scanner.nextLine().toUpperCase().equals("Y");

		if(isCaseSensitive){
			searchWord.toLowerCase();
			filename.toLowerCase();
		}

		try(Scanner fileScanner = new Scanner(file)){
			int lineCount = 0;

			if(isCaseSensitive){
			while(fileScanner.hasNextLine()) {
				lineCount++;
				String current = fileScanner.nextLine();
				if (current.contains(searchWord)) {
					System.out.println(lineCount + ") " + current);
				}
			}
			}
			else {
				while (fileScanner.hasNextLine()) {
					lineCount++;
					String lowercase = searchWord.toLowerCase();
					String current = fileScanner.nextLine();
					String currentLower = current.toLowerCase();
					if (currentLower.contains(lowercase)) {
						System.out.println(lineCount + ") " + current);
					}
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println("We couldn't find it");
		}


	}

}
