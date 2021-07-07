package WebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   ChromeDriver driver = new ChromeDriver();
		   driver.navigate().to("https://www.google.com");
		 //  Thread.sleep(3000);
		   driver.navigate().to("https://www.instagram.com");
		   Thread.sleep(3000);
		   driver.close();
	}

}
