package uploadPopup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PopupForHrm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		//ChromeOptions co = new ChromeOptions();
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://opensource-demo.orangehrmlive.com/");//launch the web application
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys("admin");
	
		driver.findElement(By.xpath("//input[@name=\"txtPassword\"]")).sendKeys("admin123",Keys.ENTER);
	
		driver.findElement(By.xpath("//b[.='PIM']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
		
	
	
		driver.findElement(By.name("firstName")).sendKeys("bala");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Tathe");
		WebElement target = driver.findElement(By.name("photofile"));
		new Actions(driver).doubleClick(target).perform();

	}

}
