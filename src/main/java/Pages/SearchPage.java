package Pages;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Base.CommonClass;
import Functionality.Post_PBR;
import Functionality.Send_Enquiry;

public class SearchPage extends CommonClass{
 
public void PostPBR() {
	Post_PBR Post_PBR_obj = new	Post_PBR();
	Post_PBR_obj.PostPBR_InlineBanner();	
}

public void SendEnquiry() {
	Send_Enquiry Send_Enquiry_obj = new Send_Enquiry();
	Send_Enquiry_obj.PostEnquiry_ISQ();
}

public void ChangeLocation()
{ //Manually entered location and then tapped on enter...unable to access the values from dropdown
	WebElement Location_Field= driver.findElement(By.id("txt-city"));
	wait.until(ExpectedConditions.visibilityOf(Location_Field)).sendKeys("Ahmedabad");	
	wait.until(ExpectedConditions.visibilityOf(Location_Field)).sendKeys(Keys.ENTER);
}

public void ApplyFilters() {
	
	WebElement BusinessType_Exporter= driver.findElement(By.xpath("//*[contains (text(),'Exporter')]"));
	wait.until(ExpectedConditions.visibilityOf(BusinessType_Exporter)).click();	
	
	WebElement RelatedCategories= driver.findElement(By.xpath("//div [@id='stk11']/ul/li/a"));
    wait.until(ExpectedConditions.visibilityOf(RelatedCategories)).click();	

/*	related brands unable to find related brands 
 
    WebElement RelatedBrands= driver.findElement(By.xpath("//ul [@id='stk12']/li/a"));
	wait.until(ExpectedConditions.visibilityOf(RelatedBrands)).click();	
*/
}

public ProductDetailPage NavigateToPDP(){
 // click PDP link of 6th product
	WebElement PDP= wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//span [@data-click= '^Prod0Name'])[5]"))));
	wait.until(ExpectedConditions.visibilityOf(PDP)).click();	
	
// Navigate to the PDP window
	
	Set <String> DifferentWindow = driver.getWindowHandles();
	Iterator<String> iterator_obj  = DifferentWindow.iterator();
	String FirstWindow = iterator_obj.next();
	String SecondWindow = iterator_obj.next();
	System.out.println(FirstWindow);
	System.out.println(SecondWindow);

// Switch to product detail page
	
	driver.switchTo().window(SecondWindow);
	return new ProductDetailPage();
}

public void NavigateToCompany(){
	 // click Company link of 6th product
		WebElement Company= driver.findElement(By.xpath("(//h4 [@data-click= '^CompanyName'])[5]"));
		wait.until(ExpectedConditions.visibilityOf(Company)).click();		
}
}