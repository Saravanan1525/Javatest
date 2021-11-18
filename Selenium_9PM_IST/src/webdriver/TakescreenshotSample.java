package webdriver;

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
import org.openqa.selenium.support.ui.Select;

public class TakescreenshotSample {

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
		
		
		//Timestamp
		Date d = new Date();
		System.out.println(d);	
		DateFormat df = new SimpleDateFormat("yyyyMMMdd_HHmmss");
		String timeStamp = df.format(d);
		
		//Take current screen capture
		File abc =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Move taken screeshot to Specific folder
		FileHandler.copy(abc, new File(".\\screenshots\\blazedemo"+timeStamp+".JPG"));
		

	}

}
