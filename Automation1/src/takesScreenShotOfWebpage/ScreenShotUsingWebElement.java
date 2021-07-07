package takesScreenShotOfWebpage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotUsingWebElement {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   ChromeDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.google.com");
		   WebElement target = driver.findElement(By.xpath("//img[@class=\"lnXdpd\"]"));
		   Thread.sleep(3000);
		   File src = target.getScreenshotAs(OutputType.FILE);
		   File dest = new File("./screenshots/scrofWebElement.png");
		   Files.copy(src, dest);

	}

}
