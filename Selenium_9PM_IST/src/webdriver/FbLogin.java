package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin {
	public static void main(String[] args) {
		// Create a webdriver object.
		WebDriver driver;

		// Open Chrome browser
		System.setProperty("webdriver.chrome.driver",".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();

		// type fb url
		driver.get("https://www.facebook.com/");
		//Maximize the window
		driver.manage().window().maximize();

		// type un & pwd
		driver.findElement(By.id("email")).sendKeys("hiallsdf2@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("sdgsdg234asd");

		// click on login button
		driver.findElement(By.name("login")).click();

	}
}
