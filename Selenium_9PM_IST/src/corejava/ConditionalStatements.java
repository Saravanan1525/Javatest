package corejava;

public class ConditionalStatements {
	// Find hte large value

	public static void main(String[] args) {
		int a = 242;
		int b = 242;

		if (a > b) {
			System.out.println("a is the large value");
		} else if (b > a) {
			System.out.println("b is the large value");
		} else {
			System.out.println("both the  values are equal");
		}
		
//		int age = 60;
//		String gender = "male";
//		//20% discount
//		String gender = "female";
//		//25% discount
		int age =61;
		String gender = "male";
		if (age>59) {
			if (gender.equals("male")) {				
				//20% discount
			}else if(gender.equals("female")){
				//25% discount
			}else {
				//NO discount
			}
		}
		
	}

}
