 package TestCases;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterSuite;

import Base.CommonClass;

public class BaseTest extends CommonClass{

/*	@AfterSuite
	public void teardown()
	{
	CommonClass.quit();
	}
*/
public boolean IsElementPresent(By by) {
		
		try {
			    wait.until(ExpectedConditions.visibilityOf(driver.findElement(by)));
				return true;		
		}catch(NoSuchElementException e) {
			    return false;
			}
		
}


public boolean AreStringsSame(String Actual, String Expected) {
	
	if(Actual.contains(Expected))
		return true;
	
	else 
		return false;
} 	
}



