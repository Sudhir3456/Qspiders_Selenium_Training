package PopupsYT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
 
		WebDriver driver=new ChromeDriver();

	     driver.get("https://testautomationpractice.blogspot.com/");
	     driver.manage().window().maximize();
	     
	     //1) Select specific checkbox
	  //   driver.findElement(By.xpath("//input[@id='sunday']")).click();
	  //   driver.close();
	     
	     
	     //2) Select all the checkboxes
	     
	  //  List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@id='sunday'] || //input[@id='monday']"));
	    
	 /* for(WebElement checkbox:checkboxes)
	   {
	    	
	      checkbox.click();	  
	    }   */
	    
	    //for loop
	    
	/*    for(int i=0;i<checkboxes.size();i++)
	    {
	    	
	    	checkboxes.get(i).click();
	    }
	    */
	    
	    //3)Select first 3 chechekbox 
	    
	    //total no of checkboxes-how many checkboxes want to select=starting index -------> 7-3=4  (stating index)
	    
    	/*    for(int i=0;i<=3;i++) {
	    	
	    	checkboxes.get(i).click();
	    } 
	     */
	    
	    // Select first 3 chechekbox
       /*    for(int i=4;i<=checboxes.size();i++) {
	    	
	    	checkboxes.get(i).click();
	    }
	    */
	    
	/*    //unselect checkboxes if they vare selected 
           for(int i=0;i<=3;i++) {
	    	
	    	checkboxes.get(i).click();
	    }
	    
           Thread.sleep(50000);
           
           for(int i=4;i<=checboxes.size();i++) {
   	    	
   	    	checkboxes.get(i).click();
   	    }
 	  */
	}
	    
	    
}
