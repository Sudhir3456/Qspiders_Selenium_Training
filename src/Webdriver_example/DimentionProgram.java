package Webdriver_example;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimentionProgram {

	public static void main(String[] args) {

    //Lunch any three Web Application
	//Get height if first application
   //Get Width if Second application
   //Get height and Width 3rd application
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
	   //Lunch any three Web Application	
	   driver.get("https://www.linkedin.com/feed/");
	   System.out.println(driver.getTitle());
	   driver.switchTo().newWindow(WindowType.WINDOW);
	   
	   driver.get("https://www.facebook.com/");
	   driver.switchTo().newWindow(WindowType.WINDOW);
	   
	   driver.get("https://www.selenium.dev/downloads/");
	   driver.switchTo().newWindow(WindowType.WINDOW);
	   
	  Set<String> allWinId=driver.getWindowHandles();
	  System.out.println("Windows ID Of All The Application :"+allWinId);

 	  for(String winId:allWinId)
	  { 
 		  
	      String title=driver.switchTo().window(winId).getTitle(); 
		  //Get height if first application
		  if(title.contains("LinkedIn"))
		  {
			     int hight=driver.manage().window().getSize().getHeight();
			     System.out.println("Hight of First Application :"+hight);
		  }
		// String title1=driver.switchTo().window(winId).getTitle(); 

		 else if(title.contains("Facebook"))
		 {
	        int hight=driver.manage().window().getSize().getWidth();
		    System.out.println("Width of Secand Application :"+hight);
		  }
	
		// String title2 = driver.switchTo().window(winId).getTitle(); 
  	     if(title.contains("Selenium"))
		 {
		    // String title11=driver.switchTo().window(winId).getTitle(); 
			 int hight=driver.manage().window().getSize().getHeight();
		     int width=driver.manage().window().getSize().getWidth();

		     System.out.println("Hight & width Application :"+hight +" "+width);
		     
		  }

	}


 
	  driver.quit();
    //  driver.manage().window().getSize().getHeight();
		
		
		
		
		
	}

}
