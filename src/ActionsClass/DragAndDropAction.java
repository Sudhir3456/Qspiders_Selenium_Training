package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) {

      WebDriver driver=new ChromeDriver();
      
      driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drage-drop-3.html");//http://www.dhtmlgoodies.com/scripts/index.html?page=dragDrop
      driver.manage().window().maximize();
      
      Actions act=new Actions(driver);
      
      
      //drag and drop
      WebElement rome=driver.findElement(By.xpath("//div[@id='box6']"));
      WebElement italy=driver.findElement(By.xpath("//div[@id='box106']"));
      
      act.dragAndDrop(rome, italy).perform();

		
	}
	

}
