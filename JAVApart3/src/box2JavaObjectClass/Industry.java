package box2JavaObjectClass;

//1 Before Overriding .equals()
class Nano {
	int speed;

	// Constructor
	public Nano(int speed) {
		this.speed = speed;
	}

	@Override // Object obj = new Nano(120); //Upcasting
	public boolean equals(Object obj) {
		Nano m = (Nano) obj;// Downcasting
		return this.speed == m.speed;
	}
}

public class Industry {
	public static void main(String[] args) {
		Nano n1 = new Nano(140);
		Nano n2 = new Nano(140);
		System.out.println(n1.equals(n2));// false

		// By Default .equals() compress address of an Object
		// We have to Override to compare Data

		System.out.println("---------------------");

		System.out.println(n1 == n2);// false
		// always false because its always compare address
	}
}
