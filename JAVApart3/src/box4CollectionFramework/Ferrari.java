package box4CollectionFramework;

import java.util.ArrayList;

public class Ferrari {
	public static void main(String[] args) {

		ArrayList<String> a1 = new ArrayList<String>();

		a1.add("Amit");
		a1.add("Bhushan");
		a1.add("Jay");
		a1.add("Prasad");
		System.out.println(a1);// [Amit, Bhushan, Jay, Prasad]
		a1.add(1, "Pranav");
		System.out.println(a1);
		a1.set(0, "Surve");
		System.out.println(a1);// Overriding the Existing data
		// [Surve, Pranav, Bhushan, Jay, Prasad]
		System.out.println("-----------------");
		// for each loop advance for loop
		for (String s : a1) {
			System.out.println(s);
		}
	}
}