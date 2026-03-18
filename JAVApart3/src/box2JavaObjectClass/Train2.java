package box2JavaObjectClass;

//2 After Overriding toString()
// After Overriding toString() it gives the Data
class VandeBharat2 {
	String color;
	int price;
	int speed;

	public VandeBharat2(String color, int price, int speed) {

		this.color = color;
		this.price = price;
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Train colour is " + color + " Price is " + price + " Speed : " + speed;
	}

}

public class Train2 {
	public static void main(String[] args) {

		VandeBharat2 v1 = new VandeBharat2("Orange", 1500, 180);
		System.out.println(v1);// Train colour is Orange Price is 1500 Speed : 180
		System.out.println(v1.toString());// Train colour is Orange Price is 1500 Speed : 180

		System.out.println("--------------");

		VandeBharat2 v2 = new VandeBharat2("Red", 1800, 150);
		System.out.println(v2);// Train colour is Red Price is 1800 Speed : 150
		System.out.println(v2.toString());// Train colour is Red Price is 1800 Speed : 150

	}
}
