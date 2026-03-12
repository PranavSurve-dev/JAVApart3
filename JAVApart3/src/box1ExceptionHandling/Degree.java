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

	public static void main(String[] args) {
		System.out.println("Code Start");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Marks");
		int marks = sc.nextInt();
		try {
			pass(marks);
		} catch (Z2Exception z1) {
			System.out.println("Fail hai tu....");
			sc.close();
		} finally {
			System.out.println("All The Best...");
		}
		System.out.println("Code End");
	}
}
