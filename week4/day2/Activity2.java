package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Activity2 {

	public static void main(String[] args) {
//		ClassRoom Activity 2:
//			1. Launch https://www.snapdeal.com/
//			2. Hover on Men's Fashion and Click on Shirts
//			3. Hover on the first resulting shirt and click on Quick View
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		 driver.get("https://www.snapdeal.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 WebElement mensfashion = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
		 WebElement shirt = driver.findElement(By.xpath("//span[text()=\"Shirts\"]"));
		 Actions bulider = new Actions(driver);
		 bulider.moveToElement(mensfashion)
		 .pause(10)
		 .click(shirt)
		 .perform();
		 bulider.moveToElement(driver.findElement(By.xpath("//img[@class='product-image ']"))).perform();
		 driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
		 driver.quit();

	}

}
