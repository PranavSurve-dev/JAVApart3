package box3Stringclass;

public class Timepass {
	public static void main(String[] args) {
		String str = "Software Engineer";
		System.out.println(str.length());// 17
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.indexOf('S'));// 0
		System.out.println(str.indexOf('o'));// 1
		System.out.println(str.indexOf('f'));// 2
		System.out.println(str.indexOf('t'));// 3
		System.out.println(str.lastIndexOf('e'));// 15
		System.out.println(str.indexOf('e', 8));// 14
		System.out.println("-------------------");
		System.out.println(str.charAt(10));// n
		System.out.println(str.charAt(7));// e
		System.out.println(str.charAt(3));// t
		System.out.println("-------------------");
		System.out.println(str.substring(5));// re Engineer
		System.out.println(str.substring(11));// ware Engineer
		System.out.println(str.substring(3, 17));// tware Engineer
		System.out.println("-------------------");
		System.out.println(str.contains("ee"));// true
		System.out.println(str.contains("waree"));// false
		System.out.println(str.contains("Engi"));// true
		System.out.println("--------------------");
		System.out.println(str.startsWith("So"));// true
		System.out.println(str.endsWith("er"));// true
		System.out.println("--------------------");
		String s1 = "Pranav";
		String s2 = "Ritesh";
		String s3 = "Pranav";
		System.out.println(s1.equals(s2));// false
		System.out.println("Pranav".equals("Pranav"));// true
		System.out.println("DAD".equalsIgnoreCase("dad"));// true
		System.out.println("MahaRashtra".equalsIgnoreCase("MAHARASHTRA"));// true
		System.out.println();
		System.out.println();
	}
}
