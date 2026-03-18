package box2JavaObjectClass;

//1 After Overriding hashcode()
//After Overriding hashcode() it give data(whatever we pass)

class BMW2 {

	static int num = 143;

	@Override
	public int hashCode() {
		return num++;
	}
}

public class Manufacturing2 {
	public static void main(String[] args) {
		BMW2 b1 = new BMW2();
		System.out.println(b1.hashCode());// 143

		System.out.println("================");

		BMW2 b2 = new BMW2();
		System.out.println(b2.hashCode());// 144

		System.out.println("================");

		BMW2 b3 = new BMW2();
		System.out.println(b3.hashCode());// 145
	}
}
