package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to convert to binary.");
		String value = input.nextLine();
		int decimal = Integer.parseInt(value);
		int[] binArr = new int[decimal];
		int i = 0;
		while(decimal > 0){
			binArr[i] = decimal % 2;
			decimal = decimal / 2;
			i++;
		}
		for (int j = i - 1; j >= 0; j--)
			System.out.print(binArr[j]);

	}

}
