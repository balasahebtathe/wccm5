package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://opensource-demo.orangehrmlive.com/");
		   driver.findElement(By.name("txtUsername")).sendKeys("admin");
		   Thread.sleep(3000);
		   driver.findElement(By.name("txtPassword")).sendKeys("admin123",Keys.ENTER);
		   Thread.sleep(3000);


	}

}
