package Selenium_tipsAndTrick;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checked_List_box_Sorted {

	public static void main(String[] args) {
 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");
		
		Select dropDown=new Select(driver.findElement(By.xpath("//select[@id='animals']")));
		
		ArrayList originalList=new ArrayList();
		ArrayList teampList=new ArrayList();
		
		List<WebElement> options=dropDown.getOptions();
		
		for (WebElement option:options) {
			
			originalList.add(option.getText());
			teampList.add(option.getText());

		}


        System.out.println("Before sorting...");
        System.out.println("Original list.."+originalList);
        System.out.println("Teamp list..."+teampList);
  	}

}
