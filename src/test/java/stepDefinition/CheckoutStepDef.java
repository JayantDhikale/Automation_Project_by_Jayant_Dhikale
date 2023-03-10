package stepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CheckoutPage;

public class CheckoutStepDef {

	WebDriver driver;
	CheckoutPage cs;
	
	@Given("User is on Checkout page")
	public void user_is_on_checkout_page() {
		driver = LoginStepDef.driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		cs = new CheckoutPage(driver);
	}

	@Then("Page title is displyed like {string}")
	public void page_title_is_displyed_like(String title) {
		Assert.assertEquals("Page title is is not Displyed", cs.isTitleDisplayed(), title); 
	}

	@Then("First name field is displayed")
	public void first_name_field_is_displayed() {
		Assert.assertTrue("First name field is not Displyed", cs.isFirstNameFieldDisplayed());
	}

	@Then("Last name field is displayed")
	public void last_name_field_is_displayed() {
		Assert.assertTrue("First name field is not Displyed", cs.isLastNameFieldDisplayed());
	}

	@Then("Postal code field is displayed")
	public void postal_code_field_is_displayed() {
		Assert.assertTrue("Postal code field is not Displyed", cs.isPostalCodeFieldDisplayed());
	}

	@Then("Cancel buttons is displayed")
	public void cancel_buttons_is_displayed() {
		Assert.assertTrue("Cancel buttons is not Displyed", cs.isCancelBtnDisplayed());
	}

	@Then("Continue buttons is displayed")
	public void continue_buttons_is_displayed() {
		Assert.assertTrue("Continue buttons is not Displyed", cs.isContinueBtnDisplayed());
	}

	@When("User entered firstname as {string}")
	public void user_entered_firstname_as(String firstname) {
	 cs.userEnterFirstName(firstname);
	}

	@When("User entered lastname as {string}")
	public void user_entered_lastname_as(String lastname) {
		cs.userEnterLastName(lastname);
	}

	
	@When("User entered postal code as {string}")
	public void user_entered_postal_code_as(String code) {
	cs.userEnterPostalCode(code);
	}

	@When("User clicked on Continue button")
	public void user_clicked_on_continue_button() {
		cs.userClickOnContinueBtn();
	}

	@Then("Checkout step two page is displyed with url {string}")
	public void checkout_step_two_page_is_displyed_with_url(String url) {
		Assert.assertEquals("Checkout step two page is not Displyed", cs.nextURLisDisplayed(), url);
	}
	
}
