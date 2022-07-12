package com.techelevator;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		//Init new scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to find fib numbers up to");
		String value = input.nextLine();
		//Alias target value from input
		int fibEnd = Integer.parseInt(value);
		//Assign array and give it length of target
		int[] fibArr = new int[fibEnd];
		//Make string to push numbers into after logic gate.
		String resultString = "";
		//Edge case: if target is either 0 or 1, just push number to string and end.
		if(fibEnd == 1 || fibEnd == 0){
			resultString = "0, 1";
		}
		else {
			//Loop Daddy - Marc Rebillet
			for (int i = 0; i < fibEnd; i++) {
				//At first index,
				if (i == 0) {
					//Just pass i
					resultString = resultString + i + " ";
				}
				else if (i == 1) {
					//Just pass i at second index. Added i + logic for redundancy.
					fibArr[i] = i + fibArr[i - 1];
					resultString = resultString + (i - fibArr[i - 1]) + " ";
				}
				//If sum of indexes > fib target: break.
				else if (fibArr[i - 1] + fibArr[i - 2] > fibEnd) {
					break;
				}
				//If sum of indexes = fib target: include at end, break.
				else if (fibArr[i - 1] == fibEnd) {
					resultString = resultString + fibEnd;
					break;
				}
				//If sum of indexes passes all interrogation, push to string.
				else {
					fibArr[i] = fibArr[i - 1] + fibArr[i - 2];
					resultString = resultString + (fibArr[i - 1] + fibArr[i - 2]) + " ";
				}
			}
		}
		//END
		System.out.println(resultString);
		return;
	}

}
