package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class AnnotationTwo {
	@AfterClass // Post-condition
	public void afterClass() {
		System.out.println("@AfterClass");
	}

	@BeforeClass // Pre-condition
	public void beforeClass() {
		System.out.println("@BeforeClass");
	}

	@Test // Actual test script
	public void f() {
		System.out.println("@Test f");
	}

	@Test // Actual test script
	public void a() {
		System.out.println("@Test a");
	}
}
