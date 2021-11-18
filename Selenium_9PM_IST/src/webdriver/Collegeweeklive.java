package webdriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Collegeweeklive {
	public static void main(String[] args) throws Exception {
		RemoteWebDriver driver;

		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://collegeweeklive.com/go-signup/");
		driver.manage().window().maximize();
		// implicit wait statement
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// click on Submit button
		driver.findElement(By.id("submit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// get the error message
		System.out.println(driver.findElement(By.id("firstNameError")).getText());

		System.out.println("**********************************");
		String lastNameErrorMSG = driver.findElement(By.id("lastNameError")).getText();
		System.out.println(lastNameErrorMSG);

	}
}
