package combinedDataDrivenAndKeyword;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeValidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
        bt.setUp();
        
        Flib flib = new Flib();
       String username = flib.readPropertyData("./data/confige.properties", "un");
        
       driver.findElement(By.name("username")).sendKeys(username); 
       Thread.sleep(1000);
       
       String password = flib.readPropertyData("./data/confige.properties", "pwd");
       
       driver.findElement(By.name("pwd")).sendKeys(password); 
       Thread.sleep(1000);
       
       driver.findElement(By.id("loginButton")).click();
       Thread.sleep(2000);
       
       bt.tearDown();
       
	}

}
