package Pages;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Base.CommonClass;
import Functionality.Post_PBR;
import Functionality.Send_Enquiry;

public class ProductDetailPage extends CommonClass{
	
	public void PostPBR() {
		Post_PBR Post_PBR_obj = new	Post_PBR();
		Post_PBR_obj.PostPBR_InlineBanner();	
	}	

	public void NavigateToCompany() {
		WebElement Company= driver.findElement(By.xpath("//*[@id = 'compNm']"));
		wait.until(ExpectedConditions.visibilityOf(Company)).click();		
		
	}
	
	public void SendEnquiry_MainProduct() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement GetLatestPrice_btn = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='glp_pg-1']"))));
		GetLatestPrice_btn.click();		
		InsideEnquiry_Next();
	}

	public void InsideEnquiry_Next() {
	 WebElement Next_btn = driver.findElement(By.xpath("//input[@value = 'Next']"));
	 while (Next_btn.isDisplayed()) {
		 wait.until(ExpectedConditions.visibilityOf(Next_btn)).click();
	 }
	 
	 WebElement Cross_btn = driver.findElement(By.xpath("//div[@class = 'be-cls']")); 
	 wait.until(ExpectedConditions.visibilityOf(Cross_btn)).click();	 
	}	

	public void SendEnquiry_ExploreSimilarProducts() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement GetLatestPrice_btn = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@data-section= 'SimilarProducts'][@data-ctaname='Get Latest Price']"))));
		GetLatestPrice_btn.click();		
		InsideEnquiry_Next();
	}
	
	public void SendEnquiry_FeaturedRecommendations() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement ContactSupplier_btn = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@class='btn3']"))));
		ContactSupplier_btn.click();		
		InsideEnquiry_Next();
	}
	
	public void SendEnquiry_CompareSimilarProductsFromOtherSellers() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement GetLatestPrice_btn = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@data-section= 'ISQ'][@data-ctaname='Get Latest Price']"))));
		GetLatestPrice_btn.click();		
		InsideEnquiry_Next();
	}

	public void SendEnquiry_LookForSimilarItemsInThisCategory() {
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	WebElement ContactSupplier_btn = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@data-section='RecomProd']"))));
	ContactSupplier_btn.click();		
	InsideEnquiry_Next();
}


	public void ImpCat_BrowseRelatedCategories() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement FirstMcat = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='pcatnm']"))));
		Actions Scroll = new Actions (driver);
		Scroll.moveToElement(FirstMcat);
		FirstMcat.click();		
	}
}
