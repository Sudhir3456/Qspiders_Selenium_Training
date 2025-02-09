package Database_Testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class DBTesting {
	
	//@Test
	//public void dataBaseTesting() throws ClassNotFoundException, SQLException, InterruptedException {
	public static void main(String[] args) throws InterruptedException, SQLException, ClassNotFoundException {
		
	//Factch the Login Data From Database and Login the Applications
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");
		Connection con = DriverManager.getConnection("Jdbc:mysql://localhost:3306/databasetesting","root","Sudhir@0108");    ///a/c to me 
		Statement statement = con.createStatement();
		System.out.println("Statement got Createated");
		
		ResultSet rs = statement.executeQuery("SELECT * FROM orangehrm");
		System.out.println("Query got Excuted Successfuly");
		
		while (rs.next()) {
                 
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			WebElement userName = driver.findElement(By.name("email"));
			System.out.println("==================================================");
			System.out.println("This is My Username: "+rs.getString("UserName"));
			System.out.println("==================================================");
			System.out.println("This is My Password: "+rs.getString("Password"));
			System.out.println("==================================================");
			userName.sendKeys(rs.getString("UserName"));
			WebElement passWord = driver.findElement(By.name("password"));
			passWord.sendKeys(rs.getString("Password"));	
			WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
			login.click();

		 
		}


	}	
		
		
	}
	
	
	
