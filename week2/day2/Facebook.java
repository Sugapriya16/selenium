package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 //parent to child Xpath
		 driver.findElement(By.xpath("//div[@class='_6ltg']/a[@role='button']")).click();
		 driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Suga");
		 driver.findElement(By.name("lastname")).sendKeys("Priya");
		 driver.findElement(By.name("reg_email__")).sendKeys("9456378041");
		 Select dd = new Select(driver.findElement(By.name("birthday_day")));
		 dd.selectByValue("16");
		 Select mon = new Select(driver.findElement(By.name("birthday_month")));
		 mon.selectByVisibleText("Jan");
		 Select year = new Select(driver.findElement(By.name("birthday_year")));
		 year.selectByValue("1997");
		 driver.findElement(By.xpath("//input[@value='1']")).click();        

	}

}
