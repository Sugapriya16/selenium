package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DeleteLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 driver.findElement(By.linkText("Phone")).click();
		 driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9940485398");
		 driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1500));
		
//		 WebElement one = driver.findElement(By.xpath("//*[@id='ext-gen473']/div/table/tbody/tr[1]/td[1]/div/a"));
//		
//		 System.out.println(one.getAttribute("href"));
				//  .getText();
		// System.out.println(text);
		 driver.findElement(By.linkText("12516")).click();;
		 driver.findElement(By.linkText("Delete")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.name("id")).sendKeys("12516");
		driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
		String Result = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println(Result);

	}

}
