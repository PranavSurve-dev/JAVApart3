package box1ExceptionHandling;

//checked Exception Interrupted Exception

public class Krish2 {

	public static void jadu() throws InterruptedException, ArithmeticException {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);

			Thread.sleep(450);
		}
	}

	public static void main(String[] args) {
		System.out.println("Main Start");

		try {
			jadu();
		} catch (InterruptedException e) {
			System.out.println("Handled...");
		}
		System.out.println("Main End");
	}
}
