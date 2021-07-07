package annotationInTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TstNGAnnotations {
  @Test
  public void test()
  {
	 Reporter.log("Test case",true); 
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  Reporter.log("before method",true); 
  }

  @AfterMethod
  public void afterMethod()
  {
	  Reporter.log("after method",true); 
  }
  
  @BeforeClass
  public void beforeClass()
  {
	  Reporter.log("before class",true);
  }

  @AfterClass
  public void afterClass()
  {
	  Reporter.log("after class",true); 
  }

  @BeforeTest
  public void beforeTest()
  {
	  Reporter.log("before test",true); 
  }

  @AfterTest
  public void afterTest() 
  {
	  Reporter.log("after Test",true); 
  }

  @BeforeSuite
  public void beforeSuite()
  {
	  Reporter.log("before suit",true); 
  }

  @AfterSuite
  public void afterSuite()
  {
	  Reporter.log("after suit",true);
  }
  @Test
  public void data()
  {
	  Reporter.log("data provider",true);
  }

}
