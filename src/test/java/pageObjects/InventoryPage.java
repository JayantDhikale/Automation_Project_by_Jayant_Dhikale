package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {

private WebDriver driver;
	
	// 1.WebElements
	@FindBy(xpath = "//*[@class='app_logo']")
	private WebElement appLogo;
	
	@FindBy(id = "react-burger-menu-btn")
	private WebElement menuBtn;
	
	@FindBy(xpath = "//*[@class='title']")
	private WebElement title;
	
	@FindBy(xpath = "//*[@class='product_sort_container']" )
	private WebElement sortBtn;
	
	@FindBy(xpath = "//*[@class='shopping_cart_link']")
	private WebElement cartBtn;
	
	@FindBy(xpath = "//*[@class='inventory_item']")
	private List<WebElement> inventoryItems;
	
	@FindBy(xpath = "//*[@class='btn btn_primary btn_small btn_inventory']")
	private WebElement addToCartBtn;
	
	@FindBy(xpath = "//*[@class='social']")
	private WebElement socialmediaHandles;
	
	
	// 2.Constructor
	
	public InventoryPage(WebDriver driver)
	{
		//PageFactory.initElements(driver, LoginPage.class);
		//  OR
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	// 3.Page Action Methods
	
	public boolean isAppLogoDisplayed()
	{
		boolean flag = appLogo.isDisplayed();
		return flag;
	}
	public boolean isMenuBtnDisplayed()
	{
		boolean flag = menuBtn.isDisplayed();
		return flag;
	}
	
	public String isTitleDisplayed()
	{
		String ttl = title.getText();
		return ttl;
	}
	
	public boolean isSortButtonDisplayed()
	{
		boolean flag = sortBtn.isDisplayed();
		return flag;
	}
	
	
	public boolean isCartBtnDisplayed()
	{
		boolean flag = cartBtn.isDisplayed();
		return flag;
	}
	
	public boolean isInventoryItemsDisplayed()
	{
		int size = inventoryItems.size();
		if (size == 6)
			return true;
		else
			return false;
		
	}
	
	public boolean isAddToCartBtnDisplayed()
	{
		boolean flag = addToCartBtn.isDisplayed();
		return flag;
	}
	
	public boolean isSocialMediaHandlesDisplayed()
	{
		boolean flag = socialmediaHandles.isDisplayed();
		return flag;
	}
	public void userClickedOnAddToCartBtn()
	{
		addToCartBtn.click();
	}
	
	public void userClickedOnCartBtn()
	{
		cartBtn.click();
	}
	
	public String nextURLisDisplayed( )
	{
		String url = driver.getCurrentUrl();
		return url;
	}
	
}
