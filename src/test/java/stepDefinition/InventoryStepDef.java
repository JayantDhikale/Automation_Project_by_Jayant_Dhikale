package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.InventoryPage;

public class InventoryStepDef {

	WebDriver driver;
	InventoryPage ip;
	
	@Given("User is on Inventory page")
	public void user_is_on_inventory_page() {
		
		driver = LoginStepDef.driver;
		LoginStepDef.lsd.waitTime(driver, 5);
		ip = new InventoryPage(driver);
	}
	
	@Then("App logo is displayed")
	public void app_logo_is_displayed() {
		Assert.assertTrue("App Logo is not Displyed", ip.isAppLogoDisplayed());
	}

	@Then("Options Menu is displayed")
	public void options_menu_is_displayed() {
		Assert.assertTrue("Options Menu is not Displyed", ip.isMenuBtnDisplayed());
	}

	@Then("Cart button is displayed")
	public void cart_button_is_displayed() {
		Assert.assertTrue("Cart button is not Displyed", ip.isCartBtnDisplayed());

	}

	@Then("Product sorting button is displyed")
	public void product_sorting_button_is_displyed() {
		Assert.assertTrue("Product sorting button is not Displyed", ip.isSortButtonDisplayed());
	}

	@Then("Page title is displyed as like {string}")
	public void page_title_is_displyed_as(String title) {
		Assert.assertEquals("Page titleis not Displyed", ip.isTitleDisplayed(), title );
	}

	@Then("All inventory products are displayed")
	public void all_inventory_products_are_displayed() {
		Assert.assertTrue("All inventory products are not Displyed", ip.isInventoryItemsDisplayed());
	}

	@Then("Add to cart buttons are displayed")
	public void add_to_cart_buttons_are_displayed() {
		Assert.assertTrue("Add to cart buttons are not Displyed", ip.isAddToCartBtnDisplayed());
	}

	@Then("Social media handles are displayed on footers left hand side")
	public void social_media_handles_are_displayed_on_footers_left_hand_side() {
		Assert.assertTrue("Social media handles areare not Displyed", ip.isSocialMediaHandlesDisplayed());
	}

	@When("User choosed a product and clicked on add to cart button")
	public void user_choosed_a_product_and_clicked_on_add_to_cart_button() {
	   ip.userClickedOnAddToCartBtn();
	}

	@When("user clicks on Cart  button")
	public void user_clicks_on_cart_button() {
	    ip.userClickedOnCartBtn();
	}

	@Then("Cart page is displyed with url {string}")
	public void cart_page_is_displyed_with_url(String url) {
		Assert.assertEquals("Cart page is not Displyed", ip.nextURLisDisplayed(), url);
	}
	
}
