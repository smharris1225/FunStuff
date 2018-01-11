package myAutomationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import uptakePageObjects.CareersPage;
import uptakePageObjects.UptakeHomePage;

public class PomStyle_Test {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Stephanie Harris\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.uptake.com/");
	    UptakeHomePage.careersButton(driver).click();
	    System.out.println(" Click Join Us to view open positions.");
	    CareersPage.btn_JoinUs(driver).click();	    
	    driver.quit();
	}

}
