package takesScreenShotOfWebpage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Way2 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   RemoteWebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.craftsvilla.com");
		   
		 
		   
		  File src = driver.getScreenshotAs(OutputType.FILE);
		   File dest = new File("./screenshots/firstscreenshot2.png");
		   Files.copy(src, dest);


	}

}
