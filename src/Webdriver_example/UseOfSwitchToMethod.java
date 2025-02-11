package Webdriver_example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfSwitchToMethod {

	public static void main(String[] args) throws InterruptedException {
 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
	    driver.get("https://www.linkedin.com/feed/");
	    driver.switchTo().newWindow(WindowType.WINDOW);
	    driver.getTitle();
 	    driver.get("https://www.facebook.com/");
 	    driver.switchTo().newWindow(WindowType.WINDOW);

 		driver.get("https://www.selenium.dev/downloads/");
 	    driver.switchTo().newWindow(WindowType.WINDOW);

	  /*  Set<String>	winid=driver.getWindowHandles();
	    for(String wid:winid)
	    {
	    	//if()
 	    	
	    }
	    */
	   // System.out.println(winid+"");
	  
				

		
		
		
		
		
		
	}

}
