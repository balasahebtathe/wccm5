package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("http://desktop-fek46kv/login.do");//launch the web application
		
		WebElement username = driver.findElement(By.name("username"));
		Thread.sleep(2000);
		//driver.findElement(By.name("pwd")).sendKeys("manager");
	//	Thread.sleep(2000);
		driver.navigate().refresh();
		username.sendKeys("admin");//StaleElementReferenceException
	//	driver.findElement(By.id("loginButton"));
		

	}

}
