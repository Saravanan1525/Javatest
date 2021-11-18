package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FBLOGIN {

	// Create a webdriver object.
	WebDriver driver;

	@BeforeClass // Pre-condition
	public void beforeClass() {
		// Open Chrome browser
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// Maximize the window
		driver.manage().window().maximize();
	}

	@Test // actual Functional Steps
	public void validCredentials() {
		// type fb url
		driver.get("https://www.facebook.com/");
		// type un & pwd
		driver.findElement(By.id("email")).sendKeys("h2otestingtools@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Selenium@7");
		// click on login button
		driver.findElement(By.name("login")).click();
	}

	@AfterClass // Post-condition
	public void afterClass() {
		driver.quit();
	}

	@Test // actual Functional Steps
	public void invalidCredentials() {
		// type fb url
		driver.get("https://www.facebook.com/");
		// type un & pwd
		driver.findElement(By.id("email")).sendKeys("hiallsdf2@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("sdgsdg234asd");
		// click on login button
		driver.findElement(By.name("login")).click();
	}
}
