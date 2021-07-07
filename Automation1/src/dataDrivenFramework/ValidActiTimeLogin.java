package dataDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidActiTimeLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("http://desktop-fek46kv/login.do");//launch the web application
	     Flip r = new Flip();
	    String username = r.readexcel("./data/Textdata.xlsx", "ValidCredentials", 1, 0);
	     String password = r.readexcel("./data/Textdata.xlsx", "ValidCredentials", 1, 1);
		
    driver.findElement(By.name("username")).sendKeys(username);
    driver.findElement(By.name("pwd")).sendKeys(password);
    Thread.sleep(2000);
    driver.findElement(By.id("loginButton")).click();
    Thread.sleep(2000);
    
    WebDriverWait wb=new WebDriverWait(driver,30);
    wb.until(ExpectedConditions.titleContains("Enter"));
    
    r.writeExcel("./data/Textdata.xlsx", "ValidCredentials", 1, 2, "pass");
	}

}
