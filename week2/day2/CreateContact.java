package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Contacts")).click();
		 driver.findElement(By.linkText("Create Contact")).click();
		 driver.findElement(By.id("firstNameField")).sendKeys("Suga");
		 driver.findElement(By.id("lastNameField")).sendKeys("Priya");
		 driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Suga");
		 driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Priya");
		 driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Technology");
		 driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("description");
		 driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Suga@gmail.com");
		 WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		 Select vv = new Select (state);
		 vv.selectByVisibleText("New York");
		 driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
		 driver.findElement(By.linkText("Edit")).click();
		 driver.findElement(By.name("description")).clear();
		 driver.findElement(By.name("importantNote")).sendKeys("Importance Note");
		 driver.findElement(By.xpath("//input[@value='Update']")).click();
		 System.out.println(driver.getTitle());	 

	}

}
