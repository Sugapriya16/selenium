package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
//	 Go to https://amazon.in
//	 Type phones -> id: twotabsearchtextbox
//	 Print price of every phone -> class: a-price-whole
//	 Print the lowest price !
//	 Hints: 
//	 Look what is common locator for all price info of every phone. 
//	 Use Collection sort to get the lowest price 
//	 (make sure the stored values are in Integer to support sorting)
//	 Use Integer.parseInt to convert String to integer

	public static void main(String[] args) {
		List<Integer> listofamt = new ArrayList<Integer>();
		 ChromeDriver driver=new ChromeDriver();
			 driver.get("https://www.amazon.in/");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones",Keys.ENTER);
			 List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
			 for (int i = 0; i < price.size(); i++) {
				String price1 = price.get(i).getText();
					String amount = price1.replace (",","");
					if ( !amount.isEmpty()) {
						//string into integer
						int parseInt = Integer.parseInt(amount);
					listofamt.add(parseInt);
					System.out.println(parseInt);
					}
				}
			  Collections.sort(listofamt);
			  System.out.println("Lowest Price is :" + listofamt.get(0));
	}

}
