package flagsinTestNG;

import org.apache.log4j.Priority;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
  @Test(priority = 3)
  public void a() 
  {
	Reporter.log("method a",true);  
  }
  @Test(priority = 2)
  public void b()
  {
	  Reporter.log("method d",true); 
  }
  @Test()
  public void c()
  {
	  Reporter.log("method c",true);  
  }
  @Test(priority = 0)
  public void d()
  {
	  Reporter.log("method b",true);  
  }
  @Test
  public void e()
  {
	  Reporter.log("method f",true);
  }
  @Test(priority = 50)
  public void f()
  {
	  Reporter.log("method e7",true);  
  }
}
