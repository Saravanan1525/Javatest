package corejava;

import java.util.Scanner;

public class E14Primeno {
	public static void main(String Args[]) {
		System.out.print("Enter the No: ");
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
	//	in.close();
		if (i / 2 == 0 ) {
			System.out.println(i +" Is not a Prime no");
		} else 
			System.out.println(i + " Is a Prime no");
		}
	}
