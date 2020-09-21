package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Base.CommonClass;

public class BuyerDashboard extends CommonClass{

 public	SearchPage Perform_Search() {
	
// The following code is written to prevent staleness of search bar	
	 wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.xpath("//input [@id ='search_string']"))));

	 WebElement Searchbox = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input [@id ='search_string']"))));
	 Searchbox.sendKeys("Parker Pen");	
	 Searchbox.sendKeys(Keys.ENTER);
	 return new SearchPage();
 };
}
