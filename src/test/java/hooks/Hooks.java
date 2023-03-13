package hooks;
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
		if(!scn.isFailed())
		{
			bc.takeScreenShot(driver, scn);
		}
		
		try
		{
		Thread.sleep(2000);	
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	@AfterAll
	public static void close()
	{
		bc.tearDown(LoginStepDef.driver);
	}
	
}
