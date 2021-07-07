package takesScreenShotOfWebpage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class EventFiringWebdriverScreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.facebook.com");
		   
		 EventFiringWebDriver ewd=new EventFiringWebDriver(driver);
		 
		   
		  File src = ewd.getScreenshotAs(OutputType.FILE);
		   File dest = new File("./screenshots/thirdscreenshot5.png");
		   Files.copy(src, dest);

	}

}
