package handlepopup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserNotificationPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		ChromeOptions co = new ChromeOptions();
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.cleartrip.com");//launch the web application
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class]]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='DayPicker-Day'][1]")).click();
		Thread.sleep(4000);
		
       Alert al = driver.switchTo().alert();
      String textpopup =  al.getText();
      System.out.println(textpopup);
      
      al.accept();

	}

}
