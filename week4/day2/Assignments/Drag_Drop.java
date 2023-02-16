package week4.day2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions builder = new Actions(driver);
		WebElement dragele = driver.findElement(By.id("form:conpnl_content"));
		Point location = dragele.getLocation();
		System.out.println(location);
		builder.dragAndDropBy(driver.findElement(By.id("form:conpnl_content")), 350, 350).perform();
		//drag to target element
		builder.dragAndDrop(driver.findElement(By.id("form:drag_content")),driver.findElement(By.id("form:drop_content")))
		.perform();
       //draggable rows
		builder.dragAndDrop(driver.findElement(By.xpath("//tbody[@id='form:j_idt111_data']/tr[1]")),driver.findElement(By.xpath("//tbody[@id='form:j_idt111_data']/tr[8]")))
		.build()
		.perform();
	}

}
