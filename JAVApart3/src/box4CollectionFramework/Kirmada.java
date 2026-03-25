package box4CollectionFramework;

import java.util.ArrayList;
import java.util.Vector;

public class Kirmada {
	public static void main(String[] args) {
//Adding One Collection in Another Collection
		Vector<String> v1 = new Vector<String>();
		v1.add("Pranav");
		v1.add("Saras");
		v1.add("Siddhant");
		v1.add("Sahil");
		System.out.println(v1);

		ArrayList<Object> a1 = new ArrayList<Object>();
		a1.add(500);
		a1.add(true);
		a1.addAll(v1);
		a1.add(55.78);
		a1.add("surve");

		System.out.println(a1);
		System.out.println(v1);
		System.out.println(a1.containsAll(v1));// true
		System.out.println(v1.containsAll(a1));// false
		a1.remove("surve");
		a1.remove("Sahil");
		a1.remove(55.78);
		System.out.println(a1);
		// [500, true, Pranav, Saras, Siddhant, Sahil]

		System.out.println(a1.containsAll(v1));// false
		a1.removeAll(v1);
		a1.remove("surve");
		System.out.println(a1);// [500, true]
		a1.clear();
		System.out.println(a1);// []

	}
}
