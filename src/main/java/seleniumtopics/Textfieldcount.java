package seleniumtopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Textfieldcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opencart.antropy.co.uk/index.php?route=account/register");
		
		List<WebElement> totaltextfiels = driver.findElements(By.xpath("//input[@id='input-firstname' or @id= 'input-lastname' or @id='input-email' or @type='tel' or @type= 'password']"));
		
		System.out.println("Total fields present on the Page is : " + totaltextfiels.size() );
		
		for(WebElement e :totaltextfiels) {
			
			
			
		}
		
	}

}
