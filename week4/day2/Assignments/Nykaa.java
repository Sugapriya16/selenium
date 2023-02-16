package week4.day2.Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		  /* 1) Go to  https://www.nykaa.com/
			2) Mouseover on Brands and Search L'Oreal Paris
			3) Click L'Oreal Paris
			4) Check the title contains L'Oreal Paris(Hint-GetTitle)
			5) Click sort By and select customer top rated
			6) Click Category and click Hair->Click haircare->Shampoo
			7) Click->Concern->Color Protection
			8)check whether the Filter is applied with Shampoo
			9) Click on L'Oreal Paris Colour Protect Shampoo
			10) GO to the new window and select size as 175ml
			11) Print the MRP of the product
			12) Click on ADD to BAG
			13) Go to Shopping Bag 
			14) Print the Grand Total amount
			15) Click Proceed
			16) Click on Continue as Guest
			17) Check if this grand total is the same in step 14
			18) Close all windows
         */
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		Actions bulider = new Actions(driver);
		bulider.moveToElement(driver.findElement(By.xpath("//a[text()='brands']"))).perform();
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		driver.findElement(By.xpath("//a[text()=\"L'Oreal Paris\"]")).click();
		String title = driver.getTitle();
		System.out.println(title.contains("L'Oreal Paris"));
		driver.findElement(By.xpath("//span[text()='Sort By : popularity']")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']/ancestor::label")).click();
		driver.findElement(By.xpath("//span[text()='Category']//parent::div")).click();
		
		try {
			Thread.sleep(1000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Hair']/parent::div")));
		driver.findElement(By.xpath("//span[text()='Hair']/parent::div")).click();
		driver.findElement(By.xpath("//span[text()='Hair Care']//parent::div")).click();
        driver.findElement(By.xpath("//span[text()='Shampoo']/ancestor::label")).click();
        WebElement Concern = driver.findElement(By.xpath("//span[text()='Concern']//parent::div"));
        		driver.executeScript("arguments[0].click();", Concern);
        driver.findElement(By.xpath("//span[text()='Color Protection']/ancestor::label")).click();
		}catch (StaleElementReferenceException e) {
		    System.out.println("Unable to find the element");
		    e.printStackTrace();
		    }
		//filter box text
        String text = driver.findElement(By.xpath("//div[@class='css-rtde4j']")).getText();
        System.out.println("Filters of the product contains Shampoo :"+text.contains("Shampoo"));
        //Thread.sleep(3000);
        WebElement findElement = driver.findElement(By.xpath("//div[contains(text(),'Shampoo')]"));
        driver.executeScript("arguments[0].click();", findElement);
      //  driver.executeScript("arguments[0].click();", findElement);
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windows = new ArrayList(windowHandles);
        driver.switchTo().window(windows.get(1));
        driver.findElement(By.xpath("//span[text()='704ml']/parent::button")).click();
        System.out.println("MRP of the procuct: " +driver.findElement(By.xpath("//span[contains(text(),'MRP')]/parent::div")).getText());
        driver.findElement(By.xpath("//span[text()='Add to Bag']/parent::button")).click();
        driver.findElement(By.xpath("//span[@class='cart-count']/ancestor::button")).click();
              driver.switchTo().frame(0);
        String grandtotal = driver.findElement(By.xpath("//span[text()='Grand Total']/parent::div/preceding-sibling::div/span")).getText();
        System.out.println("Grand Total in Cart: " +grandtotal);        
        WebElement button1= driver.findElement(By.xpath("//span[text()='Proceed']"));
        driver.executeScript("arguments[0].click();", button1);
      

	   driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
	   driver.quit();
	    
	}
	
	

}
