package pageObjectModel;

import java.io.IOException;

public class TestActiTimeInvalid extends BaseTest {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		LoginPage lp = new LoginPage(driver);
		
		Flib flib = new Flib();
		int rc = flib.getRowCount(EXCEL_PATH,"invalidCredentials");
		for(int i=1;i<=rc;i++)
		{
			lp.clearUsername();
			String username = flib.readExcel(EXCEL_PATH,"invalidCredentials", i,0);
			String password = flib.readExcel(EXCEL_PATH,"invalidCredentials", i,1);
			Thread.sleep(2000);
			
			lp.invalidLoginMethod(username, password);
			
						
		}
		
		
	}

}