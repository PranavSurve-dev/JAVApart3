package box1ExceptionHandling;

//Exception
import java.util.Scanner;

public class Dhurander {
	public static void main(String[] args) {

		System.out.println("Code start");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();

		String str = "pranav";
		int[] arr = { 10, 20, 30 };
		try {
			System.out.println(str.charAt(n));
			System.out.println(arr[n]);
			System.out.println(18 / n);
		} catch (ArrayIndexOutOfBoundsException a1) {
			System.out.println("terrce pe ja rha hai");
		} catch (StringIndexOutOfBoundsException s1) {
			System.out.println("index bhahar ja rha hai");
		} catch (ArithmeticException a1) {
			System.out.println("Gadhe zero se divide mat kar");
		} catch (Exception e1) {
			System.out.println("kuch to gadbad hai");
		}
		System.out.println("Code end");
	}
}
