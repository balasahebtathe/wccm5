package flagsinTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
  @Test(dependsOnMethods = "login" )
  public void logout()
  {
	  Reporter.log("logout",true);
  }
  @Test(enabled = false )
  public void login()
  {
	  Reporter.log("logout",true);
  }
  
}
