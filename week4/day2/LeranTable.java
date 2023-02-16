package week4.day2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class LeranTable {

	public static void main(String[] args) {
		
			ChromeDriver driver=new ChromeDriver();
		 driver.get("https://leafground.com/table.xhtml");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 //table/tbody/tr[1]/tr[1]

	}

}
