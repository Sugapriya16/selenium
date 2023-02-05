package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@class='h_menu_drop_button hidden-xs']")).click();
		//to get only one window eg:parent window
		String parentWindowHandle = driver. getWindowHandle(); 
		driver.findElement(By.id("disha-banner-close")).click();
		driver.findElement(By.xpath("//label[text()='FLIGHTS']")).click();
		//to get all windows using linkedSet
		Set<String> windowHandles = driver. getWindowHandles(); 
		//set to list
		List<String>windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentWindowHandle);
		driver.close();
		
	
	}

}
