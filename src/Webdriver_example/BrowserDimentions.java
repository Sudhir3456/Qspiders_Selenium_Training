

package Webdriver_example;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDimentions {

	public static void main(String[] args) {

		 //Lunch any three Web Application
		//Get height if first application
	    //Get Width if Second application
	   //Get height and Width 3rd application

	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
		
	    driver.get("https://www.linkedin.com/feed/");
	    
	    Dimension firstAppDimentions=driver.manage().window().getSize();
	    int firstAppHight=firstAppDimentions.getHeight();
	    
	    System.out.println("Height of first application :"+firstAppHight);
	    
		 driver.get("https://www.facebook.com/");
		 Dimension secandAppDimentions=driver.manage().window().getSize();
		 int secandAppWidth=secandAppDimentions.getWidth();
		 System.out.println("Width of Secand application :"+secandAppWidth);

	    
		 driver.get("https://www.selenium.dev/downloads/");
		 Dimension thirdAppDimentions=driver.manage().window().getSize();
		 int thirdAppHight=firstAppDimentions.getHeight();
		 int thirdAppWidth=thirdAppDimentions.getWidth();
		 System.out.println("Hight And Width of Third application :"+" "+thirdAppHight+"  "+thirdAppWidth);

		
		
		
		
	}

}
