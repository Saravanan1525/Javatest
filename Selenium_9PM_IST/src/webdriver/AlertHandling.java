package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AlertHandling {

	public static void main(String[] args) throws Exception {

		RemoteWebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.manage().window().maximize();
		
		//click on CONTINUE TO LOGIN link
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		Thread.sleep(3000);

		//without enter any details click on Login button
		driver.findElement(By.id("Button2")).click();

		
		//Alert handling
		//Get the Alert Text
		String alertText=  driver.switchTo().alert().getText();
		System.out.println(alertText);
		
		//do the Click on OK button in Alert
		driver.switchTo().alert().accept();
		
		
		//Click on Register link
		//driver.findElement(By.partialLinkText("Register")).click();
		driver.findElement(By.linkText("New User ? Register here/Activate")).click();
		Thread.sleep(5000);
		//do the Click on OK button in ConfirmationAlert
		//driver.switchTo().alert().accept();
				
		//Get the Alert Text
		String confirmationAlertText=  driver.switchTo().alert().getText();
		System.out.println(confirmationAlertText);
		
		
		//do the Click on CANCLE button in ConfirmationAlert
		driver.switchTo().alert().dismiss();
		
	}

}
