package pagess;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.qameta.allure.Step;
import utils.commonUtils;
import utils.highlightElement;


public class login_Page {
	
	WebDriver driver;
	public static highlightElement highlightElement;
	public static commonUtils commonUtils;
	String x;
	
	public login_Page(WebDriver driverr) {
		this.driver = driverr;
		PageFactory.initElements(driver, this);
		highlightElement = new highlightElement(driver);
	}
	

	
	@FindBy (css = "#username")
	WebElement username;
	
	@FindBy (css = "#password")
	WebElement password;
	
	@FindBy (css = "#submit")
	WebElement submitButton;
	

	
	@Step("User enter the username....")
	public void enterUsername(String user) {
		highlightElement.highlightElementRed(username);
		username.sendKeys(user);
	}
	
	@Step("User enter the password....")
	public void enterPassword(String pass) {
		highlightElement.highlightElementRed(password);
		password.sendKeys(pass);
	}
	
	@Step("User click on the Submit button....")
	public void clickSublitButton() {
		highlightElement.highlightElementRed(submitButton);
		submitButton.click();
	}
	

}
