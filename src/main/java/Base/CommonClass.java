package Base;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.LandingHomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonClass {

	public static WebDriver driver;
	public static WebDriverWait wait;
		
		
 public CommonClass() {
		
		if (driver == null)
		{	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
			//WebDriverManager.chromedriver().setup();  
			driver = new ChromeDriver();
			wait= new WebDriverWait (driver,60);
			
			driver.get("https://www.indiamart.com/");
			driver.manage().window().maximize();
			}
	}
 
 public static void quit() {
 driver.quit();	 
}
}
		
