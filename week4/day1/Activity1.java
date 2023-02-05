package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement frameEle = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frameEle);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Sugapriya");
		alert.accept();
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		if(text.contains("Sugapriya")) {
			System.out.println("Text Contains Name entered in prompot alert");
		}else System.out.println("Text doen't contains Name entered in prompot alert");
		driver.close();

	}

}
