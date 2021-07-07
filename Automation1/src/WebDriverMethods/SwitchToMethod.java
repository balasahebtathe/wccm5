package WebDriverMethods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   ChromeDriver driver = new ChromeDriver();
		   driver.navigate().to("https://www.google.com");
		   driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
		   Thread.sleep(3000);
		   driver.navigate().back();
		  Thread.sleep(3000);
		  driver.navigate().forward();
		  Thread.sleep(3000);
		  driver.navigate().refresh();
		  Thread.sleep(3000);
	}

}
