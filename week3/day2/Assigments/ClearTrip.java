package week3.day2.Assigments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {

	public static void main(String[] args) {
		/*
		 * URL - https://www.cleartrip.com/
		1) Launch chrome and load URL, Add implicitwait
		2) Click Round trip
		3) Enter From city (Chennai) and TAB
		4) Enter To city (New York) and TAB
		5) Click Depart On (text box) 
		6) Select current date as Depart date
		7) Click Return On (text box) 
		8) Select tomorrow's date as return date
		9) Select Adults (as 2)
		10) Select Children (as 1)
		11) Select Infant (as 1)
		12) Click More Options (use id as locator)
		13) Select Premium Economy as Class of Travel
		14) Enter Preferred Airline as Emirates and TAB
		15) Click Search Flights 
		 */		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath("//div[contains(@class,'px-1  ')]")).click();
		driver.findElement(By.xpath("//button[contains(@class,'flex flex')]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'flex flex-between')])[2]")).click();
		driver.findElement(By.xpath("(//button[contains(@class,'flex flex')])[2]")).click();
		driver.findElement(By.xpath("//li[@class='flex-inline']")).click();
		driver.findElement(By.xpath("(//li[@class='flex-inline'])[2]")).click();
		driver.findElement(By.xpath("(//li[@class='flex-inline'])[3]")).click();
		driver.findElement(By.xpath("//div[text()='Premium economy']")).click();
		driver.findElement(By.xpath("(//div[@class='flex flex-middle'])[3]/parent::div")).click();
		driver.findElement(By.xpath("//input[@placeholder='Where from?']")).sendKeys("Chennai" , Keys.TAB,"New York",Keys.TAB);
		driver.findElement(By.xpath("(//button[contains(@class,'flex flex-middle  t-all fs-2 ')])[2]")).click();
		driver.findElement(By.xpath("(//div[text()='1'])[2]")).click();		
		driver.findElement(By.xpath("//span[text()='Search flights']")).click();
		

	}

}
