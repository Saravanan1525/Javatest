package corejava;

import javax.swing.JOptionPane;

public class JOptionPaneSample {

	public static void main(String[] args) throws InterruptedException {
		JOptionPane.showInputDialog("Test1,Test2,Test3,Test4,Test5,Test6,Test7,Test8,Test9,Test10","imagine Any OneNumer");

		String abc1 = JOptionPane.showInputDialog
				("Your Imagine number is available in Section-1: Test1,Test6,,Test8,Test10");
		System.out.println(abc1);
		String abc2 = JOptionPane.showInputDialog
				("Your Imagine number is available in Section-2:Test2,Test5,Test6,Test9,Test10");
		System.out.println(abc2);
		String abc3 = JOptionPane.showInputDialog
					("Your Imagine number is available in Section-3:Test3,Test5,Test6,Test7,Test8,Test9,Test10");
		System.out.println(abc3);
		String abc4 = JOptionPane.showInputDialog
				("Your Imagine number is available in Section-4:Test4,Test7,Test8,Test9,Test10");
		System.out.println(abc4);
		
		int n1 = Integer.parseInt(abc1);
		int n2 = Integer.parseInt(abc2);
		int n3 = Integer.parseInt(abc3);
		int n4 = Integer.parseInt(abc4);
		System.out.println("Your Imagine Number  is :Test"+(n1+n2+n3+n4));
	}

}
