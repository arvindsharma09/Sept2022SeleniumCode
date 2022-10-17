package seleniumtopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectOptionsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		WebElement Country = driver.findElement(By.id("Form_getForm_Country"));
		
		Select select = new Select(Country);
            List<WebElement> countryList = select.getOptions();
            
            System.out.println("Total Countries in the dropdown is " + countryList.size() );
            
            for(WebElement e : countryList ) {
            	String list = e.getText();
            	
            	System.out.println(list);
            	
            	if(list.contains("Hungary")) {
            		e.click();
            		break;
            	}
            }
            
            
	}

}
