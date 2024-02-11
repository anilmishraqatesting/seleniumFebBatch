package com.maindriver;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
	
	
	
	ThreadLocal<WebDriver> driver=new ThreadLocal<WebDriver>();
	public static DriverFactory instance=new DriverFactory();
	
	
	private DriverFactory()
	{
	}
	
	public static DriverFactory getInstance()
	{
		return instance;
		
	}
	
	
	public void setDriver(WebDriver localdriver)
	{
		
		driver.set(localdriver);
		
	}
	
	
	public WebDriver getDriver()
	{
		
		return driver.get();
		
	}
	
	
	
	public void removeDriver()
	{
		
		driver.get().quit();
		driver.remove();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
