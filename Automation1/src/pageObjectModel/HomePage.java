package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

		@FindBy(xpath="//div[text()='Setting']") private WebElement settings;

		
		
		public HomePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}



		public WebElement getSettings()
		{
			return settings;
		}
		
		
		//action performing method
		
		public void clicksettings()
		{
			settings.click();
		}
		
	
}