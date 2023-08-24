package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class highlightElement {
	
	private  WebDriver driver;
	
	public highlightElement(WebDriver driver) {
		this.driver = driver;
	}
	
public void highlightElementRed(WebElement element) {
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	jsExecutor.executeScript("arguments[0]. setAttribute('style', 'border:2px solid red; background:yellow')", element);
}

}
