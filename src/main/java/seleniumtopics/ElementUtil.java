package seleniumtopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;

	}

	public WebElement getElement(By Locator) {
		return driver.findElement(Locator);
	}
	
	public List<WebElement> getElements(By Locator) {
		return driver.findElements(Locator);
	}

	public void doSendKeys(By Locator, String value) {
		getElement(Locator).sendKeys(value);

	}

	public void doCLick(By Locator) {
		getElement(Locator).click();
	}
	
	public boolean doIsDisplayed(By Locator) {
		return getElement(Locator).isDisplayed();
	}
	
	// Drop-down Utilities
	
	public void doSelectByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}

	public void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public void doSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);

	}
	
}