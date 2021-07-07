package parallelexes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MethodsParallely {
	public class MethodsParallelly {
		WebDriver driver;

		@Test
		public void methodA()

		{

			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("http://www.google.com");
			driver.switchTo().activeElement().sendKeys("what is TestNG");

		}

		@Test
		public void methodB()
		{

			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("http://www.google.com");
			driver.switchTo().activeElement().sendKeys("pune");
		}
	}
}
