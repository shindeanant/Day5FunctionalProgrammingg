package com.functionalProgrammingg;

import java.util.Scanner;

public class FunctionalProgramming {

	public static void main(String[] args) {

		System.out.println("Welcome to functional program");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the values of x ");
		int x = sc.nextInt();

		System.out.println("Enter the value of y");
		int y = sc.nextInt();

		double distance = Math.sqrt(x * x + y * y);

		System.out.println("the distace is " + distance);

	}

}
