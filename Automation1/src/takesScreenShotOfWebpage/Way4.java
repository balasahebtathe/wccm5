package takesScreenShotOfWebpage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Way4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   ChromeDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		  // driver.getScreenShot();//not accessible
		   
		 
		   
		//  File src = driver.getScreenshotAs(OutputType.FILE);
		  // File dest = new File("./screenshots/thirdscreenshot.png");
		   //Files.copy(src, dest);


	}

}
