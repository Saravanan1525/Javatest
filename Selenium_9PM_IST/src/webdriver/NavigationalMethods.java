package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class NavigationalMethods {

	public static void main(String[] args) throws Exception {
		RemoteWebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("hiallsdf2@gmail.com");
		Thread.sleep(2000);
		
		//Click on Refresh icon
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		//clcik on Forgotten password? link
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(3000);
		
		//Click on Back icon
		driver.navigate().back();
		Thread.sleep(3000);
		
		//Click on Forward icon
		driver.navigate().forward();

	}

}
