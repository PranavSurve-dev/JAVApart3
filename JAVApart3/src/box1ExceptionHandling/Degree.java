package box1ExceptionHandling;

import java.util.Scanner;

public class Degree {
	public static void pass(int percentage) throws Z2Exception {
		if (percentage > 35) {
			System.out.println("Bhai tu pass hogya...");
		} else {

			throw new Z2Exception();
		}
	}

	public static void Driver(int age) throws Z2Exception {
		if (age > 21) {
			System.out.println("You Are Eligible So Drive Safe......");
		} else {
			throw new Z2Exception();
		}
	}

	public static void main(String[] args) {
		System.out.println("Code Start");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your percentage");
		int percentage = sc.nextInt();
		System.out.println("Enter your age");
		int age = sc.nextInt();
		try {
			Driver(age);
		} catch (Z2Exception z2) {
			System.out.println("Still u are not Eligible...");
		}
		try {
			pass(percentage);
		} catch (Z2Exception z1) {
			System.out.println("Fail hai tu....");

		} finally {
			System.out.println("All The Best...");
			sc.close();
		}

		System.out.println("Code End");
	}
}
