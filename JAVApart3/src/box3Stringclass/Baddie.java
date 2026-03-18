package box3Stringclass;

public class Baddie {
	String s;

	public Baddie(String s) {
		this.s = s;
	}

	public static void main(String[] args) {
		Baddie b1 = new Baddie("pranav");// Non string object
		System.out.println(b1);
		System.out.println(b1.s);
		System.out.println(b1.toString());
		System.out.println("------------------");

		String s1 = new String("Surve");
		System.out.println(s1);
		System.out.println(s1.toString());
	}
}
