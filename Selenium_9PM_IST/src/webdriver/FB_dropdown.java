package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_dropdown {

	public static void main(String[] args) throws Exception {
		RemoteWebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//click on Create New Account 
		driver.findElement(By.linkText("Create New Account")).click();
		//wait statement
		Thread.sleep(6000);
		
		//DOB dropdown
		Select dobDay = new Select(driver.findElement(By.id("day")));
		dobDay.selectByVisibleText("18");
		
		Select dobMonth = new Select(driver.findElement(By.id("month")));
		dobMonth.selectByVisibleText("Mar");
		
		
		
		Select dobYear = new Select(driver.findElement(By.id("year")));
		dobYear.selectByVisibleText("2011");
	}

}
