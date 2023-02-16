package week4.day2.Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SnapDeal {

	public static void main(String[] args) throws IOException {
		  /*  1. Launch https://www.snapdeal.com/
			2. Go to Mens Fashion
			3. Go to Sports Shoes
			4. Get the count of the sports shoes
			5. Click Training shoes
			6. Sort by Low to High
			7. Check if the items displayed are sorted correctly
			8.Select the price range (900-1200)
			9.Filter with color Navy 
			10 verify the all applied filters 
			11. Mouse Hover on first resulting Training shoes
			12. click QuickView button
			13. Print the cost and the discount percentage
			14. Take the snapshot of the shoes.
			15. Close the current window
			16. Close the main window
			*/
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		Actions bulider = new Actions(driver);
		bulider.moveToElement(driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"))).perform();
	    driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
	    String noOfShoes = driver.findElement(By.xpath("//span[contains(text(),'Items')]")).getText();
	    System.out.println(noOfShoes);
	    driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
	    driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
	    driver.findElement(By.xpath("//ul[@class='sort-value']/li[@data-index='1']")).click();
	    driver.findElement(By.name("fromVal")).sendKeys("550");
	    driver.findElement(By.name("toVal")).sendKeys("700");
	    driver.findElement(By.xpath("//label[@for='Color_s-Navy']")).click();
	    bulider.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'col-xs-6 l')] "))).perform();
	    WebElement findElement = driver.findElement(By.xpath("//div[contains(text(),'Quick')] "));
	    driver.executeScript("arguments[0].click();", findElement);
	    System.out.println(driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText());
	    System.out.println(driver.findElement(By.xpath(" //span[@class='payBlkBig']")).getText());
	    File source1 = driver.getScreenshotAs(OutputType.FILE);
		 File target1 = new File("./snaps/shoes.png");
		 FileUtils.copyFile(source1, target1);
	    driver.close();
	}

}
