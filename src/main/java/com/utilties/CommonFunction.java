package com.utilties;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.maindriver.TestBase;

public class CommonFunction extends TestBase {
	
	
	//This is the code for Ben and victor
	
	public static String readPropertiesFile(String key)
	{
		
		String result="";
		String path=System.getProperty("user.dir")+"\\src\\main\\java\\com\\configenviorment\\config.properties";
		try {
			
			FileInputStream file=new FileInputStream(path);
			
			Properties prop=new Properties();
			prop.load(file);
			result=prop.getProperty(key);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
		
		
	}
	
	
	
	public static void openURL()
	{
		String url=readPropertiesFile("url");
		driver.get(url);
	}
	
	
	public void click(WebElement element,String data)
	{
		
		element.click();
		
		
	}
	
	
	
	public void enterData(WebElement element,String data,String message)
	{
		element.clear();
		element.sendKeys(data);		
		
	}
	
	
	public void selectValueFromDropdownbyVisibleText(WebElement element,String text)
	{
		
		Select select=new Select(element);
		select.selectByVisibleText(text);		
		
		
	}
	
	
	
	public boolean checkElementPresence(WebElement element,String data)
	{
		
		
		boolean flag=element.isDisplayed();
		
		if(flag)
		{
			
			System.out.println("Element is displaying");
		}
		
		
		
		return flag;
		
	}
	
	
   public String getText(WebElement element,String data)
   {
	   
	   String text=element.getText();
	return text;
	   
   }
	
	
	public static  void captureScreenshot()
	{
		try {
			
			TakesScreenshot src=(TakesScreenshot)driver;
			
			  String basescreenshot=src.getScreenshotAs(OutputType.BASE64);
			parenttest.addScreenCaptureFromBase64String(basescreenshot).getModel();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	

}
