package Intermediate_Screens;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Base.CommonClass;

public class PostPBR_ThankyouScreen extends CommonClass {
	
	public LoginWithOneTimePassword_OTP_Screen NavigateToManageYourRequirement() {
		
		 // Tap on manage requirements button on thank you screen
		
		 WebElement ManageYourRequirementBtn = driver.findElement(By.xpath("//*[@id='manage_rqt']"));
	     wait.until(ExpectedConditions.visibilityOf(ManageYourRequirementBtn)).click();

	     //Change Window
	     
	     Set <String> WindowHandles =  driver.getWindowHandles();
	     java.util.Iterator<String> iter  = WindowHandles.iterator();      
	     String FirstWindow = iter.next();
	     String SecondWindow = iter.next();
	     System.out.println(FirstWindow);
	     System.out.println(SecondWindow);
	     driver.switchTo().window(SecondWindow);
	     
	     return new LoginWithOneTimePassword_OTP_Screen();	  
}	
}
