package box4CollectionFramework;

import java.util.LinkedList;

public class Pune {
	public static void main(String[] args) {

		LinkedList<Object> l1 = new LinkedList<Object>();
		l1.add("Pranav");
		l1.add(42);
		l1.add(false);
		l1.add(80.22);
		l1.add('Z');
		l1.add(null);
		System.out.println(l1);// [Pranav, 42, false, 80.22, Z, null]
		System.out.println("-----------------");
		for (Object o1 : l1) {
			System.out.println(o1);

		}

	}
}