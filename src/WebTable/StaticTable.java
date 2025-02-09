package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1)find total number of rows in a table
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); //multipal tables
	//	int cols=driver.findElements(By.tagName("th")).size(); //single tables
		System.out.println("number of rows:"+rows)	;	
         
      //  2) find total number of columns in a table
 		int colns=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size(); //multipal tables
 		System.out.println("number of rows:"+colns);	

 	//	3) Read data from all from specific row and column ( ex: 5th rows and 1st colum)
 	//	String bookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText(); 		
 	//	System.out.println(bookName);  //Master In Selenium

 		//4) read data from all the rows and coluns
	 //	System.out.println("BOOKNAME"+"\t"+"AUTHOR"+"\t"+"SUBJECT"+"\t"+"PRICE");  

 	/*	for(int r=2;r<=rows;r++)
 		{
 			for(int c=1;c<=colns;c++)
 			{
 				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
 		 		System.out.print(value+"\t");  

 			}
		 		System.out.println();  

 		}
 		*/
 		//5) print book names whose author is Mukesh 
 		
 	/*	for(int r=2;r<=rows;r++)
 		{
 		 	String autherName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText(); 		
 		 	
 		 	if(autherName.equals("Mukesh"))
 		 	{
 		 	 	String bookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText(); 	
 		 	 	System.out.println(bookName+"\t"+autherName);  //Master In Selenium


 		 	}

 			
 		}
 		
 		*/
 		//6) find the price of all the books
 		int total=0;
 	   for(int r=2;r<=rows;r++)
 	   {
		 	String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText(); 		
            total=total+Integer.parseInt(price);
            	
 	   }

 		
		System.out.println("total Price of the books :"+total);  //7100
 		
	}

}
