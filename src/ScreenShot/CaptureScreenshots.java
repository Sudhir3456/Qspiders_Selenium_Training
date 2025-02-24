package ScreenShot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshots {

	public static void main(String[] args) {
 
	WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.nopcommerce.com/en/demo");
		driver.manage().window().maximize();		
		
		//1) full page Screenshot 
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		
	//	File targetfile=new File("C:\\Automation\\myworkspaces\\seleniumwebdriver\\seleniumwebdriver\\screenshots\\fullpage.png");//path	
	//	sourcefile.renameTo(targetfile);  //copy sourcefile to traget file   
		
		String tname = null;
		String timeStamp = null;
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname +"_" +timeStamp + ".png";
		File targetFile=new File(targetFilePath);
		
		
		
		
		
		
		
		//2)capture the screenshot of specific section
		
		//featuredProducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
	/*	WebElement featuredProducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product_grid']"));
		
		File sourcefile1=featuredProducts.getScreenshotAs(OutputType.FILE);
		sourcefile1.renameTo(targetfile);  //copy sourcefile to traget file

		  */
		
		//3) capture the Screenshot of webelement 
		
			WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
			File sourcefile1=logo.getScreenshotAs(OutputType.FILE);
			File targetfile1=new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
			sourcefile1.renameTo(targetfile1);  //copy sourcefile to traget file 
			
			driver.quit();

		 			
			
			
			
		
	}

}
