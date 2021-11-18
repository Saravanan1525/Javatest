package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_1 {

	public static void main(String[] args) throws InterruptedException {

		RemoteWebDriver driver;

		// Open Chrome browser
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://collegeweeklive.com/go-signup/");

		/* Wait for the required elements to appear */
		Thread.sleep(10000);

		driver.findElement(By.id("firstName")).sendKeys("Krishnan");

		driver.findElement(By.id("lastName")).sendKeys("Selvaraj");

		driver.findElement(By.id("emailAddress")).sendKeys("krishna123@ymail.com");

		driver.findElement(By.id("phoneNumber")).sendKeys("9998899888");

		driver.findElement(By.id("password")).sendKeys("asdf1234");

		driver.findElement(By.id("ConfirmPassword")).sendKeys("asdf1234");
		// Dropdown handle
		Select dd = new Select(driver.findElement(By.id("country")));
		dd.selectByVisibleText("UNITED STATES");

		driver.findElement(By.name("attendeeType")).sendKeys("Adult/Non-Traditional Student");

		driver.findElement(By.id("questions[q_135]")).click();

		driver.findElement(By.id("questions[q_136]")).click();

		driver.findElement(By.id("questions[q_137]")).click();

		Thread.sleep(5000);

		System.out.println("First Task Done");

	}

}