package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

private WebDriver driver;
	
	// 1.WebElements
		
		@FindBy(xpath = "//*[@class='title']")
		private WebElement title;
		
		@FindBy(id = "first-name")
		private WebElement fname;
		
		@FindBy(id = "last-name")
		private WebElement lname;
		
		@FindBy(id = "postal-code")
		private WebElement code;
		
		@FindBy(css = "#cancel")
		private WebElement cancelBtn;
		
		@FindBy(id = "continue")
		private WebElement continueBtn;
		
		// 2.Constructor
		
		public CheckoutPage(WebDriver driver)
		{
			//PageFactory.initElements(driver, LoginPage.class);
			//  OR
			PageFactory.initElements(driver, this);
			this.driver = driver;
		}
		
		// 3.Page Action Methods
		
		public String isTitleDisplayed()
		{
			String ttl = title.getText();
			return ttl;
		}
		
		public boolean isFirstNameFieldDisplayed()
		{
			boolean flag = fname.isDisplayed();
			return flag;
		}
		
		
		public boolean isLastNameFieldDisplayed()
		{
			boolean flag = lname.isDisplayed();
			return flag;
		}
		
		public boolean isPostalCodeFieldDisplayed()
		{
			boolean flag = code.isDisplayed();
			return flag;
		}
		
		public boolean isCancelBtnDisplayed()
		{
			boolean flag = cancelBtn.isDisplayed();
			return flag;
		}
		
		public boolean isContinueBtnDisplayed()
		{
			boolean flag = continueBtn.isDisplayed();
			return flag;
		}
		
		public void userEnterFirstName(String firstname)
		{
			fname.sendKeys(firstname);
		}
		
		public void userEnterLastName(String lastname)
		{
			lname.sendKeys(lastname);
		}
		
		public void userEnterPostalCode(String Code)
		{
			code.sendKeys(Code);
		}
		
		public void userClickOnContinueBtn()
		{
			continueBtn.click();
		}
		
		public String nextURLisDisplayed( )
		{
			String url = driver.getCurrentUrl();
			return url;
		}
	
}
