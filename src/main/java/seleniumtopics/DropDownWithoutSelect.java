package seleniumtopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelect {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

//		 driver.findElement(By.id("Form_getForm_Country")).sendKeys("India");
		
		List<WebElement> countrylist = driver.findElements(By.xpath("//select[@id='Form_getForm_Country']/option"));
		
		System.out.println("Total Countries " + countrylist.size() );

		for(WebElement e: countrylist) {
			String text = e.getText();
			
			System.out.println(text);
			
			if (text.equals("Australia")) {
				e.click();
				break;
			}
		}
		
	}

}
