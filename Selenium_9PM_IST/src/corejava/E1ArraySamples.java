package corejava;

import java.util.Arrays;
import java.util.Collections;

public class E1ArraySamples {

	public static void main(String[] args) {
		String [] strarray  = {"Harish","Ram","SummitWork","Sreenivas","Selenium","Automation"};
		Arrays.sort(strarray, Collections.reverseOrder());   
		//length of abc array
		System.out.println("Array elements in descending order: " +Arrays.toString(strarray));
		
		//index:
		//System.out.println(abc[2]);
	}

}
