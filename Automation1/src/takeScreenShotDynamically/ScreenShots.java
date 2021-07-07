package takeScreenShotDynamically;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenShots extends Base {
	@BeforeMethod
	public void setUp()
	{
		initialization();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	@Test
	public void verifyTitle()
	{
		String loginPageTitle = driver.getTitle();
		Assert.assertEquals(loginPageTitle,"actiTIME - Login");
	}

}
