package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TTD_XpathSample {
	public static void main(String[] args) throws Exception {

		RemoteWebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://tirupatibalaji.ap.gov.in/#/registration");
		Thread.sleep(5000);
		
		
	}
}
