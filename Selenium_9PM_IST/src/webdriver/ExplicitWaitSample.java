package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitSample {
	public static void main(String[] args) {

		RemoteWebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		

		
		
		//Click on timerAlertButton button
		driver.findElement(By.id("timerAlertButton")).click();
		
		//wait until the alert display
		WebDriverWait ww = new WebDriverWait(driver, Duration.ofSeconds(20));
		ww.until(ExpectedConditions.alertIsPresent());
		
		//Alert script for OK button click 
		driver.switchTo().alert().accept();
		
	}

}
