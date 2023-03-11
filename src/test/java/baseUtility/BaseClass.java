package baseUtility;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import stepDefinition.LoginStepDef;

public class BaseClass {
	
	public WebDriver driver;
	
	public  WebDriver getDriver(String url)
	{
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
			driver.get(url);
			driver.manage().window().maximize();
			return driver;
	}
	
	public void tearDown(WebDriver driver)
	{
		driver.quit();
	}

	public void waitTime(WebDriver driver, int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void takeScreenShot(WebDriver driver, Scenario scn)
	{	
		String scnName =scn.getName();
		
		byte[] sc = ((TakesScreenshot)LoginStepDef.driver).getScreenshotAs(OutputType.BYTES);
		scn.attach(sc, "image/png", scnName);
	}
	
}
