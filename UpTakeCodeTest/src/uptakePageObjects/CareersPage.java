package uptakePageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CareersPage{

private static WebElement element = null;

public static WebElement btn_JoinUs(WebDriver driver){
 element = driver.findElement(By.className("btn__icon"));
 return element;

	 }

} 



