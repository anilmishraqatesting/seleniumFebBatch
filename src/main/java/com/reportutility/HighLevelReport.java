package com.reportutility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.utilties.CommonFunction;

public class HighLevelReport {
	
	
	public static ExtentReports extent;
	public static ExtentSparkReporter htmlreporter;
	public static ExtentTest parenttest;
	public static ExtentTest childtest;
	
	
	public void generateReport()
	{
		
		try {
			
			long time=System.currentTimeMillis();
			
			String path=System.getProperty("user.dir")+"\\automationreport\\report"+time+".html";
			
			htmlreporter=new ExtentSparkReporter(path);
			extent=new ExtentReports();
			extent.attachReporter(htmlreporter);
			String username=System.getProperty("user.name");
			String osname=System.getProperty("os.name");
			String browsername=CommonFunction.readPropertiesFile("browsername");
			extent.setSystemInfo("browser name", browsername);
			extent.setSystemInfo("OS name", osname);
			extent.setSystemInfo("user name", username);
			htmlreporter.config().setDocumentTitle("Automation Test Report");
			htmlreporter.config().setTheme(Theme.STANDARD);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
		public void savereport()
		{
			
			extent.flush();
			
		}
		
		
		public void createcurrentNode(String name)
		{
			
			parenttest=extent.createTest(name);
		}
		
		
		public static ExtentTest Result(String methodName)
		{
			
			parenttest=extent.createTest(methodName);
			return(parenttest);
			
		}
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	

}
