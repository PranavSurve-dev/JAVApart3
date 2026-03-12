package box1ExceptionHandling;

import java.util.Scanner;

public class ShadiDotCom {
	public static void eligible(int age) throws HalkatException {
		if (age > 21) {
			System.out.println("karle beta shadi");
		} else {

			throw new HalkatException();
		}
	}

	public static void main(String[] args) {
		System.out.println("code start");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		try {
			eligible(age);
		} catch (HalkatException h1) {
			System.out.println("Have a patience abhi tu bacha hai");
		} finally {
			System.out.println("thanku visit again");
			sc.close();
		}
		System.out.println("code end");

	}
}
