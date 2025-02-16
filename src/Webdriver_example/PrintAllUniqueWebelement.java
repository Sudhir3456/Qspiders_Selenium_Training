package Webdriver_example;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllUniqueWebelement {

	public static void main(String[] args)  {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Hi/Desktop/DropDown.html");
 
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// identify the DropDown
		WebElement dropDown = driver.findElement(By.id("dropdown"));
		
		Select s= new Select(dropDown);
        List<WebElement> allOptions = s.getOptions();
        
        Set<String> UniqueOptions = new LinkedHashSet<>();
        
        for(WebElement option:allOptions)
        {
        	UniqueOptions.add(option.getText());
        }
        
        //Print all unique options
        for(String uniOptions : UniqueOptions)
        {
        	System.out.println(uniOptions);
        }
        
        driver.close();
	}

}
