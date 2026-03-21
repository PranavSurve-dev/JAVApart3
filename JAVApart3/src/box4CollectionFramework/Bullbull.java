package box4CollectionFramework;

import java.util.Vector;

public class Bullbull {
	public static void main(String[] args) {
		Vector<Object> v1 = new Vector<Object>();
		v1.add("karan");
		v1.add(500);
		v1.add(true);
		v1.add(55.55);
		v1.add('A');
		v1.add(500);
		v1.add(123456879l);
		System.out.println(v1);
	}
}
