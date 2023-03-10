package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;
	
	// 1.WebElements
	@FindBy(id = "user-name")
	private WebElement userNameField;
	
	@FindBy(id = "password")
	private WebElement passNameField;
	
	@FindBy(id = "login-button")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//div[@class='login_logo']" )
	private WebElement loginLogo;
	
	@FindBy(xpath = "//*[@id='login_credentials']")
	private WebElement acceptableUsers;
	
	@FindBy(xpath = "//*[@class='login_password']")
	private WebElement acceptablePswrd;
	
	
	// 2.Constructor
	
	public LoginPage(WebDriver driver)
	{
		//PageFactory.initElements(driver, LoginPage.class);
		//  OR
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	// 3.Page Action Methods
	
	public boolean isLoginLogoDisplayed()
	{
		boolean flag = loginLogo.isDisplayed();
		return flag;
	}
	
	public boolean isUserNameFieldDisplayed()
	{
		boolean flag = userNameField.isDisplayed();
		return flag;
	}
	
	public boolean isPasswordFieldDisplayed()
	{
		boolean flag = passNameField.isDisplayed();
		return flag;
	}
	
	public boolean isLoginBtnDisplayed()
	{
		boolean flag = loginBtn.isDisplayed();
		return flag;
	}
	
	public boolean isAcceptableUsernamesDisplayed()
	{
		boolean flag = acceptableUsers.isDisplayed();
		return flag;
	}

	public boolean isAcceptablePasswordDisplayed()
	{
		boolean flag = acceptablePswrd.isDisplayed();
		return flag;
	}
	
	public void enterUserNam(String user)
	{
		userNameField.sendKeys(user);
	}
	
	public void enterPassword(String pass)
	{
		passNameField.sendKeys(pass);
	}
	
	public void clickOnLoginBtn()
	{
		loginBtn.click();
	}
	
	public String isInventoryPageDisplayed()
	{
		String url = driver.getCurrentUrl();
		return url;
	}
	
}
