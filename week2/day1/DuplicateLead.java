package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		//open browser
				//object creation ChromeDriver is class name and driver is object name
				 ChromeDriver driver=new ChromeDriver();
				//load URL
				 driver.get("http://leaftaps.com/opentaps/control/main");
				 driver.manage().window().maximize();
				 WebElement findElement = driver.findElement(By.id("username"));
				 findElement.sendKeys("DemoSalesManager");
				 driver.findElement(By.id("password")).sendKeys("crmsfa");
				 driver.findElement(By.className("decorativeSubmit")).click();
				 driver.findElement(By.linkText("CRM/SFA")).click();
				 driver.findElement(By.linkText("Leads")).click();
				 driver.findElement(By.linkText("Create Lead")).click();
				 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Google");				 
				 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suga");
				 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Priya");
				 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Suga");
			     driver.findElement(By.name("departmentName")).sendKeys("Information Technology");
			     driver.findElement(By.id("createLeadForm_description")).sendKeys("Description");
			     driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("suga@gmail.com");
				 driver.findElement(By.className("smallSubmit")).click();
				 System.out.println(driver.getTitle());
				 driver.findElement(By.linkText("Duplicate Lead")).click();
				 WebElement compynam = driver.findElement(By.id("createLeadForm_companyName"));
				 compynam.clear();
				 compynam.sendKeys("Amazon");
				 WebElement firtsNam = driver.findElement(By.id("createLeadForm_firstNameLocal"));
				 firtsNam.clear();
				 firtsNam.sendKeys("Vishnu");
				 driver.findElement(By.className("smallSubmit")).click();
				 System.out.println(driver.getTitle());
				 driver.close();			 

	}

}
