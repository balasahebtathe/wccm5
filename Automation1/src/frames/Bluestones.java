package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestones {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.bluestone.com/jewellery/rings.html");//launch the web application
		Thread.sleep(3000);
		driver.switchTo().frame("chat-widget");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[@class='lc-6azlmu e16i86ec1']")).click();
	    driver.findElement(By.id("name")).sendKeys("suraj");
	    driver.findElement(By.id("Email")).sendKeys("ankushchothe2020@gmail.com");
	     driver.findElement(By.xpath("//div[@class='lc-moka94 esv0owm0']")).click();
	
	}

}
