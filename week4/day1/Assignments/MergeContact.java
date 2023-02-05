package week4.day1.Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) {
		/*
		 * //Pseudo Code
		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login" 
		 * 2. Enter UserName and Password Using Id Locator 
		 * 3. Click on Login Button using Class Locator 
		 * 4. Click on CRM/SFA Link 
		 * 5. Click on contacts Button 	
		 * 6. Click on Merge Contacts using Xpath Locator 
		 * 7. Click on Widget of From Contact 
		 * 8. Click on First Resulting Contact 
		 * 9. Click on Widget of To Contact 
		 * 10. Click on Second Resulting Contact
		 * 11. Click on Merge button using Xpath Locator 
		 * 12. Accept the Alert 
		 * 13. Verify the title of the page
		 */
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 WebElement findElement = driver.findElement(By.id("username"));
		 findElement.sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		 driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		 driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		 Set<String> windowHandles = driver.getWindowHandles();
		 List<String> windows = new ArrayList<String>(windowHandles);
		 driver.switchTo().window(windows.get(1));
		 driver.findElement(By.className("linktext")).click();
		 driver.switchTo().window(windows.get(0));
		 driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		 Set<String> windowHandles2 = driver.getWindowHandles();
		 List<String> windows2 = new ArrayList<String>(windowHandles2);
		 driver.switchTo().window(windows2.get(1));
		 driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
		 driver.switchTo().window(windows2.get(0));
		 driver.findElement(By.xpath("//a[text()='Merge']")).click();
		 Alert alert = driver.switchTo().alert();
		 alert.accept();
		 System.out.println(driver.getTitle());
		 driver.close();
	}

}
