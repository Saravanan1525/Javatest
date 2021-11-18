package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinkSample {

	public static void main(String[] args) {
		
		WebDriver driver;		
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.get("https://www.google.com/");		
		driver.manage().window().maximize();
		
		//Click on Images hyper link
		//Gmail Images
		//driver.findElement(By.linkText("Images")).click();
		driver.findElement(By.partialLinkText("Ima")).click();
		
		
		//Close the current Browser window
		driver.close();
	}

}
