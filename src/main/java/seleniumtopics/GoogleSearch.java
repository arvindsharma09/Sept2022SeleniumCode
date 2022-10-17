package seleniumtopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(3000);
		
		List<WebElement> suggestionList = driver.findElements(By.xpath("//ul[@role='listbox']/li//div[@class='wM6W7d']//span"));
		
		System.out.println("Total number of Suggestions " + suggestionList.size() );
		
		for(WebElement e:suggestionList ) {
			String fullList = e.getText();
			
			System.out.println(fullList);
			
			if(fullList.contains("selenium testing")) {
				e.click();
				break;
			}
		}
		
		
	}

}
