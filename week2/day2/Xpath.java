package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath {

	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Democsr");
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");
		 driver.findElement(By.xpath("//input[@value='Login']")).click();
		 driver.findElement(By.xpath("//a[contains(text(), ' CRM')]")).click();
		 driver.findElement(By.xpath("//a[text()='Leads']")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		 driver.findElement(By.xpath("//input[@name='companyName' and @class='inputBox']")).sendKeys("Google");
		 driver.findElement(By.xpath("//input[@name='firstName' and @class='inputBox']")).sendKeys("Suga");
		 driver.findElement(By.xpath("//input[@id ='createLeadForm_lastName']")).sendKeys("Priya");
		 driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9940485398");
		 WebElement  source = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
		// Create an object for Select class
			Select dd = new Select(source);
			dd.selectByIndex(2);
		driver.findElement(By.xpath("//input[@type ='submit']")).click();
		 

	}

}
