package browserSizeOperation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeOfBrowserWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   ChromeDriver driver = new ChromeDriver();
		   driver.get("https://www.google.com");
		   
		   Dimension dimensions = new Dimension(500,100);
		   driver.manage().window().setSize(dimensions);
		   Thread.sleep(3000);
	}

}
