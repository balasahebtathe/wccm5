package uploadPopup;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Upload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("http://desktop-fek46kv/administration/customization.do");//launch the web application
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("manager",Keys.ENTER);
		driver.findElement(By.xpath("//img[@src=\"/img/default/pixel.gif?hash=1692528820\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class=\"item active\"]")).click();
		Thread.sleep(2000);
		WebElement target=driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		Thread.sleep(4000);
		target.click();
        
		//Actions act = new Actions(driver);
	//	act.doubleClick(target).build();
		//File ff=new File("")

	}

}
