package flagsinTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
  @Test(description = "hi this method is used to login to the application")
  public void login() 
  {
 Reporter.log("login to the application",true);
  }
  
  @Test(description = "this method is used to logout to the application")
  public void logout()
  {
	Reporter.log("Logout to the application",true);  
  }
 
}
