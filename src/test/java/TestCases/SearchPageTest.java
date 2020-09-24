package TestCases;

import java.awt.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.BuyerDashboard;
import Pages.LandingHomePage;
import Pages.SearchPage;
import Pages.BuyerDashboard;


public class SearchPageTest extends BaseTest{

	LandingHomePage LoginHomePage_obj = new LandingHomePage ();
	BuyerDashboard BuyerDashboard_obj = LoginHomePage_obj.Buyer_SignIn("1622222223");
	SearchPage SearchPage_obj = BuyerDashboard_obj.Perform_Search();
	
	
@Test (priority=0)
public void TestProductSearchFunctionality() {
	
	    WebElement ProductSearched = driver.findElement(By.xpath("//*[@data-click ='^Prod0Name']"));
		String ProductSearchedString = wait.until(ExpectedConditions.visibilityOf(ProductSearched)).getText();
	//	System.out.println(ProductSearchedString);
		Boolean Result = AreStringsSame(ProductSearchedString, "Parker Pen"); 
		Assert.assertTrue(Result);	
}
/*
@Test (priority=1)
public void TestLocationFunctionality() {
	
	SearchPage_obj.ChangeLocation();
	
	WebElement SellerLocation1 = driver.findElement(By.xpath("//p[@class='sm clg']"));
	wait.until(ExpectedConditions.stalenessOf(SellerLocation1));
	
	WebElement SellerLocation = driver.findElement(By.xpath("//p[@class='sm clg']"));
	String SellerLocationString = wait.until(ExpectedConditions.visibilityOf(SellerLocation)).getText();
	
//	System.out.println(SellerLocationString);
	Boolean Result = AreStringsSame(SellerLocationString, "Ah"); 
	
	Assert.assertTrue(Result);
	
}
*/

@Test (priority =2)
public void TestSearchPageSendEnquiry() {
	
	WebElement Product = driver.findElement(By.xpath("//a[@class='fs18 ptitle']"));
	String ProductName = wait.until(ExpectedConditions.visibilityOf(Product)).getText();
	System.out.println(ProductName);
	
	WebElement Company = driver.findElement(By.xpath("//*[@class='lcname'][@data-click='^CompanyName']"));
	String CompanyName = wait.until(ExpectedConditions.visibilityOf(Company)).getText();
	System.out.println(CompanyName);
	
	SearchPage_obj.SendEnquiry();
	
	WebElement ThankYouScreen_ViewMessagesBtn = driver.findElement(By.xpath("//a [@class='tvwBtn']"));
    wait.until(ExpectedConditions.visibilityOf(ThankYouScreen_ViewMessagesBtn)).click();
	
  
    //Change Window
    
    Set <String> WindowHandles =  driver.getWindowHandles();
    java.util.Iterator<String> iter  = WindowHandles.iterator();      
    String FirstWindow = iter.next();
    String SecondWindow = iter.next();
    System.out.println(FirstWindow);
    System.out.println(SecondWindow);
    
    driver.switchTo().window(SecondWindow);
 
    
    // Login screen
    
    try {
    	Thread.sleep(5000);
    } catch (InterruptedException e) {
    	// TODO Auto-generated catch block
    	e.printStackTrace();
    }
    
    WebElement FullLoginScreen_LoginWithPasswordBtn = driver.findElement(By.xpath("//*[@value='Login with Password']"));
    wait.until(ExpectedConditions.visibilityOf(FullLoginScreen_LoginWithPasswordBtn)).click();
   
    try {
    	Thread.sleep(5000);
    } catch (InterruptedException e) {
    	// TODO Auto-generated catch block
    	e.printStackTrace();
    }
    
    
    WebElement LoginWithPasswordScreen_EnterPasswordField = driver.findElement(By.xpath("//*[@id='usr_pass']"));
    wait.until(ExpectedConditions.visibilityOf(LoginWithPasswordScreen_EnterPasswordField)).sendKeys("111111");
   
    try {
    	Thread.sleep(5000);
    } catch (InterruptedException e) {
    	// TODO Auto-generated catch block
    	e.printStackTrace();
    }
    
    WebElement LoginWithPasswordScreen_LoginWithPasswordBtn = driver.findElement(By.xpath("//*[@id='submtbtn']"));
    wait.until(ExpectedConditions.visibilityOf(LoginWithPasswordScreen_LoginWithPasswordBtn)).click(); 
    
    // Messages
	
    try {
    	Thread.sleep(5000);
    } catch (InterruptedException e) {
    	// TODO Auto-generated catch block
    	e.printStackTrace();
    }
    
    
	WebElement CompanyOnChatScreen = driver.findElement(By.xpath("//p[@class='fs18 mbt15']"));
	String CompanyNameOnChatScreen = wait.until(ExpectedConditions.visibilityOf(CompanyOnChatScreen)).getText();
	System.out.println(CompanyNameOnChatScreen);
	try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"helpmsg\"]/div[3]/div/a")))).click();

    java.util.List<WebElement> Chats = driver.findElements(By.xpath("//*[@class='inner_msg_div']"));
    int No_Of_Messages = Chats.size();
    System.out.println(No_Of_Messages);
    String LatestChat = Chats.get(No_Of_Messages - 1).getText();
    System.out.println(LatestChat);
    
    
    Boolean result = AreStringsSame(LatestChat, ProductName);
    Boolean result_2 = AreStringsSame(CompanyName, CompanyNameOnChatScreen);
    
    if (result == true && result_2 == true)
    Assert.assertTrue(true);
    else 
    Assert.assertTrue(false);
       	

}

}
