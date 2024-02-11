package com.maindriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.utilties.CommonFunction;

public class BrowserFactory {
	
	
	
	
	public static WebDriver initalizeDriver()
	{
		WebDriver driver=null;
		
		try {
			
			String browser=CommonFunction.readPropertiesFile("browsername");
			
			
			if(browser.equalsIgnoreCase("chrome"))
			{
				
				driver=new ChromeDriver();
			}
			
			else if(browser.equalsIgnoreCase("firefox"))
			{
				
				driver=new FirefoxDriver();
			}
			
			else if(browser.equalsIgnoreCase("edge"))
			{
				
				driver=new EdgeDriver();
				
			}
			
			else if(browser.equalsIgnoreCase("safari"))
			{
				
				driver=new SafariDriver();
				
			}
			
			else if(browser.equalsIgnoreCase("internetexplorere"))
			{
				
				driver=new InternetExplorerDriver();
			}
			
			else
			{
				
				System.out.println("Please check your propertyFile... something is wrong!");
				
			}
			
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));		
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
