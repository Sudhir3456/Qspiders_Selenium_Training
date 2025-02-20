package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynicPagitionTabale {

	public static void main(String[] args) throws InterruptedException {
 
		
        WebDriver driver=new ChromeDriver();
		
          driver.get("https://demo.opencart.com/admin/");
		  driver.manage().window().maximize();
		  
		  WebElement username=driver.findElement(By.xpath("//input[id='input-username']")); 
		  username.clear();
		  username.sendKeys("demo");
		  
		  WebElement password=driver.findElement(By.xpath("//input[id='input-password']"));
		  password.clear();
		  password.sendKeys("demo");
		
		  driver.findElement(By.xpath("//button[normlize-space()='Login']")).click();
		  
		  //close windows if it is aviable
		  if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed())
		  {
			   driver.findElement(By.xpath("//button[@classs='btn-close']")).click();

		  }
	
   
	       driver.findElement(By.xpath("//a[@classs='parent-collapsed'][normlize-space()='Customers']")).click();
		   driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		   
		   //showing 1 to 10 of 19081(1909 Pages)
		//   String text=driver.findElement(By.xpath("//div[contains(text),'Pages')]")).getText();
		 //  int total_pages=Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("page")-1));
		   
		   
		 //  repeting pages
		   for(int p=1;p<=5;p++)
		   {
			   if(p>2)
			   {
				  WebElement active_page=driver.findElement(By.xpath("//ul[@classs='pagination']//*[text()="+p+"]"));
				  active_page.click();
				  Thread.sleep(3000);

			   }
			   
			  //reading data from the page 
			   int noOfRows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			   for(int r=1; r<=noOfRows;r++)
			   {
				   String CustomerName=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[2]")).getText();
				   String status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[5]")).getText();


			       String email=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[3]")).getText();
			  // String status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[5]")).getText():
				   
               System.out.print(CustomerName+"\t" +email+"\t"+status);

				   
			   }
			   
		   }
		   




	}

}
