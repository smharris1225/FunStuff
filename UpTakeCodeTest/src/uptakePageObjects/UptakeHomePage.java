package uptakePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UptakeHomePage {
	private static WebElement element = null;
	 
	 public static WebElement home_Page_Logo_Link(WebDriver driver){
	    element = driver.findElement(By.className("l-site-header__brand"));
	    return element;
	}
	 
	 public static WebElement careersButton(WebDriver driver){
	    element = driver.findElement(By.xpath("/html/body/div[1]/header/section/div[2]/nav/ul/li[6]/a[1]/span"));
	 return element;
	 
	    }
}

