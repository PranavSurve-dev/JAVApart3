package box3Stringclass;

public class Summer {
	int heat;

	public Summer(int heat) {
		this.heat = heat;
	}

	public static void main(String[] args) {
		Summer s1 = new Summer(40);// Non-String Object
		Summer s2 = new Summer(40);
		System.out.println(s1.equals(s2));// false
		// Comparing address
		System.out.println("-------------");

		String m1 = new String("pranav");// String Object
		String m2 = new String("pranav");// String Object
		System.out.println(m1.equals(m2));// true

		// Internally equals() is Overridden in String Class to Compare Data
	}
}
