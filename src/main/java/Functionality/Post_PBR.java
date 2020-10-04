package Functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Base.CommonClass;

public class Post_PBR extends CommonClass{

	 
	public void PostPBR_InlineBanner() {
	
	WebElement PBR_box= driver.findElement(By.xpath("//div[@class = 'bespc']"));	
	WebElement SubmitRequirement_btn = PBR_box.findElement(By.xpath("//input[@value = 'Submit Requirement']"));	
	wait.until(ExpectedConditions.elementToBeClickable(SubmitRequirement_btn)).click();
		
	WebElement Next_btn = driver.findElement(By.xpath("//input[@value = 'Next']"));

		while (Next_btn.isDisplayed()){
			 wait.until(ExpectedConditions.visibilityOf(Next_btn)).click();
		 }
//		 WebElement Cross_btn = driver.findElement(By.xpath("//div[@class = 'be-cls']")); 
//		 wait.until(ExpectedConditions.visibilityOf(Cross_btn)).click();
}				 
}

