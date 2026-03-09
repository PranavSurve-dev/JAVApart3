package box1ExceptionHandling;

import java.util.Scanner;

public class BhushanKiPremKhani {
	public static void main(String[] args) {
		System.out.println("main  start");
		System.out.println("Bhiwandi");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number :-");
		int n1 = sc.nextInt();
		System.out.println("Enter 2nd Number :-");
		int n2 = sc.nextInt();

		try {
			System.out.println(n1 / n2);
		} catch (ArithmeticException a1) {
			System.out.println("Gadhe zero se divide mat kar");
		}

		System.out.println("Dombivali");
		System.out.println("main end");
	}
}
