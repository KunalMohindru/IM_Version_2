package Utilities;

import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class Extent_Report_Configuration {

	public ExtentReports extent;
	public ExtentTest test;
    public ExtentHtmlReporter htmlReporter; 

	public ExtentReports extentReportSetup() {
		
		// Setting the look of the report
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/Extent Report/ExtentReport.html");  
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("Title : Auomation Testing"); // Tittle of Report
		htmlReporter.config().setReportName("Report: Sanity Testing"); // Name of the report
		htmlReporter.config().setTheme(Theme.STANDARD);//Default Theme of Report
		
		extent = new ExtentReports(); 		
		extent.attachReporter(htmlReporter);

		// General information related to application
		extent.setSystemInfo("Application Name", "IndiaMart Website");
		extent.setSystemInfo("Scripted By", "Kunal Mohindru");

		return extent;
}
}
