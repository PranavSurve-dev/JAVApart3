package box4CollectionFramework;

import java.util.ArrayList;

public class Iran {
	public static void main(String[] args) {
		ArrayList<Object> a1 = new ArrayList<Object>();
		a1.add("Pranav");
		a1.add(42);
		a1.add(true);
		a1.add(45.78);
		a1.add('A');
		a1.add(789456L);

		System.out.println(a1);// [Pranav, 42, true, 45.78, A, 789456]
	}
}