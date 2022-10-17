package seleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RegisterTestPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.LaunchBrowser("chrome");
		brUtil.launchUrl("https://opencart.antropy.co.uk/index.php?route=account/register");
		String title = brUtil.getPageTitle();
		System.out.println(title);
		if (title.equals("Register Account")) {
			System.out.println("Title is Correct");
		} else {
			System.out.println("Title is Incorrect");
		}
		String url = brUtil.getPageUrl();
		System.out.println(url);

		// By Locators
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By emailId = By.id("input-email");
		By telePhone = By.id("input-telephone");
		By pwd = By.id("input-password");
		By cnfpwd = By.id("input-confirm");

		ElementUtil eleUtil = new ElementUtil(driver);
		
		eleUtil.doSendKeys(firstName, "Arvind");
		eleUtil.doSendKeys(lastName, "Sharma");
		eleUtil.doSendKeys(emailId, "coolnature58@gmail.com");
		eleUtil.doSendKeys(telePhone, "4694655559");
		eleUtil.doSendKeys(pwd, "test@123");
		eleUtil.doSendKeys(cnfpwd, "test@123");

	}

}
