package handlepopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeysPopup {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.tutorialsteacher.com/codeeditor?cid=js-3");//launch the web application
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button")).click();;
		Thread.sleep(4000);
		
       Alert al = driver.switchTo().alert();
      Robot rt = new Robot();
      rt.keyPress(KeyEvent.VK_BACK_SPACE);
      rt.keyRelease(KeyEvent.VK_BACK_SPACE);
      al.sendKeys("52");
      al.accept();
     
      Thread.sleep(4000);
      driver.close();


	}

}
