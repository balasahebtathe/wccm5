package mouseaction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("file:///C:/Users/ANKUSH/AppData/Local/Temp/non2AA9.htm");//launch the web application
		Thread.sleep(4000);
		
		WebElement srctarget= driver.findElement(By.id("draggable-2"));
		WebElement desttarget= driver.findElement(By.id("droppable-2"));
		
	    Actions act = new Actions(driver);
	    act.dragAndDrop(srctarget, desttarget).perform();
	    Thread.sleep(2000);
	    
	    String text = driver.findElement(By.xpath("//p[.='Dropped!']")).getText();
	    if(text.equalsIgnoreCase("Dropped!"))
	    {
	    	System.out.println("the element is dragged and dropped");
	    }
	    


	}

}
