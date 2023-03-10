package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

   features = "src/test/java/features",
   glue = {"stepDefinition", "hooks"},
   //tags = "",
   dryRun= false ,
   monochrome= true ,
   plugin= {"html:Reports/cucumber-html-report", 
			"json:Reports/cucumber-json-report.json",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
   }
   )


public class TestRunner 
	{

	}
