package box2JavaObjectClass;
//1 Before Overriding hashcode()

class BMW {

	static int num = 143;

	@Override
	public int hashCode() {
		return ++num;
	}
}

public class Manufacturing {
	public static void main(String[] args) {
		BMW b1 = new BMW();
		System.out.println(b1.hashCode());// 143

		System.out.println("================");

		BMW b2 = new BMW();
		System.out.println(b2.hashCode());// 144

		System.out.println("================");

		BMW b3 = new BMW();
		System.out.println(b3.hashCode());// 145
	}
}
