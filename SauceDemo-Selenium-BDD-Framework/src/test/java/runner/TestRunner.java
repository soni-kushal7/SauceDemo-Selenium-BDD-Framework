package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "src/test/resources/features",
		glue = {"steps","hooks"},
		tags= "@positive or @negative or @single",
		plugin = {
		        "pretty",
		        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		        "html:target/cucumberhtml.html",
		        "json:target/cucumberhtml.json"
		    },
		monochrome = true
		
		)





public class TestRunner extends AbstractTestNGCucumberTests{}
