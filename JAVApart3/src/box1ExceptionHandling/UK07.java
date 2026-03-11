package box1ExceptionHandling;

import java.util.Scanner;

//Finally block
public class UK07 {
	// Unchecked Exception Arithmetic Exception
	public static void bhagkar(int a, int b) {

		System.out.println(a / b);
	}

	public static void main(String[] args) {
		System.out.println("main start");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Number");
		int b = sc.nextInt();
		try {
			bhagkar(a, b);
		} catch (ArithmeticException a1) {
			System.out.println("Bawalat zero se divide mat kar");
		} finally {
			sc.close();
			System.out.println("Thanku for visiting,come again");
		}

		System.out.println("main end");
	}
}
