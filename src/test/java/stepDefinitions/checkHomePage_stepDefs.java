package stepDefinitions;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import base.baseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagess.homePage;

public class checkHomePage_stepDefs extends baseClass{
	
	private homePage hp;
	private WebDriver driver;
	private Properties props;
	
	public  checkHomePage_stepDefs() throws IOException {
		driver = baseClass.driver;
        props = baseClass.props;
        hp = new homePage(driver);
	}
	

	
	@Given("The user in on the Home Page")
	public void the_user_in_on_the_home_page() {
          driver.get(props.getProperty("homePageUrl"));
	}


	@When("The user validate page hello")
	public void the_user_validate_page_hello() {
		hp.checkHelloTxt();
	}

	@Then("User validate the button text")
	public void user_validate_the_button_text() {
	System.out.println("Button Txt");
	}

}
