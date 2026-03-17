//package box2JavaObjectClass;
//
////1 Before Overriding toString()
//class VandeBharat {
//	String color;
//	int price;
//	int speed;
//
//	public VandeBharat(String color, int price, int speed) {
//
//		this.color = color;
//		this.price = price;
//		this.speed = speed;
//	}
//
//}
//
//public class Train {
//	public static void main(String[] args) {
//
//		VandeBharat v1 = new VandeBharat("Orange", 1500, 180);
//		System.out.println(v1);// box1ExceptionHandling.VandeBharat@6f539caf
//		System.out.println(v1.toString());// box1ExceptionHandling.VandeBharat@6f539caf
//
//		System.out.println("--------------");
//
//		VandeBharat v2 = new VandeBharat("Red", 1800, 150);
//		System.out.println(v2);// box1ExceptionHandling.VandeBharat@79fc0f2f
//		System.out.println(v2.toString());// box1ExceptionHandling.VandeBharat@79fc0f2f
//
//	}
//}           

package box2JavaObjectClass;

// Class
class VandeBharat {
	String colour;
	int price;
	int speed;

	// Constructor
	public VandeBharat(String colour, int price, int speed) {
		this.colour = colour;
		this.price = price;
		this.speed = speed;
	}

	// 🔥 Overriding toString()
	@Override
	public String toString() {
		return "Train colour is " + colour + ", price is " + price + ", speed is " + speed;
	}
}

// Main class
public class Train {
	public static void main(String[] args) {

		VandeBharat v1 = new VandeBharat("White", 1500, 180);
		System.out.println(v1); // calls toString()
		System.out.println(v1.toString()); // explicit call

		System.out.println("--------------");

		VandeBharat v2 = new VandeBharat("Red", 1800, 150);
		System.out.println(v2);
		System.out.println(v2.toString());
	}
}