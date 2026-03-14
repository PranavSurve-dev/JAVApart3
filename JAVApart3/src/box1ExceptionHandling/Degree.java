package box1ExceptionHandling;

import java.util.Scanner;

public class Degree {
	public static void pass(int marks) throws Z2Exception {
		if (marks > 35) {
			System.out.println("Bhai tu pass hogya...");
		} else {

			throw new Z2Exception();
		}
	}

	public static void car(int age) throws Z2Exception {
		if (age > 21) {
			System.out.println("now u can drive me......");
		} else {
			throw new Z2Exception();
		}
	}

	public static void main(String[] args) {
		System.out.println("Code Start");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Marks");
		int marks = sc.nextInt();
		System.out.println("Enter your age");
		int age = sc.nextInt();
		try {
			car(age);
		} catch (Z2Exception z2) {
			System.out.println("wait for some time...");
		}
		try {
			pass(marks);
		} catch (Z2Exception z1) {
			System.out.println("Fail hai tu....");

		} finally {
			System.out.println("All The Best...");
			sc.close();
		}

		System.out.println("Code End");
	}
}
