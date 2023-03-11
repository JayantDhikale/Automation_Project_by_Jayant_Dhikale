package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import baseUtility.BaseClass;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class LoginStepDef extends BaseClass{

	 public static WebDriver driver;
	 public static LoginStepDef lsd;
	 LoginPage lp;
	 Scenario scn;
	@Given("User is on login page url {string}")
	public void user_is_on_login_page_url(String url) {
		
		lsd = new LoginStepDef();
		driver = lsd.getDriver(url);
		lsd.waitTime(driver, 5);
		 lp = new LoginPage(driver);
	}

	@Then("Login logo is displayed")
	public void login_logo_is_displayed() {
	    Assert.assertTrue("Login Logo is not Displyed", lp.isLoginLogoDisplayed());
	}

	@Then("Username field is displayed")
	public void username_field_is_displayed() {
	    Assert.assertTrue("Username field is not Displyed", lp.isUserNameFieldDisplayed());
	}

	@Then("Password field is displyed")
	public void password_field_is_displyed() {
		Assert.assertTrue("Password field is not Displyed", lp.isPasswordFieldDisplayed());
	}

	@Then("Login button is displayed")
	public void login_button_is_displayed() {
		Assert.assertTrue("Login button is not Displyed", lp.isLoginBtnDisplayed());
	}

	@Then("Accceptable usernames are displayed below login button")
	public void accceptable_usernames_are_displayed_below_login_button() {
		Assert.assertTrue("Usernames are not Displyed", lp.isAcceptableUsernamesDisplayed());
	}

	@Then("Accceptable password is displayed below login button")
	public void accceptable_password_is_displayed_below_login_button() {
		Assert.assertTrue("Password is not Displyed", lp.isAcceptablePasswordDisplayed());
	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String username) {
		lp.enterUserNam(username);
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String pass) {
	   lp.enterPassword(pass);
	}

	@When("user clicks on login  button")
	public void user_clicks_on_login_button() {
	    lp.clickOnLoginBtn();
	}

	@Then("Inventory page is displyed with url {string}")
	public void inventory_page_is_displyed_with_url(String inventoryURL) {
	    Assert.assertEquals("Inventory page is not displayed", lp.isInventoryPageDisplayed(), inventoryURL);
	}
	
}
