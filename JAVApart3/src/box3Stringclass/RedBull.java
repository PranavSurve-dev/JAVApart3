package box3Stringclass;

public class RedBull {
	String str;

	public RedBull(String str) {
		this.str = str;
	}

	public static void main(String[] args) {
		RedBull r1 = new RedBull("P");// non string object
		System.out.println(r1.hashCode());// 1706234378
		System.out.println("-----------");
		String s1 = new String("A");// string object
		System.out.println(s1.hashCode());// 65

	}
}