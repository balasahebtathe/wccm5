package JavaScriptExecuter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import scrollingwithjse.JavascriptExecuter;

public class HandleDisableElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   driver.get("file:///D:/B.Tathe/disabledElement1.html");
		   driver.findElement(By.id("i1")).sendKeys("Balasaheb");
		  // driver.findElement(By.id("i2")).sendKeys("password");
		   
		          JavascriptExecutor jse = (JavascriptExecutor)driver;
		          jse.executeScript("document.getElementById('i2').value='Tathe'");
		          Thread.sleep(3000);

	}

}
