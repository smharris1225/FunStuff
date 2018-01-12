package myAutomationFramework;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import uptakePageObjects.CareersPage;
import uptakePageObjects.UptakeHomePage;

public class PomStyle_Test {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Stephanie Harris\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.uptake.com/");
	    UptakeHomePage.careersButton(driver).click();
	    System.out.println(" Click Join Us to view open positions.");
	    CareersPage.btn_JoinUs(driver).click();	//should launch new tab with job listings
	    driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL,"1"); //takes us back to careers page tab
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      getscreenshot(); //takes a screenshot to verify we are on careers page
	    
	    }
public static void getscreenshot() throws Exception 
{
    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(scrFile, new File("C:\\Users\\Stephanie Harris\\Desktop\\Screenshots\\Testscreenshot.png"));
    driver.quit();
}
     
	}