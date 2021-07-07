package WebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTittleMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   ChromeDriver driver = new ChromeDriver();
		   driver.get("https://www.google.com");
		   Thread.sleep(3000);
		  String tittle = driver.getTitle();
		  System.out.println(tittle);
		  driver.close();
		  


	}

}
