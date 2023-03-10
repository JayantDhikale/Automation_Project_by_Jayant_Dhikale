package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	private WebDriver driver;
	
	// 1.WebElements
		
		@FindBy(xpath = "//*[@class='title']")
		private WebElement title;
		
		@FindBy(xpath = "//*[@class='cart_quantity_label']")
		private WebElement QtyLabel;
		
		@FindBy(xpath = "//*[@class='cart_desc_label']")
		private WebElement descLabel;
		
		@FindBy(xpath = "//*[@class='inventory_item_name']")
		private WebElement itemname;
		
		@FindBy(id = "remove-sauce-labs-backpack")
		private WebElement removeBtn;
		
		@FindBy(id = "continue-shopping")
		private WebElement continueSoppingBtn;
		
		@FindBy(css = "#checkout")
		private WebElement checkoutBtn;
		
		// 2.Constructor
		
		public CartPage(WebDriver driver)
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
		
		public boolean isQuantityLabelDisplayed()
		{
			boolean flag = QtyLabel.isDisplayed();
			return flag;
		}
		
		
		public boolean isDescriptionLabelDisplayed()
		{
			boolean flag = descLabel.isDisplayed();
			return flag;
		}
		
		public String isItemNameDisplayed()
		{
			String name = itemname.getText();
			return name;
		}
		
		public boolean isRemoveBtnDisplayed()
		{
			boolean flag = removeBtn.isDisplayed();
			return flag;
		}
		
		public boolean isContinueSoppingBtnDisplayed()
		{
			boolean flag = continueSoppingBtn.isDisplayed();
			return flag;
		}
		
		public boolean isCheckoutBtnDisplayed()
		{
			boolean flag = checkoutBtn.isDisplayed();
			return flag;
		}
		
		public void userClickedOnCheckoutBtn()
		{
			checkoutBtn.click();
		}

		public String nextURLisDisplayed( )
		{
			String url = driver.getCurrentUrl();
			return url;
		}
	
}
