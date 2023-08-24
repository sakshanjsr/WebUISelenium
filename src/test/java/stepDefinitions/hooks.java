package stepDefinitions;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import base.baseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;



public class hooks extends baseClass{
	
	
	private static WebDriver driver;
	

	@Before
	public void initializeTest(Scenario scenario) throws IOException {
		System.out.println("Current Scenario : "+scenario.getName());
		driver = baseClass.initializeDriver();
	}
	
	
	
	@After
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) { 
			byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			Allure.addAttachment("Failed Screenshot", new ByteArrayInputStream(screenshot));
		}
		driver.close();
	}

}
