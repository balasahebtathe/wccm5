package keyDrivenFramework;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class KeyValidActiTimeLogin {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		
		Flib flib=new Flib();
	   String url = flib.readPropertyFile("./data/confige.properties","url");
       driver.get(url);
       
  String username = flib.readPropertyFile("./data/confige.properties", "un");
  String password = flib.readPropertyFile("./data/confige.properties", "pwd");
  Thread.sleep(2000);
  driver.findElement(By.name("username")).sendKeys(username);
  driver.findElement(By.name("pwd")).sendKeys(password);
  driver.findElement(By.id("loginButton")).click();
	}

}

