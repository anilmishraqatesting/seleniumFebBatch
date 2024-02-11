package com.flipkartPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maindriver.TestBase;
import com.utilties.CommonFunction;

public class CheckLoginErrorMessage extends TestBase {
	
	
	
	@FindBy(xpath = "//span[contains(text(),'Please enter valid Email ID/Mobile number')]")
	public WebElement errorwithoutmobiletxt;
	
	
	@FindBy(xpath = "(//input[@autocomplete='off'])[2]")
	public WebElement mobilenumbertxtbox;
	
	
	@FindBy(xpath = "//div[contains(text(),'Please enter the OTP sent to')]")
	public WebElement enterotptxt;
	
	
	
	
	public CheckLoginErrorMessage()
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	CommonFunction function=new CommonFunction();
	public void checkAllerrorMessage()
	{
		CheckAllDataOfLoginPage page=new CheckAllDataOfLoginPage();
		function.click(page.loginbutton, "Login button");
		function.click(page.requestotp,"Request OTP" );
		function.checkElementPresence(errorwithoutmobiletxt, "Please enter valid Email ID/Mobile number");
	}
	
	
	public void checkwrongmobilenumberErrorMessage()
	{
		CheckAllDataOfLoginPage page=new CheckAllDataOfLoginPage();
		function.enterData(mobilenumbertxtbox, "123123123123123123", "123123123123123123");
		function.click(page.requestotp, "Request OTP");
		function.checkElementPresence(errorwithoutmobiletxt, "Please enter valid Email ID/Mobile number");

		
		
		
	}
	
	
	
	public void checkpostiveScenario()
	{
		
		CheckAllDataOfLoginPage page=new CheckAllDataOfLoginPage();
		
		function.enterData(mobilenumbertxtbox, "1@gmail.com", "1@gmail.com");
		function.click(page.requestotp, "Request OTP");
		function.checkElementPresence(enterotptxt, "Please enter OTP");

		
		
		
	}
	
	

}
