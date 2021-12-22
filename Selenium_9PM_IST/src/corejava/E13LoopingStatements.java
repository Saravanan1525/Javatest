package corejava;

import java.util.Scanner;

public class E13LoopingStatements {
	// print 1 to 100 number
	public static void main(String[] args) {
		System.out.print("Enter the table no: ");
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		in.close();
		// for(intitalize the variable; condition; increment / decrement of variable) {}

		for (int i1 = 1; i1 <= 10; i1++) {
			System.out.println(i1 +"*" +i +"=" +i1*i );
		}
	}

}
