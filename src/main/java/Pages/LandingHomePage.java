package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.CommonClass;

public class LandingHomePage extends CommonClass{
	


	public BuyerDashboard Buyer_SignIn(String PhoneNo)
	{		
		WebElement SignIn_ToolBar = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@id='user_sign_in']"))));
		SignIn_ToolBar.click();
		
		WebElement SignIn_Button = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id= 'mobile']"))));
		SignIn_Button.sendKeys(PhoneNo);
		
		WebElement Submit_button = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@id ='logintoidentify']"))));
		Submit_button.click();
		
		return new BuyerDashboard();
	}
}
