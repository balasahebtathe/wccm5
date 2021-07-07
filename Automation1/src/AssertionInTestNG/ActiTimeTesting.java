package AssertionInTestNG;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ActiTimeTesting {
	
	@Test
	public void testactiTime()
	{
		Reporter.log("launch the browser",true);
		Reporter.log("open the browser application",true);
		Reporter.log("verify login page tittle",true);
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(false, true);
		Reporter.log("if user name text box is enable then send username",true);
		Reporter.log("if password text box is enabled then send password ",true);
		
		
		Reporter.log("click on login button if it is enabled",true);
		
		softassert.assertEquals(false, true);
		Reporter.log("verify the homepage tittle",true);
		
		Reporter.log("create the new user",true);
		Reporter.log("configure the setting",true);
		
		Reporter.log("logout",true);
		
		softassert.assertAll();
	}

}
