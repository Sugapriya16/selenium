package week4.day2.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		System.out.println(driver.findElement(By.id("Click")).getText());
		driver.switchTo().defaultContent();
		List<WebElement> framesCount = driver.findElements(By.tagName("iframe"));
		System.out.println("No of Frames in this page :" + framesCount.size());
		driver.switchTo().frame(2);
		driver.switchTo().frame(driver.findElement(By.id("frame2")));
		driver.findElement(By.id("Click")).click();
		System.out.println(driver.findElement(By.id("Click")).getText());
		driver.close();
	}

}
