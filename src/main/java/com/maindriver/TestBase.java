package com.maindriver;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.Status;
import com.reportutility.HighLevelReport;
import com.utilties.CommonFunction;

public class TestBase extends HighLevelReport {
	
	
	public static WebDriver driver=null;
	
	@BeforeMethod
	public void startTest()
	{
 
		driver=BrowserFactory.initalizeDriver();
		DriverFactory.getInstance().setDriver(driver);
		driver=DriverFactory.getInstance().getDriver();
		CommonFunction.openURL();
	}
	
	@AfterMethod
	public void stopTest(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			CommonFunction.captureScreenshot();
			parenttest.log(Status.FAIL, result.getName());
			
		}
		DriverFactory.getInstance().removeDriver();
		
	}
	
	@BeforeSuite
	public void strtatReport()
	{
		
		generateReport();
		
	}
	
	@AfterSuite
	public void saveAllData()
	{
		
		savereport();
	}
	
	
		public  void failedcase(ITestResult result)
		{
			
			if(result.getStatus()==ITestResult.FAILURE)
			{
				
				parenttest.log(Status.FAIL, result.getName());
			}			
			
			
		}
	

}
