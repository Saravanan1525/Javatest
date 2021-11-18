package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {

	public static void main(String[] args) {
		// Create a webdriver object.
		WebDriver driver;

		// Open Chrome browser
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// type fb url
		driver.get("https://www.facebook.com/");
		// Maximize the window
		driver.manage().window().maximize();

		// Get the URL of the webpage?
		System.out.println(driver.getCurrentUrl());
		
		//GetTitle(): Get the current screen Title of the page?
		System.out.println("FB Home Page title is: " + driver.getTitle());
		

		// Click on Forgotten password?
		//driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.partialLinkText("d?")).click();
		
		// Get the URL of the webpage?
		System.out.println(driver.getCurrentUrl());
		String forgotPwdScreenTitle =  driver.getTitle();
		System.out.println("forgotPwdScreenTitle is: " +forgotPwdScreenTitle);
		
		
		

	}
}
