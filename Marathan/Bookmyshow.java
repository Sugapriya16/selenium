package Marathan;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Bookmyshow {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable-notifications");        
        ChromeDriver driver = new ChromeDriver(option);
		 driver.get("https://in.bookmyshow.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.xpath("//input[@placeholder='Search for your city']")).sendKeys("Hyderabad");
		 driver.findElement(By.xpath("//li[@class='sc-gJqsIT jMjMYb']")).click();
		 String title = driver.getCurrentUrl();
		 System.out.println(title);
		 if (title.contains("hyderabad")) {
			 System.out.println("Url has got loaded with Hyderbad");
		 }else System.out.println("Url was not loaded with Hyderbad");
		 driver.findElement(By.xpath("//span[@id='4']")).click();
		 driver.findElement(By.xpath("//input[@placeholder='Search for Movies, Events, Plays, Sports and Activities']")).sendKeys("Avatar");
		 driver.findElement(By.xpath("//strong[contains(text(), 'Avatar')]")).click();
		 driver.findElement(By.xpath("//span[(text()= 'Book tickets')]")).click();
		 Thread.sleep(400);
		 driver.findElement(By.xpath("//span[(text()= '3D')]")).click();
		 System.out.println(driver.findElement(By.xpath(" (//a[@class= '__venue-name'])[4]")).getText());
		 driver.findElement(By.xpath("(//img[@class= 'venue-info-icon lazy'])[4]")).click();
		 String parfac = driver.findElement(By.xpath("(//div[@class='facility-text'])[5]")).getText();
		 if (parfac.equalsIgnoreCase("Parking Facility")){
			System.out.println("Parking Facility is Avaliable"); 
		 }else System.out.println("Parking Facility is Not Avaliable"); 
		 driver.findElement(By.xpath("//div[@class='cross-container']")).click();
		 driver.findElement(By.xpath("(//a[@class='showtime-pill'])[4]")).click();
		 driver.findElement(By.id("btnPopupAccept")).click();
		 driver.findElement(By.id("pop_1")).click();
		 driver.findElement(By.id("proceed-Qty")).click();
		 driver.findElement(By.id("B_5_0115")).click();
		 driver.findElement(By.id("btmcntbook")).click();
		 Thread.sleep(2000);
		// String amt = driver.findElement(By.xpath("//span[@id='subTT']")).getText();
		 System.out.println("Total Amount :" + driver.findElement(By.xpath("//span[@id='subTT']")).getText());
		// Thread.sleep(2000);
		 File source1 = driver.getScreenshotAs(OutputType.FILE);
		 File target1 = new File("./snaps/output.png");
		 FileUtils.copyFile(source1, target1);

	}

}
