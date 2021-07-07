package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CscSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.google.com");
		   driver.findElement(By.cssSelector("input[name='q']")).sendKeys("admin");
		   Thread.sleep(3000);
		   driver.navigate().to("www.google.com");
		   driver.findElement(By.cssSelector("input[tittle='Search']")).sendKeys("admin123",Keys.ENTER);
		   Thread.sleep(3000);
		   driver.close();

	}

}
