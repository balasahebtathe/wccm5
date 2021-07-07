package dataParameterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ActiTimeLogin {
	WebDriver driver;
	@Parameters({"username","password","browser"})
	@Test
	public void loginActiTime(String browserValue, String usn, String password)
	{
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("http://desktop-fek46kv/login.do");
			driver.findElement(By.name("username")).sendKeys(usn);
			driver.findElement(By.name("pwd")).sendKeys(usn);
			driver.findElement(By.name("username")).sendKeys(password);
			driver.findElement(By.name("username")).sendKeys(usn);
			 driver.findElement(By.id("loginButton")).click();
			
		}
		
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("http://desktop-fek46kv/login.do");
			driver.findElement(By.name("username")).sendKeys(usn);
			driver.findElement(By.name("pwd")).sendKeys(usn);
			driver.findElement(By.name("username")).sendKeys(password);
			driver.findElement(By.name("username")).sendKeys(usn);
			 driver.findElement(By.id("loginButton")).click();
		}
		
		else
		{
			Reporter.log("invalid input",true);
		}
	}

}
