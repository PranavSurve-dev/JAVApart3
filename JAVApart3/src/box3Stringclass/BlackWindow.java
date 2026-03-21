package box3Stringclass;

import java.util.Arrays;

public class BlackWindow {
	public static void main(String[] args) {
		String str = "Java Developer";
		System.out.println(str.replace("a", ".Net"));// J.Netv.Net Developer

		String s1 = "Chamtkar pe Chamtkar kr aa rhe hai";
		System.out.println(s1.replace("Chamtkar", "Balatakar"));
		// Balatakar pe Balatakar kr aa rhe hai

		System.out.println("-----------------------");

		System.out.println(Arrays.toString(s1.split(" ")));

		String[] arr = s1.split(" ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			System.out.println("--------------");
			// for each loop
			for (String n : arr) {
				System.out.println(n);
			}
		}
	}
}
