package annotationInTestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgInRealTime {
	 @Test
	  public void test()
	  {
		 Reporter.log("Test case",true); 
	  }
	  @BeforeMethod
	  public void beforeMethod()
	  {
		  Reporter.log("open the browser",true); 
	  }

	  @AfterMethod
	  public void afterMethod()
	  {
		  Reporter.log("after method",true); 
	  }
	  
	  @BeforeClass
	  public void beforeClass()
	  {
		  Reporter.log("Read the data from database",true);
	  }

	  @AfterClass
	  public void afterClass()
	  {
		  Reporter.log("after class",true); 
	  }

	  @BeforeTest
	  public void beforeTest()
	  {
		  Reporter.log("to set the System.setProperty",true); 
	  }

	  @AfterTest
	  public void afterTest() 
	  {
		  Reporter.log("after Test",true); 
	  }

	  @BeforeSuite
	  public void beforeSuite()
	  {
		  Reporter.log("this application is used to monitor the employee activities and also known as employee timesheet tool",true); 
	  }

	  @AfterSuite
	  public void afterSuite()
	  {
		  Reporter.log("after suit",true);
	  }
	  @Test
	  public void createuser()
	  {
		  Reporter.log("data provider",true);
	  }

}
