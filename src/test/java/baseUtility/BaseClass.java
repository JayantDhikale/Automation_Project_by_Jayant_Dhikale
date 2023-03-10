package baseUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	
	public  WebDriver getDriver()
	{

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);

			return driver;
	}
	
	public void tearDown(WebDriver driver)
	{
		driver.quit();
	}
	
	
}
