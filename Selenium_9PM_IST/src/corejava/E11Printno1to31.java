package corejava;

public class E11Printno1to31 {

	public static void main(String[] args) {
		
		System.out.println("print 1 to 31");
		for (int i = 1; i <= 31; i++) {
			if (i % 3 == 0 ) {
				System.out.println(i +"  is Divided by 3 ");
			}
			
			 else {System.out.println( i +"  is not divided by 3 ");
			 }
			 if (i % 3 == 0 & i % 5 == 0) {
					System.out.println(i +"  is Divided by 3 & 5");
				}
		
			if  (i % 5 == 0) {
				System.out.println(i +" is Divided by 5");
			} else {System.out.println( i +"  is not divided by 5 ");
			}

			
				
		
		}
	}

}

	
