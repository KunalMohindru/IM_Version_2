package TestCases;

import static org.testng.Assert.assertTrue;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.BuyerDashboard;
import Pages.LandingHomePage;

public class LoginTest extends BaseTest{
	
	@Test
	public void TestLoginFunctionality() {
		
        // Test whether user is able to login the application 		
		
		LandingHomePage LoginHomePage_obj = new LandingHomePage ();
		BuyerDashboard BuyerDashboard_obj = LoginHomePage_obj.Buyer_SignIn("1622222223");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Hi')][@class='rmv cpo ico-usr Hd_dib']"))); 
		boolean k = IsElementPresent(By.xpath("//a[contains(text(),'Hi')][@class='rmv cpo ico-usr Hd_dib']"));

        Assert.assertTrue(k);
             
       driver.quit();
       driver = null;
	}


	@Test
	public void Negative_TestLoginFunctionality() {
		
        // Test whether user is unable to login the application 		
		
		LandingHomePage LoginHomePage_obj = new LandingHomePage ();
		BuyerDashboard BuyerDashboard_obj = LoginHomePage_obj.Buyer_SignIn("9999");
		
		String ActualErrorMessage = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='mobile_err']"))).getText(); 
		String ExpectedErrorMessage= "Please enter 10 digit mobile number."; 
        boolean result = false;
        
        if(ActualErrorMessage.equals(ExpectedErrorMessage)) 
           	result = true;
        
        Assert.assertTrue(result);
        driver.quit();
        driver = null;
	}
	
}
