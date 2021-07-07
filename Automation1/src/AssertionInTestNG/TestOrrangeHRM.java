package AssertionInTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestOrrangeHRM {
@Test
public void testOrrangehrm() throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe")	;
ChromeDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("https://opensource-demo.orangehrmlive.com/");

String loginPageTitle = driver.getTitle();
SoftAssert softasert = new SoftAssert();
softasert.assertEquals(loginPageTitle, "OrangeHRM");//soft assert

WebElement usn = driver.findElement(By.name("txtUsername"));
boolean statusOfUsername = usn.isDisplayed();

Assert.assertEquals(statusOfUsername, true);//hard assert

WebElement password = driver.findElement(By.name("txtPassword"));
boolean statusOfPassword = password.isDisplayed();

Assert.assertEquals(statusOfPassword, true);//hard assert

WebElement logbutton = driver.findElement(By.id("btnLogin"));
boolean statusOflog = logbutton.isDisplayed();

Assert.assertEquals(statusOflog, true);//hard assert

usn.sendKeys("admin");
password.sendKeys("admin123");
logbutton.click();

Thread.sleep(3000);

String homePageTitle = driver.getTitle();
softasert.assertEquals(homePageTitle, "OrangeHRMHomePage");//soft assert

Reporter.log("create the user",true);
Reporter.log("create setting",true);

driver.findElement(By.id("welcome")).click();
driver.findElement(By.xpath("//a[.='Logout']")).click();

softasert.assertAll();//we use soft assert
}
}
