package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorTagName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("file:///D:/B.Tathe/disabledElement1.html");
		   driver.findElement(By.tagName("input")).sendKeys("bangalibaba",Keys.ENTER);
		   Thread.sleep(3000);

	}

}
