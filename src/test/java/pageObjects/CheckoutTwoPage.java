package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutTwoPage {
	
private WebDriver driver;

//1.WebElements

		@FindBy(xpath = "//*[@class='title']")
		private WebElement title;
		
		@FindBy(xpath = "//*[@class='cart_quantity_label']")
		private WebElement QtyLabel;
		
		@FindBy(xpath = "//*[@class='cart_desc_label']")
		private WebElement descLabel;
		
		@FindBy(xpath = "//*[@class='inventory_item_name']")
		private WebElement itemname;
		
		@FindBy(xpath = "//*[@class='inventory_item_desc']")
		private WebElement itemDesc;
		
		@FindBy(xpath = "//*[text()='Payment Information']")
		private WebElement paymentInfo;
		
		@FindBy(xpath = "//*[text()='Shipping Information']")
		private WebElement shippingInfo;
		
		@FindBy(xpath = "//*[text()='Price Total']")
		private WebElement totalPrice;
		
		@FindBy(xpath = "//*[@class='summary_info_label summary_total_label']")
		private WebElement price;
		
		@FindBy(css = "#cancel")
		private WebElement cancelBtn;
		
		@FindBy(id = "finish")
		private WebElement finishBtn;
		
		// 2.Constructor
		
		public CheckoutTwoPage(WebDriver driver)
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
		
		public boolean isItemNameDisplayed()
		{
			boolean name = itemname.isDisplayed();
			return name;
		}
		
		public boolean isItemDescriptionDisplayed()
		{
			boolean flag = itemDesc.isDisplayed();
			return flag;
		}
		
		public boolean isPaymentInfoDisplayed()
		{
			boolean flag = paymentInfo.isDisplayed();
			return flag;
		}
		
		public boolean isShippingInfoDisplayed()
		{
			boolean flag = shippingInfo.isDisplayed();
			return flag;
		}
		
		public boolean isPriceAndTaxDisplayed()
		{
			boolean flag = totalPrice.isDisplayed();
			return flag;
		}
		
		public boolean isTotalPriceDisplayed()
		{
			boolean flag = price.isDisplayed();
			return flag;
		}
		
		public boolean isCancelBtnDisplayed()
		{
			boolean flag = cancelBtn.isDisplayed();
			return flag;
		}
		
		public boolean isFinishBtnDisplayed()
		{
			boolean flag = finishBtn.isDisplayed();
			return flag;
		}
		
		public void userClickOnFinishBtn()
		{
			finishBtn.click();
		}
		
		public String nextURLisDisplayed( )
		{
			String url = driver.getCurrentUrl();
			return url;
		}
}