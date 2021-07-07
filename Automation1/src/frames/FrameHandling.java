package frames;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");//we avoid IllegalStateException we set the path of driver
		WebDriver driver = new FirefoxDriver();// launch the chrome browser
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("file:///D:/B.Tathe/html/username.html");//launch the web application
		driver.findElement(By.xpath("//input[@id='un']")).sendKeys("admin");
		Thread.sleep(4000);
		driver.switchTo().frame("frid");
		driver.findElement(By.id("pwd")).sendKeys("manager");
	}

}
