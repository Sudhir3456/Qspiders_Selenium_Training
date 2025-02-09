package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch_AutoSuggestDropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("selenium"); //search box
		Thread.sleep(500);
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//div[@role='option']"));
		
		System.out.println(list.size());
		
		for(int i=0;i<=list.size();i++)
	      {
			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().equals("selenium"))
			{
				
				list.get(i).click();
				break;
				
			}
	
		  }
		
		
		
		
	}

}
