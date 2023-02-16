package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {

	public static void main(String[] args) throws InterruptedException {
		/*ClassRoom Activity 1:
			1. Launch https://erail.in/
			2. Enter From Station as MAS and Enter
			3. Enter To Station as CBE and Enter
			4. Deselect Sort on Date checkbox
			5. Get all the Train names
			6. Verify if there are any duplicate train names
			*/
		ChromeDriver driver=new ChromeDriver();
		 driver.get("https://erail.in/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.id("txtStationFrom")).clear();
		 driver.findElement(By.id("txtStationFrom")).sendKeys("MAS",Keys.ENTER);
		 driver.findElement(By.id("txtStationTo")).clear();
		 driver.findElement(By.id("txtStationTo")).sendKeys("CBE", Keys.ENTER);
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id ='chkSelectDateOnly']")).click();
		// driver.findElement(By.id("buttonFromTo")).click();
		 List<WebElement> allrows = driver.findElements(By.xpath("//div[@id='divTrainsList']//td[2]"));
		 System.out.println(allrows.size());
		 List<String> NameList = new ArrayList<String>();
		 String text1 = driver.findElement(By.xpath("//div[@id='divTrainsList']//tr[2]/td[2]")).getText();
		 System.out.println(text1);
		 for (int i = 2; i <= (allrows.size()-6); i++) {
		 String text = driver.findElement(By.xpath("//div[@id='divTrainsList']//tr["+i+"]/td[2]")).getText();
		 NameList.add(text);
		 }
		 int sizeoflist = NameList.size();
		 Set<String> SetofNames = new HashSet<String>(NameList);
		 int sizeofset = SetofNames.size();
		 System.out.println(sizeoflist + " "+sizeofset);
		 
		 
		 
	}

}
