package runTimePolymorphism;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	
	static WebDriver driver;
   public static void main(String[] args) throws InterruptedException {
	  
		Scanner sc=new Scanner(System.in);
		System.out.println("Entr the browser name");
		          String browserValue = sc.next();
		          System.out.println(browserValue);
		          
		          if(browserValue.equalsIgnoreCase("Chrome"))
		          {
		        	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		        	   driver=new ChromeDriver();
		        	  driver.get("https://www.flipkart.com");
		        	 Thread.sleep(3000);
		        	  driver.close();
		          }
		          else if(browserValue.equalsIgnoreCase("firefox"));
		          {
		        	  System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		        	   driver=new FirefoxDriver();
		        	  driver.get("https://www.instagram.com");
		        	  Thread.sleep(3000);
		        	  driver.close();
		          }

	}

}
