package corejava;

public class FindTheLargeNumber {

	public static void main(String[] args) {
		int[] num = { 121, 424, 3, 534, 35235, 924,2,98683 };

		int min = num[0];// 3
		int max = num[0];// 35235

		for (int i = 1; i <num.length; i++) {
			if (min > num[i]) {
				min = num[i];
			} else if (max < num[i]) {
				max = num[i];
			}
		}
		System.out.println("Minimum value in an array is: "+ min);
		System.out.println("Maximum value in an array is: "+ max);

	}

}
