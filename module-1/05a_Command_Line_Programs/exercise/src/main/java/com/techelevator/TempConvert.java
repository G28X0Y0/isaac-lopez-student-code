package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		//Init scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Enter temp to convert.");
		String value = input.nextLine();
		//Get temp in double form from input.
		double tempToConvert = Double.parseDouble(value);
		System.out.println("Is temp in Fahrenheit(F) or Celsius(C)?");
		value = input.nextLine();
		//Get unit of measurement from input as string. Kelvin: "Am I a joke to you?"
		String tempUnit = value;
		double convertedTemp = 0;
		//Logic gate: Check units, convert accordingly. Self-explanatory.
		if(tempUnit.equals("F") || tempUnit.equals("f")){
			convertedTemp = (tempToConvert - 32) / 1.8;
		}
		else if(tempUnit.equals("C") || tempUnit.equals("c")){
			convertedTemp = tempToConvert * 1.8 + 32;
		}
		//Edge case: if nothing is entered or invalid entry.
		else{
			System.out.println("Enter a valid number and unit.");
		}
		//END
		System.out.println(convertedTemp);
	}

}
