package corejava;

public class PrintNumbers {

	public static void main(String[] args) {

		// print even numbers in between 1 to 100 range
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is Even Number");
			}
			 else if (i % 2 == 1) {
				//System.out.println(i + " is Odd Number");
			}
		}

	}

}
