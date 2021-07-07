package dataDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginActiTime  {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("http://desktop-fek46kv/login.do");//launch the web application
		
	     Flip flip= new Flip();
	   int rc = flip.getRowCount("./data/Testdata.xlsx", "Invalidcredentials");   
	   for(int i=0;i<=rc;i++) 
	   {   
	   String username=flip.readexcel("./data/Testdata.xlsx", "Invalidcredentials", i, 0);
	   WebElement username1 = driver.findElement(By.name("username"));
	   username1.clear();
	   username1.sendKeys(username);
	 String password = flip.readexcel("./data/Testdata.xlsx", "Invalidcredentials", i, 1);
	 driver.findElement(By.name("pwd")).sendKeys(password);
	 Thread.sleep(2000);
	 driver.findElement(By.id("loginButton")).click();
     Thread.sleep(2000);
	}
	}

}
