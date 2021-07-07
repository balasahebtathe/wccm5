package windowhandle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseTheChildBrowserAndKeepParentBrowserAlive {
public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.naukri.com");//launch the web application
		Thread.sleep(4000);
		String parentWindowHandle=driver.getWindowHandle();
		Set<String> allHandles = driver.getWindowHandles();
	//	System.out.println("this is the parent window handle"+parentWindowHandle);
	//	System.out.println("All window Handles"+allHandles);
		for(String wh:allHandles)
		{
			String tittle = driver.switchTo().window(wh).getTitle();
			System.out.println(tittle);
			if(tittle.equals("Genpact"))
			{
				driver.manage().window().maximize();
				Thread.sleep(4000);
				driver.close();
			}
	   }
	}	
}
