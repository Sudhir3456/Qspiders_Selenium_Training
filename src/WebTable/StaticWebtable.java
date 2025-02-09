package WebTable;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebtable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Hi/Desktop/WebTable.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//find secand cell in web table and print secand cell data
		String text = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
		System.out.println(text);
		
		
		List<WebElement> roeList = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("rows :" +roeList.size());
		
		List<WebElement> columnList = driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
		System.out.println("column :" +columnList.size());
		
		for (int r = 2; r <= roeList.size(); r++) {
			
			for (int c = 1; c <= columnList.size(); c++) {
				String data = driver.findElement(By.xpath("//table/tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.println(data);
				//driver.close();
			}
			
		}
		
		
		
	}

}
