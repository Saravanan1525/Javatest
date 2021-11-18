package testng;

import org.testng.annotations.Test;

public class AnnotationSampleOne {
	@Test(priority = 0)
	public void TC_001_f() {
		System.out.println("@Test f");
	}

	@Test(priority = 2)
	public void TC_002_abc() {
		System.out.println("@Test abc");
	}

	@Test(priority = 1)
	public void TC_003_xyz() {
		System.out.println("@Test xyz");
	}

	@Test(priority = 3)
	public void TC_004_testing() {
		System.out.println("@Test testing");
	}
}
