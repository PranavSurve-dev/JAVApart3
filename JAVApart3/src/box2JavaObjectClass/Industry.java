package box2JavaObjectClass;

//1 Before Overriding .equals()
class Nano {
	int speed;

	// Constructor
	public Nano(int speed) {
		this.speed = speed;
	}
}

public class Industry {
	public static void main(String[] args) {
		Nano n1 = new Nano(140);
		Nano n2 = new Nano(140);
		System.out.println(n1.equals(n2));// false

		// By Default .equals() compres address of an Object
		// We have to Override to compare Data

		System.out.println("---------------------");

		System.out.println(n1 == n2);// false
		// always false because its always compare address
	}
}
