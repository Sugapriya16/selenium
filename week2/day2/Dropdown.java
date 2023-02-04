package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		//open browser
				//object creation ChromeDriver is class name and driver is object name
				 ChromeDriver driver=new ChromeDriver();
				//load URL
				 driver.get("http://leaftaps.com/opentaps/control/main");
				 driver.manage().window().maximize();
				 WebElement findElement = driver.findElement(By.id("username"));
				 findElement.sendKeys("Democsr");
				 driver.findElement(By.id("password")).sendKeys("crmsfa");
				 driver.findElement(By.className("decorativeSubmit")).click();
				 driver.findElement(By.linkText("CRM/SFA")).click();
				 driver.findElement(By.linkText("Leads")).click();
				 driver.findElement(By.linkText("Create Lead")).click();
				 //DropDown
				 WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
				// Create an object for Select class
					Select dd = new Select(source);
					// Select the option
					// using index
			         //dd.selectByIndex(2);
					// using the visible text
					dd.selectByVisibleText("Conference");			         
			        
					



	}

}
