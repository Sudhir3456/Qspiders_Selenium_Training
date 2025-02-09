package PopupsYT;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
 
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-herokuappinternet..com/javascript");
		driver.manage().window().maximize();
		
		//Noraml alert with ok button
	/*	
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(5000);
		
		Alert myalert=driver.switchTo().alert();
		myalert.accept();
		
		*/
		
		//2) confirmation Alert - ok & Cancel 
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();  //close alert using ok button

		driver.switchTo().alert().dismiss(); //close alert using Cancel button
		
		
		//3) Prompt alert- Input box
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).clear();
		Thread.sleep(5000);
		
		Alert myalert=driver.switchTo().alert();
		
		myalert.sendKeys("Welcome");
		myalert.accept();
		
		
	}

}

