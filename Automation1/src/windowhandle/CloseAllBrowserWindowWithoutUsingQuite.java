package windowhandle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllBrowserWindowWithoutUsingQuite {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.naukri.com");//launch the web application
		Thread.sleep(4000);
		String parentWindowHandle=driver.getWindowHandle();
		Set<String> allHandles = driver.getWindowHandles();
		System.out.println("this is the parent window handle"+parentWindowHandle);
		System.out.println("All window Handles"+allHandles);
		
		for(String wh:allHandles)
		{
			driver.switchTo().window(wh);
			driver.close();
			Thread.sleep(20000);
		}
			
			

	}

}
