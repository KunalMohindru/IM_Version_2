package Functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Base.CommonClass;

public class Send_Enquiry extends CommonClass{


public void PostEnquiry_ISQ() {
	
	 WebElement ContactSupplier_btn = driver.findElement(By.xpath("//button[contains (text(),'Contact Supplier')]"));	
	 wait.until(ExpectedConditions.visibilityOf(ContactSupplier_btn)).click();
	 	 
	 WebElement Next_btn = driver.findElement(By.xpath("//input[@value = 'Next']"));
	 while (Next_btn.isDisplayed()) {
		 wait.until(ExpectedConditions.visibilityOf(Next_btn)).click();
	 }
	 
	 
	 
	// WebElement Cross_btn = driver.findElement(By.xpath("//div[@class = 'be-cls']")); 
	// wait.until(ExpectedConditions.visibilityOf(Cross_btn)).click();
	 
}	

public void PostEnquiry_GetLatestPrice (WebElement E){
	
	
	 WebElement Get_Latest_Price_btn = E.findElement(By.xpath("//*[@data-ctaname= 'Get Latest Price']"));	
	 wait.until(ExpectedConditions.visibilityOf(Get_Latest_Price_btn)).click();
	 
	 	 
	 WebElement Next_btn = E.findElement(By.xpath("//input[@value = 'Next']"));
	 while (Next_btn.isDisplayed()) {
		 wait.until(ExpectedConditions.visibilityOf(Next_btn)).click();
	 }
	 
	 WebElement Cross_btn = driver.findElement(By.xpath("//div[@class = 'be-cls']")); 
	 wait.until(ExpectedConditions.visibilityOf(Cross_btn)).click();	 
}	


public void ThankYouScreen_ViewMessagesBtn()
{  
	WebElement ThankYouScreen_ViewMessagesBtn = driver.findElement(By.xpath("//a [@class='tvwBtn']"));
    wait.until(ExpectedConditions.visibilityOf(ThankYouScreen_ViewMessagesBtn)).click();
	
}

}


