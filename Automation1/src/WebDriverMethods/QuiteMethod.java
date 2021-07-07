package WebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class QuiteMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   ChromeDriver driver = new ChromeDriver();
		   driver.get("https://www.naukri.com");
		   Thread.sleep(3000);
		   driver.quit();;


	}

}
