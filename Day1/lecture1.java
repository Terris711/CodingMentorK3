package Lecture1;

import java.util.Scanner;

public class lecture1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the length of side a: ");
		double a = scanner.nextDouble();

		System.out.print("Enter the length of side b: ");
		double b = scanner.nextDouble();

		double A = a * b;
		double P = 2 * (a + b);
		double p = sqrt(a * a + b * b);

		System.out.printf("Area: %.2f%n", A);
		System.out.printf("Perimeter: %.2f%n", P);
		System.out.printf("Diagonal: %.2f%n", p);
	}

	public static double sqrt(double number) {
		double temp; // used to store the previous value of squareRoot
		double squareRoot = number / 2; // is initialized to the input number divided by 2.

		do {
			temp = squareRoot;
			// Use Babylonian method, which involves repeatedly averaging the input number
			// with its reciprocal
			// until the difference between successive values of the square root becomes
			// negligible.
			squareRoot = (temp + (number / temp)) / 2;
		} while ((temp - squareRoot) != 0);

		return squareRoot;
	}

}

