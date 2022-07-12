package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		//Init scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a distance to convert:");
		String value = input.nextLine();
		//Get distance in double form from input.
		double disToConvert = Double.parseDouble(value);
		System.out.println("Feet(F) or Meters?(M)");
		value = input.nextLine();
		//Create result variable.
		double convertedUnit = 0;
		//Get unit of measurement from input. https://www.youtube.com/watch?v=AKLZ2453snI&ab_channel=thetrashmann
		String unitOfMeasurement = value;
		//Logic gate: check for unit of measurement, convert accordingly. Self-explanatory.
		if(unitOfMeasurement.equals("F") || unitOfMeasurement.equals("f")){
			convertedUnit = disToConvert * 0.3048;
		}
		else if (unitOfMeasurement.equals("M") || unitOfMeasurement.equals("m")){
			convertedUnit = disToConvert * 3.2808399;
		}
		System.out.println(convertedUnit);
	}

}
//Are you feeling it now, Mr. Krabs?