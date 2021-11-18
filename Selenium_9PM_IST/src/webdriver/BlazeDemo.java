package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class BlazeDemo {
	public static void main(String[] args) throws Exception {
		RemoteWebDriver driver;

		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		// wait statement
		Thread.sleep(6000);

		Select fp = new Select(driver.findElement(By.name("fromPort")));
		fp.selectByVisibleText("San Diego");
		
		//new Select(driver.findElement(By.xpath("//*[@name='fromPort']"))).selectByVisibleText("San Diego");
		
		
	}
}
