package week4.day2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://leafground.com/waits.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementSelectionStateToBe(driver.findElement(By.xpath("//span[text()='I am here']")), false));
		System.out.println(driver.findElement(By.xpath("//span[text()='I am here']")).getText());
	    driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
	    wait.until(ExpectedConditions.invisibilityOfElementLocated((By.xpath("//span[text()='I am about to hide']"))));
	    driver.findElement(By.xpath("//span[text()='Click First Button']")).click();
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Click Second']")));
	    driver.findElement(By.xpath("(//span[text()='Click'])[3]")).click();
	    String text1 = driver.findElement(By.xpath("//span[@id='j_idt87:hide4']//span")).getText();
	    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//span[@id='j_idt87:hide4']//span"), "Did you notice?"));
	    String text2 = driver.findElement(By.xpath("//span[@id='j_idt87:hide4']//span")).getText();
		System.out.println(text1+" "+text2);
	}
	

}
