package TestCases;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Intermediate_Screens.LoginWithOneTimePassword_OTP_Screen;
import Intermediate_Screens.LoginWithPasswordScreen;
import Intermediate_Screens.PostPBR_ThankyouScreen;
import Intermediate_Screens.SendEnq_ThankyouScreen;
import Pages.BuyerDashboard;
import Pages.LandingHomePage;
import Pages.SearchPage;
import Pages.BuyerDashboard;


public class SearchPageTest extends BaseTest{

	SendEnq_ThankyouScreen SendEnq_ThankyouScreen_obj = new SendEnq_ThankyouScreen (); 
	PostPBR_ThankyouScreen PostPBR_ThankyouScreen_obj = new PostPBR_ThankyouScreen ();
	
@BeforeMethod
public void ProductSearchFunctionality() {
	
	    LandingHomePage LoginHomePage_obj = new LandingHomePage ();
	    BuyerDashboard BuyerDashboard_obj = LoginHomePage_obj.Buyer_SignIn("1622222223");
	    SearchPage SearchPage_obj = BuyerDashboard_obj.Perform_Search();
	
	    WebElement ProductSearched = driver.findElement(By.xpath("//*[@data-click ='^Prod0Name']"));
		String ProductSearchedString = wait.until(ExpectedConditions.visibilityOf(ProductSearched)).getText();
		Boolean Result = AreStringsSame(ProductSearchedString, "Parker"); 
	//	System.out.println(ProductSearchedString);
		System.out.println("Before Method");
		Assert.assertTrue(Result);	
}


@Test (priority=0)
public void LocationFunctionality() {
	
	System.out.println("Method 1");
	/*
	SearchPage_obj.ChangeLocation();
	
	WebElement SellerLocation1 = driver.findElement(By.xpath("//p[@class='sm clg']"));
	wait.until(ExpectedConditions.stalenessOf(SellerLocation1));
	
	WebElement SellerLocation = driver.findElement(By.xpath("//p[@class='sm clg']"));
	String SellerLocationString = wait.until(ExpectedConditions.visibilityOf(SellerLocation)).getText();
	
//	System.out.println(SellerLocationString);
	Boolean Result = AreStringsSame(SellerLocationString, "Ah"); 
	
	Assert.assertTrue(Result);
*/	
}



@Test (priority=1)
public void TestSearchPageSendEnquiry() throws InterruptedException {

	/*
	// Send Enquiry for a product of a company and then check the same on messages
	
	WebElement Product = driver.findElement(By.xpath("//a[@class='fs18 ptitle']"));
	String ProductName = wait.until(ExpectedConditions.visibilityOf(Product)).getText();
	System.out.println(ProductName);
	
	WebElement Company = driver.findElement(By.xpath("//*[@class='lcname'][@data-click='^CompanyName']"));
	String CompanyName = wait.until(ExpectedConditions.visibilityOf(Company)).getText();
	System.out.println(CompanyName);
	SearchPage_obj.SendEnquiry();
	
	// After send enquiry, thank you screen appears which take you to login for full login mode and then to message section
	Thread.sleep(2000);
	LoginWithOneTimePassword_OTP_Screen LoginWithOneTimePassword_OTP_Screen_obj = SendEnq_ThankyouScreen_obj.NavigateToMessages(); 
	
	Thread.sleep(2000);
	LoginWithPasswordScreen LoginWithPasswordScreen_obj = LoginWithOneTimePassword_OTP_Screen_obj.Select_LoginWithPassword_Option();
	
	Thread.sleep(2000);
	LoginWithPasswordScreen_obj.EnterPassword();
	
    // On Message screen, check whether the enquiry has been sent for the correct product and company
	Thread.sleep(5000);
	WebElement CompanyOnChatScreen = driver.findElement(By.xpath("//p[@class='fs18 mbt15']"));
	String CompanyNameOnChatScreen = wait.until(ExpectedConditions.visibilityOf(CompanyOnChatScreen)).getText();
	System.out.println(CompanyNameOnChatScreen);
	
	Thread.sleep(2000);
    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"helpmsg\"]/div[3]/div/a")))).click();

    java.util.List<WebElement> Chats = driver.findElements(By.xpath("//*[@class='inner_msg_div']"));
    int No_Of_Messages = Chats.size();
    System.out.println(No_Of_Messages);
    String LatestChat = Chats.get(No_Of_Messages - 1).getText();
    System.out.println(LatestChat);
        
    Boolean result = AreStringsSame(LatestChat, ProductName);
    Boolean result_2 = AreStringsSame(CompanyNameOnChatScreen, CompanyName);
    System.out.println(result);
    System.out.println(result_2);
    if (result == true && result_2 == true)
    Assert.assertTrue(true);
    else 
    Assert.assertTrue(false);
*/
	System.out.println("Method 2");

}


@Test (priority=3)
public void PostPBRFunctionality() throws InterruptedException {

	/*
	SearchPage_obj.PostPBR();
	Thread.sleep(2000);
	LoginWithOneTimePassword_OTP_Screen LoginWithOneTimePassword_OTP_Screen_obj = PostPBR_ThankyouScreen_obj.NavigateToManageYourRequirement();
	Thread.sleep(2000);
	LoginWithPasswordScreen LoginWithPasswordScreen_obj = LoginWithOneTimePassword_OTP_Screen_obj.Select_LoginWithPassword_Option();
	Thread.sleep(2000);
	LoginWithPasswordScreen_obj.EnterPassword();
	Thread.sleep(2000);
	
	// On MBR screen verify whether it has been posted for the correct product or not
	
	WebElement PostedPBRforProduct = driver.findElement(By.xpath("//div[@id='Listing1']/div/h1/a"));
	String PostedPBRforProduct_Name = PostedPBRforProduct.getText();
	System.out.println(PostedPBRforProduct_Name);

	Boolean result = AreStringsSame(PostedPBRforProduct_Name, "Parker");
    Assert.assertTrue(result);
*/
	System.out.println("Method 3");
}

@AfterClass
public void closeBrowser() {
	
	    System.out.println("After Method");
	    if (driver!=null)
	    	driver.close();	
}
@AfterMethod
public void Browser() {
	
	    System.out.println("nu;; browser");
	    if (driver!=null)
	    	driver = null;	
}
}
