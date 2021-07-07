package takesScreenShotOfWebpage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Way5 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   ChromeDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.instagram.com");
		   Thread.sleep(2000);
		   
		 RemoteWebDriver rwd = (RemoteWebDriver)driver;//downcasting
		   
		  File src = rwd.getScreenshotAs(OutputType.FILE);
		   File dest = new File("./screenshots/thirdscreenshot4.png");
		   Files.copy(src, dest);

	}

}
