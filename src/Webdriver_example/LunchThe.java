package Webdriver_example;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchThe {

	public static void main(String[] args) {
 
		 
			   WebDriver driver=new ChromeDriver();
			   driver.manage().window().maximize();
				
			    driver.get("https://www.linkedin.com/feed/");
			   
			    driver.navigate().to("https://www.linkedin.com/feed/");
			 
			    Dimension setPostion=new Dimension(110, 432);
			    
			    driver.manage().window().setSize(setPostion);
			    
			   Point setpos= new Point(56, 89);
			   driver.manage().window().setPosition(setpos);
			   
			   // driver.switchTo().newWindow(w)
			    
			   Point postn =driver.manage().window().getPosition();
			  
		         int xAxis  =postn.getX();	  
		         int yAxis=postn.getY();
		         
		         System.out.println(xAxis);
		         System.out.println(yAxis);

		         
			   
			 
				
				
			}

		

		
		
		
		
	}


