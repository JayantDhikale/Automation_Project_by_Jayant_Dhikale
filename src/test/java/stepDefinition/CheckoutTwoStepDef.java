package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CheckoutTwoPage;

public class CheckoutTwoStepDef {

	public WebDriver driver;
	CheckoutTwoPage ct;
	
	@Given("User is on Checkout step two page")
	public void user_is_on_checkout_step_two_page() {
	    
		driver = LoginStepDef.driver;
		LoginStepDef.lsd.waitTime(driver, 5);
		ct = new CheckoutTwoPage(driver);
	}
	
	@Then("Page title is displyed {string}")
	public void page_title_is_displyed_like(String title) {
		Assert.assertEquals("Page title is is not Displyed", ct.isTitleDisplayed(), title); 
	}
	
	@Then("Cart quantity label is displayed on screen")
	public void cart_quantity_label_is_displayed() {
		Assert.assertTrue("Cart quantity label is not Displyed", ct.isQuantityLabelDisplayed());
	}

	@Then("Cart description label is displayed on screen")
	public void cart_description_label_is_displayed() {
		Assert.assertTrue("Cart description label is not Displyed", ct.isDescriptionLabelDisplayed());
	}

	@Then("Product name is displayed")
	public void product_name_is_displayed_as() {
		Assert.assertTrue("Product name is not Displyed", ct.isItemNameDisplayed() );
	}

	@Then("Product description is displayed")
	public void product_description_is_displayed() {
		Assert.assertTrue("Product description is not Displyed", ct.isItemDescriptionDisplayed());

	}

	@Then("Payment information is displyed")
	public void payment_information_is_displyed() {
		Assert.assertTrue("Payment information is not Displyed", ct.isPaymentInfoDisplayed());

	}

	@Then("Shipping information is displayed")
	public void shipping_information_is_displayed() {
		Assert.assertTrue("Shipping information is not Displyed", ct.isShippingInfoDisplayed());

	}

	@Then("Price is displyed along with item price and tax")
	public void price_is_displyed_along_with_item_price_and_tax() {
		Assert.assertTrue("item price and tax information is not Displyed", ct.isPriceAndTaxDisplayed());
	}

	@Then("Total price to be paid is displyed")
	public void total_price_to_be_paid_is_displyed() {
		Assert.assertTrue("Total price to be paid is not Displyed", ct.isTotalPriceDisplayed());
	}

	@Then("Cancel  buttons is displayed")
	public void cancel_buttons_is_displayed() {
		Assert.assertTrue("Cancel buttons is not Displyed", ct.isCancelBtnDisplayed());
	}
	
	@Then("Finish buttons is displayed")
	public void finish_buttons_is_displayed() {
		Assert.assertTrue("Finish buttons is not Displyed", ct.isFinishBtnDisplayed());
	}
	
	@When("User clicked on finish button")
	public void user_clicked_on_finish_button() {
		ct.userClickOnFinishBtn();
	}

	@Then("Checkout-complete page is displyed with url {string}")
	public void checkout_complete_page_is_displyed_with_url(String url) {
		Assert.assertEquals("Checkout-complete page  is not Displyed", ct.nextURLisDisplayed(), url); 
	}
	
}
