package Webdriver_example;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Diff_bet_toandto {

	public static void main(String[] args) throws URISyntaxException, MalformedURLException {

     WebDriver driver=new ChromeDriver();
     
   //  driver.get("https://www.linkedin.com/feed/");
     
     
     
     
  /*      URL mainurl=new URL("https://www.selenium.dev/downloads/");
 		driver.navigate().to(mainurl);
 		
 		URL mainulrl=new URL(mainurl, "login/");
 		driver.navigate().equals(mainulrl);
 		
 		*/
 		
 	     URL mainurl=new URL("https://www.dassault-aviation.com/en/#");     
	     driver.navigate().to(mainurl);
 		 URL mainulrl=new URL(mainurl, "group/");
	 	driver.navigate().equals(mainulrl);
		driver.navigate().back();
		
 		
 		
		
		
		
		
		
		
	}

}
