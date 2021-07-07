package flagsinTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
  @Test(invocationCount = 1000)
  public void inconsistantBug()
  {
	  Reporter.log("hii",true);
  }
}
