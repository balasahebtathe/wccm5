package combinedDataDrivenAndKeyword;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActiTimeInvalidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setUp();

		Flib flib= new Flib();
		int rc = flib.getRowCount("./data/Testdata.xlsx", "Invalidcredentials");  
		for(int i=0;i<=rc;i++) 
		{   
			String username=flib.readExcel("./data/Testdata.xlsx", "Invalidcredentials", i, 0);
			WebElement username1 = driver.findElement(By.name("username"));
			username1.clear();
			username1.sendKeys(username);
			String password = flib.readExcel("./data/Testdata.xlsx", "Invalidcredentials", i, 1);
			driver.findElement(By.name("pwd")).sendKeys(password);
			Thread.sleep(2000);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
		}
		bt.tearDown();

	}

}
