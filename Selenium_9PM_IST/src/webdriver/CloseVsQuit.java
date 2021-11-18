package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseVsQuit {

	public static void main(String[] args) {
		WebDriver driver;		
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.get("https://www.naukri.com/");		
		driver.manage().window().maximize();
		
		
		//driver.close();
		driver.quit();

	}

}
