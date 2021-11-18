package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirefoxBrowser {
	// Create a webdriver object.
	WebDriver driver;

	@BeforeClass // Pre-condition
	public void beforeClass() {
		// Open Chrome browser
//		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
//		driver = new ChromeDriver();
		
		//Firefox browser
//		System.setProperty("webdriver.gecko.driver", ".\\browserdrivers\\geckodriver.exe");
//		driver = new FirefoxDriver();
		//IE
		System.setProperty("webdriver.ie.driver", ".\\browserdrivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
		
		
		// Maximize the window
		//driver.manage().window().maximize();
	}

	@Test // actual Functional Steps
	public void validCredentials() throws InterruptedException {
		// type fb url
		driver.get("https://www.facebook.com/");
		Thread.sleep(6000);
		// type un & pwd
		driver.findElement(By.id("email")).sendKeys("sdgfsdgh2otestingtools@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("sdgsdgsdSelenium@7");
		// click on login button
		driver.findElement(By.name("login")).click();
	}
}
