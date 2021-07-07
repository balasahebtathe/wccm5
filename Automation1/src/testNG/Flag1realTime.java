package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1realTime {
  @Test(priority = 3)
  public void logout()
  {
	Reporter.log("Logout from the application",true);  
  }
  @Test(priority = 2)
  public void login()
  {
	  Reporter.log("Login into the application",true);  
  }
  @Test(priority = 1)
  public void createuser()
  {
	  Reporter.log("create user",true);  
  }
}
