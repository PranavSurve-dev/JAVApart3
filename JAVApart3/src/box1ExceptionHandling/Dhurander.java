package box1ExceptionHandling;

import java.util.Scanner;

public class Dhurander {
	public static void main(String[] args) {

		System.out.println("Code start");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();

		String str = "jay";
		int[] arr = { 10, 20, 30, 40, 50 };
		try {
			System.out.println(str.charAt(n));
			System.out.println(arr[n]);
			System.out.println(18 / n);
		} catch (ArrayIndexOutOfBoundsException a1) {
			System.out.println("terrce pe ja rha hai");
		} catch (StringIndexOutOfBoundsException s1) {
			System.out.println("index bhahar ja rha hai");
		}
		System.out.println("Code end");
	}
}
