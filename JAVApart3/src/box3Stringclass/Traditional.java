package box3Stringclass;

public class Traditional {

	public static void main(String[] args) {
		// String is immutable

		String s1 = new String("Pranav");
		s1.concat("muskan");
		System.out.println(s1);// Pranav

		System.out.println("-------------");

		// Storing in different variable to show concat method works
		String str = "Abhijit".concat("Muskan");
		System.out.println(str);
		System.out.println("-------------");
		// Mutable
		StringBuffer sb = new StringBuffer("Pushparaj");
		sb.append("Srivalli");
		System.out.println(sb);
		System.out.println("-------------");
		// Mutable
		StringBuilder ss = new StringBuilder("Surve");
		ss.append(" The Great");
		System.out.println(ss);
	}
}
