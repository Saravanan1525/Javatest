package testng;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;

public class NewTestNGClassSample {
	RemoteWebDriver driver;

	@BeforeClass // 1
	public void beforeClas() {
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	}

	@Test
	public void TC_001_f() throws Exception {
		driver.get("https://google.com");
		
	}

	@Test
	public void TC_002_g() throws Exception {
		driver.findElement(By.name("q")).sendKeys("Hi Selenium");
	}

	@AfterMethod
	public void afterMethod() throws Exception {
		// Timestamp
		Date d = new Date();
		System.out.println(d);
		DateFormat df = new SimpleDateFormat("yyyyMMMdd_HHmmss");
		String timeStamp = df.format(d);

		// Take current screen capture
		File abc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Move taken screeshot to Specific folder
		FileHandler.copy(abc, new File(".\\screenshots\\sbi" + timeStamp + ".JPG"));
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
