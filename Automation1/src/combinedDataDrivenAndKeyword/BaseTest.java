package combinedDataDrivenAndKeyword;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib {
	static WebDriver driver;
	
	public void setUp() throws IOException
	{
		Flib flib = new Flib();
		String baseurl = flib.readPropertyData("./data/confige.properties", "url");
		String browserValue = flib.readPropertyData("./data/confige.properties", "browser");
		
		if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(baseurl);
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(baseurl);
		}
		
		else
		{
			System.out.println("invalid input");
		}

	}
	public void tearDown()
	{
		driver.close();
	}
		
}

