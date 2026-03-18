package box2JavaObjectClass;

//2 After Overriding .equals()
// Before Overriding .equals() it gives Object Address
class Nano2 {
	int speed;

	// Constructor
	public Nano2(int speed) {
		this.speed = speed;
	}

	@Override // Object obj = new Nano(120); //Upcasting
	public boolean equals(Object obj) {
		Nano2 m = (Nano2) obj;// Downcasting
		return this.speed == m.speed;
	}
}

public class Industry2 {
	public static void main(String[] args) {
		Nano2 n1 = new Nano2(120);
		Nano2 n2 = new Nano2(120);
		System.out.println(n1.equals(n2));// True
		System.out.println(n1);
		System.out.println(n2);

		// By Default .equals() compress address of an Object
		// We have to Override to compare Data

		System.out.println("---------------------");

		System.out.println(n1 == n2);// false
		// always false because its always compare address
	}
}
