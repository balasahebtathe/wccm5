package takesScreenShotOfWebpage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakesScreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   ChromeDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.craftsvilla.com");
		   
		 
		   
		  File src = driver.getScreenshotAs(OutputType.FILE);
		   File dest = new File("./screenshots/thirdscreenshot.png");
		   Files.copy(src, dest);

	}

}
