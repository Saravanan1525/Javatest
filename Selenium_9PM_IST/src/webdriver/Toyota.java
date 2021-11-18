package webdriver;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Toyota {
	public static void main(String[] args) throws Exception {
		RemoteWebDriver driver;

		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://forms.toyota.co.uk/brochure");
		driver.manage().window().maximize();
		// wait statement
		Thread.sleep(5000);

		//Click on cookies button
		driver.findElement(By.id("tgbgdpr-overlay-agree")).click();
		Thread.sleep(5000);

		//title selection
		driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[4]")).click();		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Ms']")).click();

		
		Random r = new Random();
//		int titlerandomNum = r.nextInt(8);
//		System.out.println(titlerandomNum);
//		if (titlerandomNum==0) {
//			titlerandomNum=1;
//			System.out.println("the output is zero'0', User has updated to one'1'");
//			System.out.println(titlerandomNum);
//		}
//		driver.findElement(By.xpath("//ul[@class='dropdown-menu ']/li["+titlerandomNum+"]")).click();

		
		//total 22 cars 
		//Use random class and generate the random number from 1 to 22
		
		int randomNum = r.nextInt(22);
		System.out.println(randomNum);
		//if the output is zero'0', want to add bydefault to one'1'
		if (randomNum==0) {
			randomNum=1;
			System.out.println("the output is zero'0', User has updated to one'1'");
			System.out.println(randomNum);
		}
		
		System.out.println("(//li[contains(@class,'brochure_cars')])["+randomNum+"]");
		
		//Click on the Mirai car 
		driver.findElement(By.xpath("(//li[contains(@class,'brochure_cars')])["+randomNum+"]")).click();
		
		//get the selected can name and print
		String selectedCarName = driver.findElement(By.xpath("(//li[contains(@class,'brochure_cars')])["+randomNum+"]/label")).getText();
		System.out.println(selectedCarName);
	}
}
