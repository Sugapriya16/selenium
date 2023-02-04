package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) {
		
			ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.leafground.com/input.xhtml");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@placeholder='Babu Manickam']")).sendKeys("sugapriya");
		 driver.findElement(By.name("j_idt88:j_idt91")).sendKeys(" india");
		 System.out.println(driver.findElement(By.name("j_idt88:j_idt93")).isEnabled());
		 driver.findElement(By.id("j_idt88:j_idt95")).clear();
		 System.out.println(driver.findElement(By.id("j_idt88:j_idt97")).getText());
		 WebElement email = driver.findElement(By.id("j_idt88:j_idt99"));
		 email.sendKeys("Suga@gmail.com");
		 email.sendKeys(Keys.TAB);
		 driver.findElement(By.id("j_idt88:j_idt101")).sendKeys("Note on your self");
		 driver.findElement(By.xpath("//button[@class='ql-bold' and @type=\"button\"]")).click();
		 driver.findElement(By.xpath("//button[@value='rtl']")).click();
		 driver.findElement(By.xpath("//div[@id='j_idt88:j_idt103_editor']//p")).sendKeys("sugapriya enter the para in text editor box");
         driver.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
         System.out.println(driver.findElement(By.xpath("//span[@class='ui-message-error-detail']")).getText());
         System.out.println(driver.findElement(By.id("j_idt106:j_idt113")).getLocation());
         driver.findElement(By.xpath("//input[@id='j_idt106:float-input']")).click();
         System.out.println(driver.findElement(By.id("j_idt106:j_idt113")).getLocation());
         driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("sugapriya");
       //  driver.findElement(By.xpath("//li[contains(text(), '2')]")).click();
	}

}
