package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GetAllHyperLinks {

	public static void main(String[] args) {
		RemoteWebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.fb.com/");
		driver.manage().window().maximize();
		
		//String
		//Array
		//List
		
		List<WebElement> allHyperLinks =  driver.findElements(By.tagName("a"));
		System.out.println(allHyperLinks.size());
		for (WebElement abc : allHyperLinks) {
			System.out.println(abc.getText());
		}

	}

}
