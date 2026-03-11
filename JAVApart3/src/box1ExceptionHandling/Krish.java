package box1ExceptionHandling;

//checked Exception Interrupted Exception
public class Krish {
	public static void main(String[] args) {

		System.out.println("Main start");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1);
			} catch (InterruptedException i1) {
				System.out.println("Handled...");
			}
		}
		System.out.println("Main  end");
	}
}
