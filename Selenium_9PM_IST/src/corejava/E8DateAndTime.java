package corejava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class E8DateAndTime {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);

		// yyyyMMMdd_HHmmss
		DateFormat df = new SimpleDateFormat("yyyyMMMdd_HHmmss");
		//DateFormat df = new SimpleDateFormat("ddMMMyyyy_HHmmss");
		System.out.println(df.format(d));
		//System.out.println(de);
		
		//Mon Oct 25 22:08:57 IST 2021
		//2021Oct25_220857

	}

}
