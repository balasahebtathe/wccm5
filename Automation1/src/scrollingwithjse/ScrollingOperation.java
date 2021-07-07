package scrollingwithjse;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingOperation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,4500)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-4500)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(20,0)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-10)");

		
		
		

	}

}
