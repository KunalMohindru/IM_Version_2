package Intermediate_Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Base.CommonClass;

public class LoginWithPasswordScreen extends CommonClass{

 public void EnterPassword() {
	 
	// Enter password and tap on Login with password
	 
	    WebElement EnterPasswordField = driver.findElement(By.xpath("//*[@id='usr_pass']"));
	    wait.until(ExpectedConditions.visibilityOf(EnterPasswordField)).sendKeys("111111");

	    WebElement LoginWithPasswordBtn = driver.findElement(By.xpath("//*[@id='submtbtn']"));
	    wait.until(ExpectedConditions.visibilityOf(LoginWithPasswordBtn)).click(); 
 
}
}	   
	

