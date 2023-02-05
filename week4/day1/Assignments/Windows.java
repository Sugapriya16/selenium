package week4.day1.Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		 driver.get("https://leafground.com/window.xhtml");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.xpath("//span[text()='Open']")).click();
		 String parentWindow = driver.getWindowHandle();
		 String parent = driver.getTitle();
		 Set<String> windowHandles = driver.getWindowHandles();
		 List<String> windows = new ArrayList<String>(windowHandles);
		 driver.switchTo().window(windows.get(1));
		 String child = driver.getTitle();
		 driver.close();
		 if (child.equalsIgnoreCase(parent)) {
			 System.out.println("Child Window doesn't open");
		 }else System.out.println("Child Window  opened");
		 driver.switchTo().window(parentWindow);
		 driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		 Set<String> MultipleWindows = driver.getWindowHandles();
		 System.out.println("No Of windows :" + MultipleWindows.size());
		 driver.switchTo().window(parentWindow);
		 driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		 Set<String> CloseWindows = driver.getWindowHandles();
		 List<String> Mw = new ArrayList<String>(CloseWindows);
		 for (int i = 1; i < Mw.size(); i++) {
			 driver.switchTo().window(Mw.get(i));	
			 driver.close();	
		}
		 driver.switchTo().window(parentWindow);
		 driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		 Set<String> Openwithdelay = driver.getWindowHandles();
		 List<String> Owd = new ArrayList<String>(Openwithdelay);
		 System.out.println("List Of Title of windows which are open now after click on Open with delay button");
		 for (int i = 0; i < Owd.size(); i++) {
			 System.out.println(driver.switchTo().window(Owd.get(i)).getTitle());	
		}
		driver.quit();
	}

}
