package keyDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeLogin extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		
		bt.openBrowser();
		Flib flib = new Flib();
		
		String username = flib.readPropertyFile("./data/confige.properties","un");
		String password = flib.readPropertyFile("./data/confige.properties","pwd");
		
		 driver.findElement(By.name("username")).sendKeys(username);
		  driver.findElement(By.name("pwd")).sendKeys(password);
		  driver.findElement(By.id("loginButton")).click();
		  Thread.sleep(4000);
		  bt.closeBrowser();

	}

}