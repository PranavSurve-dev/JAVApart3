package box1ExceptionHandling;

import java.util.Scanner;

//StringIndexOutOfBoundsException
public class Pirana {
	public static void main(String[] args) {
		System.out.println("Code Start");

		String str = "pranav";

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the index of char u like to print");

		int n = sc.nextInt();
		try {
			System.out.println(str.charAt(n));
		} catch (StringIndexOutOfBoundsException s1) {
			System.out.println("Index bahar ja rha hai");
		}
		System.out.println("code End");
	}
}
