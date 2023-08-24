package runner;

import org.testng.annotations.Test;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@Test
@CucumberOptions(
		features = "src\\test\\resources\\features",
		glue = "stepDefinitions",
		plugin = {"pretty" , "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
		monochrome = true
	)



public class TestRunner extends AbstractTestNGCucumberTests{

}
