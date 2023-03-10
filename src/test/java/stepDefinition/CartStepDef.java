package stepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CartPage;

public class CartStepDef {
	
	WebDriver driver;
	CartPage cp;
	
	@Given("User is on Cart page")
	public void user_is_on_cart_page() {
		driver = LoginStepDef.driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 cp = new CartPage(driver);
	}

	@Then("Page title is displyed as  {string}")
	public void page_title_is_displyed_as(String title) {
		Assert.assertEquals("Page titleis not Displyed", cp.isTitleDisplayed(), title );
	}
	
	@Then("Cart quantity label is displayed")
	public void cart_quantity_label_is_displayed() {
		Assert.assertTrue("Cart quantity label is not Displyed", cp.isQuantityLabelDisplayed());
	}

	@Then("Cart description label is displayed")
	public void cart_description_label_is_displayed() {
		Assert.assertTrue("Cart description label is not Displyed", cp.isDescriptionLabelDisplayed());
	}

	@Then("Item name is displayed as {string}")
	public void item_name_is_displayed_as(String title) {
		Assert.assertEquals("Item name is not Displyed", cp.isItemNameDisplayed(), title );

	}

	@Then("Remove buttons is displayed")
	public void remove_buttons_is_displayed() {
		Assert.assertTrue("Remove buttons is not Displyed", cp.isRemoveBtnDisplayed());
	}

	@Then("Continue shopping buttons is displayed")
	public void continue_shopping_buttons_is_displayed() {
		Assert.assertTrue("Continue shopping buttons is not Displyed", cp.isContinueSoppingBtnDisplayed());
	}

	@Then("Checkout buttons is displayed")
	public void checkout_buttons_is_displayed() {
		Assert.assertTrue("Checkout buttons is not Displyed", cp.isCheckoutBtnDisplayed());
	}

	@When("User clicked on Checkout button")
	public void user_clicked_on_checkout_button() {
	    cp.userClickedOnCheckoutBtn();
	}

	@Then("Checkout step one page is displyed with url {string}")
	public void checkout_step_one_page_is_displyed_with_url(String url) {
		Assert.assertEquals("Checkout step one pageis not Displyed", cp.nextURLisDisplayed(), url );
	}

}
