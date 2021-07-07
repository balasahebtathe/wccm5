package flagsinTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
	 @Test(priority = 3,dependsOnMethods="login",alwaysRun=true)
	  public void logout()
	  {
		Reporter.log("Logout from the application",true);  
	  }
	  @Test(priority = 2)
	  public void login()
	  {
		  int i=0;
		  int result=9/i;
		  Reporter.log("Login into the application",true);  
	  }
	  @Test(dependsOnMethods = "login",alwaysRun=true)
	  public void createuser()
	  {
		  Reporter.log("create user",true); 
	  }
}
