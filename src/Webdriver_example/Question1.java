 package Webdriver_example;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
	
		public static void main(String[] args) {

	    //Lunch any three Web Application
		//Get height if first application
	    //Get Width if Second application
	   //Get height and Width 3rd application
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
		
		    //Lunch any three Web Application	
		   driver.get("https://www.linkedin.com/feed/");
		   driver.switchTo().newWindow(WindowType.TAB);
		   driver.get("https://www.facebook.com/");
		   driver.switchTo().newWindow(WindowType.TAB);

		   driver.get("https://www.selenium.dev/downloads/");
		   driver.switchTo().newWindow(WindowType.TAB);

		   
		  Set<String> allWinId=driver.getWindowHandles();
		  System.out.println(allWinId);
		  
		  for(String winId:allWinId)
		  {
			 //Switch to the application window
			 String title=driver.switchTo().window(winId).getTitle(); 
			  //Get height if first application
			  if(title.contains("LinkedIn"))
			  {
			     int hight=driver.manage().window().getSize().getHeight();
			     System.out.println("Hight of First Application :"+hight);
	 	      }
			  else if(title.contains("Facebook"))
			  {
				  int width=driver.manage().window().getSize().getWidth();
				  System.out.println("Width of Secand Application :"+width);
		 	      
			  }
			  else if(title.contains("Selenium"))
			  {
			     int hight=driver.manage().window().getSize().getHeight();
				  int width=driver.manage().window().getSize().getWidth();
			     System.out.println("Hight and Width Of Third Application :"+hight+" "+width);
			     
		      }
		  }
		  
	    
		  driver.quit();
	    //  driver.manage().window().getSize().getHeight();
			
			
			
			
			
		}

	}

	
	
	
	
	


