package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoubleClickAction {

	public static void main(String[] args) {

           WebDriver driver=new ChromeDriver();
           
           driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
           driver.manage().window().maximize();
           
         //  WebElement box1=driver.findElement(By.xpath("//input[@id='field1']"));  //need here
       //    WebElement box2=driver.findElement(By.xpath("//input[@id='field2']"));
           
           
           driver.findElement(By.xpath(null));
           
           //button[normalize-space()='copy Text']
           

           
		
		
		
		
		
	}

}
