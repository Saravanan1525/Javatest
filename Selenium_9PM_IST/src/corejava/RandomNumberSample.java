package corejava;

import java.util.Random;

public class RandomNumberSample {

	public static void main(String[] args) {
		// print any one number randomly in between 0 to 100
		//CLASSANAME referenceName = new CLASSNAME();
		Random r = new Random();
		int randomNum = r.nextInt(22);
		System.out.println(randomNum);
		//if the output is zero'0', want to add bydefault to one'1'
		if (randomNum==0) {
			randomNum=1;
			System.out.println("the output is zero'0', User has updated to one'1'");
			System.out.println(randomNum);
		}
	}
}
