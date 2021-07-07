package annotationInTestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotationUpdated {
	@Test
	public void createUser()
	{
		Reporter.log("the user is created",true);
	}
	
	@BeforeMethod
	public void openBrowser()
	{
		Reporter.log("open the browser",true);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		Reporter.log("close the browser",true);
	}
	
	@Test
	public void addEmployee()
	{
		Reporter.log("Add the employee",true);
	}

}
