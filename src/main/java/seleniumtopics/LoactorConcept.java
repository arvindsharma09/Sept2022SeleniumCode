package seleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoactorConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");

		// 1st Approach

//		 driver.findElement(By.id("input-email")).sendKeys("coolnature58@gmail.com");
//		 driver.findElement(By.id("input-password")).sendKeys("test@123");

		// 2nd Approach

//		 WebElement emailId = driver.findElement(By.id("input-email"));
//		 WebElement password = driver.findElement(By.id("input-password"));
//
//		emailId.sendKeys("coolnature58@gmail.com");
//		password.sendKeys("test@123");

		// 3rd Approach -- By Locator

//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//
//		WebElement email= driver.findElement(emailId);
//		WebElement pwd = driver.findElement(password);
//		
//		email.sendKeys("coolnature58@gmail.com");
//		pwd.sendKeys("test@123");

		// 4th Approach

//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//
//		getElement(emailId).sendKeys("coolnature58@gmail.com");
//		getElement(password).sendKeys("test@123");
		
		
		//5th Approach (generic function for WebElement and Actions)

//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		doSendKeys(emailId, "coolnature58@gmail.com");
//		doSendKeys(password, "test@123");
		
		// 6th Approach
		
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil elelUtil  = new ElementUtil(driver);
		
		elelUtil.doSendKeys(emailId, "coolnature58@gmail.com");
		elelUtil.doSendKeys(password, "test@123");
		
	}

	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);
	}

	public static void doSendKeys (By Locator, String value) {
		getElement(Locator).sendKeys(value);
		
		
	}
	
	
}
