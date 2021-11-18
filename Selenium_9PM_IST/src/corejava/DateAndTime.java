package corejava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);	

		// yyyyMMMdd_HHmmss
		DateFormat df = new SimpleDateFormat("yyyyMMMdd_HHmmss");
		System.out.println(df.format(d));	
	}

}
