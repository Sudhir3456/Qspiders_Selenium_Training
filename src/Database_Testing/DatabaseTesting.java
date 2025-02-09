package Database_Testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatabaseTesting {

	public static void main(String[] args) throws InterruptedException, ClassNotFoundException, SQLException {

		Random random = new Random();
		
		int no = random.nextInt(100);
		

		String cust_firstname = "Ram";
		String cust_lastname = "Kumar";
		String cust_email = "ram"+no+"@gmail.com";
		String cust_telPhone = "97083515111";
		String cust_password = "Ram@123";

		// user Registration
		WebDriver driver = new ChromeDriver();

		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Register']")).click();

		driver.findElement(By.name("firstname")).sendKeys(cust_firstname);
		driver.findElement(By.name("lastname")).sendKeys(cust_lastname);
		driver.findElement(By.name("email")).sendKeys(cust_email);
		driver.findElement(By.name("telephone")).sendKeys(cust_telPhone);
		driver.findElement(By.name("password")).sendKeys(cust_password);
		driver.findElement(By.name("confirm")).sendKeys(cust_password);
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();

		try {

			String confmsg = driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']")).getText();

			if (confmsg.equals("Your Account Has Been Created!")) {
				System.out.println("Registration Successful from the UI/Application");
			} else {
				System.out.println("Registration Not Successful from the UI/Application");

			}
		} catch (Exception e) {
			System.out.println("Some problem in the  UI/Application");
		}

		/// Database Validation
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");
		Connection con = DriverManager.getConnection("Jdbc:mysql://localhost:3306/openshop","root","Sudhir@0108");
		Statement statement = con.createStatement();
		System.out.println("Statement got Createated");

		ResultSet rs = statement.executeQuery("SELECT * FROM oc_customer");
		System.out.println("Query got Excuted Successfuly");

		boolean status = false;

		while (rs.next()) {

			String firstname = rs.getString("firstname");
			String lastname = rs.getString("lastname");
			//String email = rs.getString("email");
			String telephone = rs.getString("telephone");

			System.out.println("==================================================");
			System.out.println("This is My Username: " + rs.getString("firstname"));
			System.out.println("==================================================");
			System.out.println("This is My Password: " + rs.getString("lastname"));
			System.out.println("==================================================");
			System.out.println("This is My email: " + cust_email);
			System.out.println("==================================================");
			System.out.println("This is My telephone: " + rs.getString("telephone"));
			System.out.println("==================================================");

			if (cust_firstname.equals(firstname) && cust_lastname.equals(lastname) && cust_email.equals(cust_email)
					&& cust_telPhone.equals(telephone)) {
				System.out.println("Record found in the table || Test Passed");
				status = true;
				break;
			}
			if (status == false) {
				System.out.println("Record not found in the table || Test Failed");

			}

		}

	}
}
