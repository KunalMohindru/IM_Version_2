package Rough;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Functionality.Post_PBR;
import Functionality.Send_Enquiry;
import Pages.BuyerDashboard;
import Pages.LandingHomePage;
import Pages.ProductDetailPage;
import Pages.SearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class R1 {

	public static void main(String[] args) {
 //Send Enquiry using search page		
 LandingHomePage LoginHomePage_obj = new LandingHomePage ();
 BuyerDashboard BuyerDashboard_obj = LoginHomePage_obj.Buyer_SignIn("9999868769");
 SearchPage SearchPage_obj= BuyerDashboard_obj.Perform_Search();
 SearchPage_obj.NavigateToPDP().ImpCat_BrowseRelatedCategories();
 
 //SearchPage_obj.NavigateToPDP().SendEnquiry_CompareSimilarProductsFromOtherSellers();
 
 
 //SearchPage_obj.NavigateToPDP().SendEnquiry_FeaturedRecommendations();
 
 
 //SearchPage_obj.NavigateToPDP().SendEnquiry_ExploreSimilarProducts();

 //SearchPage_obj.NavigateToPDP().NavigateToCompany();
 //SearchPage_obj.PostPBR();
//SearchPage_obj.NavigateToCompany();
// ProductDetailPage ProductDetailPage_obj = SearchPage_obj.NavigateToPDP();
 //ProductDetailPage_obj.enter();
 //SearchPage_obj.ApplyFilters();
 
// SearchPage_obj.ChangeLocation();
 /* Send_Enquiry Send_Enquiry_obj = new Send_Enquiry();
 Send_Enquiry_obj.PostEnquiry_ISQ();
	*/
 /*
Post_PBR Post_PBR_obj = new	Post_PBR();
Post_PBR_obj.PostPBR_InlineBanner();
 */	

}
}


