package box4CollectionFramework;

public class Mustang {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		// Normal for loop
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("---------------------");
		// For each loop advance for loop
		for (int n : arr) {
			System.out.println(n);
		}
	}
}
