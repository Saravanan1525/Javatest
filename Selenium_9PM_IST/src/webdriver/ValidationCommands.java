package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ValidationCommands {
	public static void main(String[] args) {

		RemoteWebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://app.testproject.io/signup/");
		driver.manage().window().maximize();

		// Check the continue button is displayed or not?
		if (driver.findElement(By.id("tp-continue-btn")).isDisplayed()) {
			System.out.println("given locator is displayed on Screen");
		} else {
			System.out.println("given locator is NOT displayed on Screen");
		}

		// type valid mail id
		// then the continue button will be enabled
		driver.findElement(By.id("email")).sendKeys("sdsddsgf@sdfsdf.dsf");

		// Check the continue button enabled or not?
		if (driver.findElement(By.id("tp-continue-btn")).isEnabled()) {
			System.out.println("given locator is Enabled state on Screen");
		} else {
			System.out.println("given locator is NOT Enabled state on Screen");
		}

		// Click on Login link
		driver.findElement(By.linkText("Login")).click();
		// implicitwait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Remember check box is selected or not?
		if (driver.findElement(By.id("rememberMe")).isSelected()) {
			System.out.println("given locator is checked/Selected  on Screen");
		} else {
			System.out.println("given locator is NOT checked/Selected   on Screen");
		}
		// Click on Remember check box
		// driver.findElement(By.id("rememberMe")).click();

		WebElement element = driver.findElement(By.id("rememberMe"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);

		// Remember check box is selected or not?
		if (driver.findElement(By.id("rememberMe")).isSelected()) {
			System.out.println("given locator is checked/Selected  on Screen*************");
		} else {
			System.out.println("given locator is NOT checked/Selected   on Screen***************");
		}

	}

}
