package parallelexes;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class CheckMethodsAreParallelOrNot {
	
	@Test
	public void methodA()
	{
		Reporter.log("Hii,I am Method1  "+Thread.currentThread().getId(),true);
	}
	
	@Test
	public void methodB()
	{
		Reporter.log("hii, I am method2  "+Thread.currentThread().getId(),true);
	}

}
