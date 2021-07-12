package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declaration
		@FindBy(name="username") private WebElement usn;
		@FindBy(name="pwd") private WebElement psw;
		@FindBy(id="loginButton") private WebElement loginBtn;
		@FindBy(id="forgotpass") private WebElement forgotpas;
		
		//initialization
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		
		

		//utilization
		public WebElement getUsn() {
			return usn;
		}
		public WebElement getPsw() {
			return psw;
		}
		public WebElement getLogonBtn() {
			return loginBtn;
		}
		
		public WebElement getForgotpas() {
			return forgotpas;
		}

		
		//generic reusable method
		public void validLogin(String username,String password)
		{
			usn.sendKeys(username);
			psw.sendKeys(password);
			loginBtn.click();
			
		}
		
		//action performing method
		public void clickOnForgotpass()
		{
			forgotpas.click();
		}
		
		public void invalidLoginMethod(String username,String password)
		{
			usn.sendKeys(username);
			psw.sendKeys(password);
			loginBtn.click();
			
		}
		
		
		
		public void setUsername(String username)
		{
			usn.sendKeys(username);
		}
		
		public void setPassword(String password)
		{
			psw.sendKeys(password);
		}
		
		public void clickOnLoginBtn()
		{
			loginBtn.click();
		}
		
		public void clearUsername()
		{
			usn.clear();
		}
		
		
	}