
public class even {
	public static void main(String[] args) {
		int count = 0;
		int number = 0;
		System.out.println("First 10 even numbers are:");
		while (count < 10) {
			if (number % 2 == 0) {
				count++;
				System.out.print(number + " ");
			}
			number++;
		}
	}
}
