package Marathan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable-notifications");        
        ChromeDriver driver = new ChromeDriver(option);
		 driver.get("https://login.salesforce.com");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.name("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		 driver.findElement(By.name("pw")).sendKeys("Leaf@123");
		 driver.findElement(By.id("Login")).click();
		 driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		 driver.findElement(By.xpath("//button[text()='View All']")).click();
		 driver.findElement(By.xpath("//p[text()='Sales']")).click();
		 WebElement findElement = driver.findElement(By.xpath("//a[@title='Opportunities']"));
		 driver.executeScript("arguments[0].click();", findElement);
		 driver.findElement(By.xpath("//div[@title='New']")).click();
		 Thread.sleep(1000);
		 WebElement findElement2 = driver.findElement(By.xpath("//input[@name='Name']"));
		 String result = "Salesforce Automation By Sugapriya";
		 findElement2.sendKeys(result);
		 System.out.println(result);
		 driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("1/27/2023");
		 driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__input ')]")).click();
		 driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		 //driver.findElement(By.xpath("//span[text()='Close error dialog']")).click();
		 driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		 String text = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']")).getText();
		 System.out.println(text);
		 if (result.equals(text)) {
			 System.out.println("Oppourtunity name was as same as given");
		 }else System.out.println("Oppourtunity name was not as same as given");
		 

	}

}
