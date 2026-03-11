package box1ExceptionHandling;

import java.util.Scanner;

//ArrayIndexOutOfBoundsException
public class Lodha {
	public static void main(String[] args) {
		System.out.println("Main Start");

		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		// length 9 & index 0 - 8

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no.");
		int n = sc.nextInt();
		try {
			System.out.println(arr[n]);
		} catch (ArrayIndexOutOfBoundsException a1) {
			System.out.println("Terrace pe ja rha hai kam kr");
		}

		System.out.println("Main End");

	}
}
