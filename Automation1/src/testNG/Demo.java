package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f()
  {
	  Reporter.log("hii I am from demo class",true);
  }
}
