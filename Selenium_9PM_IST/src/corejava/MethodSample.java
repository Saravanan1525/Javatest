package corejava;

public class MethodSample {

	public static void add() {
		int a = 12;
		int b = 23;
		System.out.println("the add results is : " + (a + b));
	}

	public static void sub() {
		int a = 12;
		int b = 23;
		System.out.println("the sub results is : " + (a - b));
	}

	public static void mul() {
		int a = 12;
		int b = 23;
		System.out.println("the mul results is : " + (a * b));
	}

	public static void main(String[] args) {
		System.out.println("Hi");
		add();
		sub();
		mul();
	}

}
