package Listners;

import java.util.Arrays;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Utilities.Extent_Report_Configuration;

public class CustomListners implements ITestListener{
    
	// Take the instance from configuration file  (return method defined there)
	private static ExtentReports extent= new Extent_Report_Configuration().extentReportSetup();
    private static ExtentTest test;
	
		public void onTestStart(ITestResult result) {
	
	//		test = extent.createTest(result.getTestClass().getName());
		
		test = extent.createTest(result.getTestClass().getName()+ " -> " + result.getMethod().getMethodName());
	
		}
		
		public void onTestSuccess(ITestResult result) {
	
			String logText = "<b> Test Case  '" + result.getMethod().getMethodName() + "' is Successful </b>";
		    Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
		    test.log(Status.PASS, m);
		}

		public void onTestFailure(ITestResult result) {
	  
			String exceptionMessage = Arrays.deepToString(result.getThrowable().getStackTrace());
			test.fail("<details><summary><b><font color = red>" 
					+ "Exception occured (Click Here)" + "</font></b></summary>"
					+ exceptionMessage.replaceAll(",", "<br>") + "</details> \n");
			
			String logText = "<b> Test Case '" + result.getMethod().getMethodName() + "' is Failed </b>";
		    Markup m = MarkupHelper.createLabel(logText, ExtentColor.RED);
		    test.log(Status.FAIL, m);
		}

		public void onTestSkipped(ITestResult result) {
		
			String logText = "<b> Test Case  " + result.getMethod().getMethodName() + " is Skipped </b>";
		    Markup m = MarkupHelper.createLabel(logText, ExtentColor.BLUE);
		    test.log(Status.SKIP, m);
		}

		public void onFinish(ITestContext context) {
			if (extent != null) {
				extent.flush();
			}		
		}
		
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {}
		public void onStart(ITestContext context) {}		
}
