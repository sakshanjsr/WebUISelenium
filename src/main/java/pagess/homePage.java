package pagess;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.qameta.allure.Step;
import utils.commonUtils;
import utils.highlightElement;



public class homePage {
	
	public static highlightElement highlightElement;
	public static commonUtils commonUtils;
	WebDriver driver;

	
	public homePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		highlightElement = new highlightElement(driver);
	}

	
	@FindBy (css=".post-title")
	WebElement helloTxt;
	


	
	@Step("User enter the username....")
	public  void checkHelloTxt() {
		highlightElement.highlightElementRed(helloTxt);
		String txt = helloTxt.getText();
		assertEquals(txt, "Helloo");
	}
	

	

}
