package Intermediate_Screens;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Base.CommonClass;

public class SendEnq_ThankyouScreen extends CommonClass {

 public LoginWithOneTimePassword_OTP_Screen NavigateToMessages() {
	
	 // Tap on view messages button on thank you screen
	
	 WebElement ViewMessagesBtn = driver.findElement(By.xpath("//a [@class='tvwBtn']"));
     wait.until(ExpectedConditions.visibilityOf(ViewMessagesBtn)).click();

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
