package box4CollectionFramework;

import java.util.ArrayList;

public class Dmart {
	public static void main(String[] args) {

		ArrayList<Object> a1 = new ArrayList<Object>();

		a1.add("Aata");
		a1.add(786);
		a1.add(786);
		a1.add(true);
		a1.add("chaval");
		a1.add("Dal");
		a1.add("Dal");
		a1.add("Salt");
		a1.add(55.55);
		a1.add("Sakhar");
		a1.add("Tomato");
		a1.add("IceCream");

		System.out.println(a1);
		// [Aata, 786, 786, true, chaval, Dal, Dal, Salt, 55.55, Sakhar, Tomato,
		// IceCream]
		System.out.println("-------------------");
		System.out.println(a1.size());
		System.out.println(a1.contains("Salt"));// true
		System.out.println(a1.contains("Santoor"));// false
		System.out.println("-------------------");
		System.out.println(a1.get(0));// Aata
		System.out.println(a1.get(11));// IceCream
		System.out.println("-------------------");
		System.out.println(a1.indexOf("Tomato"));// 10
		System.out.println(a1.indexOf(786));// 1
		System.out.println(a1.lastIndexOf(786));// 2
		System.out.println("--------------------");
		a1.remove(11);// Removing Data
		System.out.println(a1);
		System.out.println(a1.isEmpty());// false
		a1.clear();
		System.out.println(a1);// []
		System.out.println(a1.isEmpty());// true

	}
}