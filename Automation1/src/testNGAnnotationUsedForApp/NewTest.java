package testNGAnnotationUsedForApp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	@Test
	 public void loginActiTime() throws InterruptedException
	  {
		 driver.findElement(By.name("username")).sendKeys("admin");
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 driver.findElement(By.id("loginButton")).click();
		 Thread.sleep(3000);
	  }
	@Test
	 public void loginActiTimeInvalid() throws InterruptedException
	  {
		 driver.findElement(By.name("username")).sendKeys("admin");
		 driver.findElement(By.name("pwd")).sendKeys("admin");
		 driver.findElement(By.id("loginButton")).click();
		 Thread.sleep(3000);
	  }
	  @BeforeMethod
	  public void setUp() throws InterruptedException
	  {
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("http://desktop-fek46kv/login.do");
		 Thread.sleep(3000);
	  }
	  

	  @AfterMethod
	  public void afterMethod()
	  {
		  driver.quit(); 
	  }
	  @BeforeTest
	  public void configureTheBrowser()
	  {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  }

	  @AfterTest
	  public void ReportGenerator() 
	  {
		  Reporter.log("the reporter are generated",true); 
	  }
}
