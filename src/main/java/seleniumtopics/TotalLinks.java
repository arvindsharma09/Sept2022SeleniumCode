package seleniumtopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");

		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));

		System.out.println("Total number of Links on the Page " + totalLinks.size());

//		for(WebElement e : totalLinks) {
//			String text = e.getText();
//			
//			System.out.println(text);
//		}

		for (int i = 0; i < totalLinks.size(); i++) {
			System.out.println(totalLinks.get(i).getText());

		}

	}

}
