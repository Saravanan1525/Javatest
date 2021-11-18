package corejava;

public class StringAll {

	public static void main(String[] args) {
		String a;// String declaration
		a = "Hi All";// Assign the value to the String

		String b = "How Are YOU";

		// Concatenate the two Strings
		System.out.println((a + "," + b));

		// Uppercase / lowercase
		System.out.println(a.toUpperCase());
		System.out.println(b.toLowerCase());

		String c = "   Selenium Automation             ";
		System.out.println(c);
		// trim()
		System.out.println(c.trim());

		// equals Vs EqualsIgnorecase
		String d = "Apple";
		String e = "apple";

		if (d.equals(e)) {
			System.out.println("Both the Strings are matching");

		} else {
			System.out.println("Both the Strings are NOT matching");
		}
		
		if (d.equalsIgnoreCase(e)) {
			System.out.println("*****Both the Strings are matching");

		} else {
			System.out.println("******Both the Strings are NOT matching");
		}
		
		//Contains
		//Length: start from '1' onewards
		String f ="Selenium Testing";
		System.out.println(f.length());
		//index:start from '0' onewards
		System.out.println(f.charAt(4));
		
		
		//convert String to int or int to String
		int g = 123;
		String h = "456";
		System.out.println(g+h);//?123456
		
		//convert String to int
		int i = Integer.parseInt(h);//123+456
		System.out.println(g+i);//?579
		//convert int to String
		String j = Integer.toString(g);
		System.out.println(h+j);
	}

}
