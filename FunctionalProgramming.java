package com.functionalProgrammingg;

import java.util.Scanner;

public class FunctionalProgramming {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the temperature in Fahrenheit: ");
		double tempra = input.nextDouble();

		System.out.print("Enter the wind speed in miles per hour: ");
		double v = input.nextDouble();

		if (tempra >= -58 && tempra <= 41 && v >= 2) {

			double windChill = 35.74 + (0.6215 * tempra) + (0.4275 * tempra - 35.75) * (Math.pow(v, 0.16));

			System.out.println("The wind chill index is " + windChill);

		} else

			System.out.println("The temperature and/or wind speed is invalid.");

	}

}
