package seleniumtopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	public WebDriver driver;

	/**
	 * This Method is used to initialize the driver on the basis of given browser
	 * 
	 * @param browserName
	 * @return This returns the driver
	 */

	public WebDriver LaunchBrowser(String browserName) {
		System.out.println("Browser Name is " + browserName);

		if (browserName.equalsIgnoreCase("Chrome")) {
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\Arvind Sharma\\Work\\chromedriver\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (browserName.equalsIgnoreCase("Firefox")) {
			//System.setProperty("webdriver.gecko.driver","C:\\Users\\Arvind Sharma\\Work\\geckodriver\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else {
			System.out.println("Please provide the correct browser" + browserName);
		}

		return driver;
	}

	public void launchUrl(String url) {
		driver.get(url);
	}

	public String getPageTitle() {
		return driver.getTitle();

	}

	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}
}
