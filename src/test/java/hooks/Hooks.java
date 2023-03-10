package hooks;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import baseUtility.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import stepDefinition.LoginStepDef;

public class Hooks extends BaseClass {

	Scenario scn;
	static BaseClass bc = new BaseClass();
	@Before
	public void beforeScenario(Scenario scenario)
	{
	    this.scn = scenario;
	}
	
	
	@After
	public void afterScenario()
	{
		String scnName =scn.getName();
		
		if(scn.isFailed())
		{
		byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scn.attach(screenshot, "image/png", scnName);
		}
	}
	
	@AfterAll
	public static void close()
	{
		bc.tearDown(LoginStepDef.driver);
	}
	
}
