package mouseaction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.flipkart.com");//launch the web application
		Thread.sleep(4000);
		
		WebElement target = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		//target.click();
		 //                 WebElement right=driver.findElement(By.xpath("//input[@name='q']"))
		
		Actions act = new Actions(driver);
		act.contextClick(target).perform();
	//driver.quit();

	}

}
