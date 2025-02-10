package Webdriver_example;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyEmailandEmailTextFieldEndPoint {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
	    driver.get("https://www.linkedin.com/feed/");
	    
	    WebElement emailTextField = driver.findElement(By.name("email"));
		
	    WebElement passwordTextField = driver.findElement(By.name("password"));

		Rectangle rectangle=emailTextField.getRect();
		
		int emailtfHight=rectangle.getHeight();
		int emailtfXaxis=rectangle.getX();
		System.err.println("emailtfXaxis");
		int emailtfyaxis=rectangle.getY();
		System.err.println("emailtfyaxis");
         
		int SumOfXaxisAndYaxis=emailtfXaxis+emailtfyaxis;


		System.out.println("emailtfHight");
		
		int emailTextFielwidth=rectangle.getWidth();
		System.out.println("emailTextFielwidth");
		int totaldimentationOfEmail=emailtfHight+emailTextFielwidth;
		System.out.println("totaldimentationOfEmail"); 

		
		
		
		Rectangle rectangleofPass=passwordTextField.getRect(); 
		int passfHight=rectangle.getHeight();
		int passtfHight=rectangle.getHeight();
		
		int totaldimentationOfPass=passfHight+passtfHight;
		System.out.println("totaldimentationOfPass");
		
		
		
			
		if (totaldimentationOfEmail==totaldimentationOfPass) {
			
			System.err.println("both are eqal");
			
		} else {
			System.err.println("both are not eqal");

		}




		
		
		
		
		
		
		
		
	}

}
