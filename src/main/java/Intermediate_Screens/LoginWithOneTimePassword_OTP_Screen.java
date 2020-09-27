package Intermediate_Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Base.CommonClass;

public class LoginWithOneTimePassword_OTP_Screen extends CommonClass{
	
	public LoginWithPasswordScreen Select_LoginWithPassword_Option() {
		
		// Select login with password option
		
		WebElement LoginWithPasswordBtn = driver.findElement(By.xpath("//*[@value='Login with Password']"));
	    wait.until(ExpectedConditions.visibilityOf(LoginWithPasswordBtn)).click();

	    return new LoginWithPasswordScreen();
	}

}
