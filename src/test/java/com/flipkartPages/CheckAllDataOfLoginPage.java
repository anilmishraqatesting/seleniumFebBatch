package com.flipkartPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maindriver.TestBase;
import com.utilties.CommonFunction;

public class CheckAllDataOfLoginPage extends TestBase {
	
	
	@FindBy(xpath = "//span[contains(text(),'Login')]")
	public WebElement loginbutton;
	
	
	@FindBy(xpath = "//span[contains(text(),'Get access to your Orders, Wishlist and Recommendations')]")
	public WebElement getaccessyourordertxt;
	
	
	
	@FindBy(xpath = "//button[contains(text(),'Request OTP')]")
	public WebElement requestotp;
	
	
	public CheckAllDataOfLoginPage()
	{
		
		
		PageFactory.initElements(driver, this);
		
	}
	
	CommonFunction function=new CommonFunction();
	public void checkElementofLoginPage()
	{
		function.click(loginbutton, "Login");
		function.checkElementPresence(getaccessyourordertxt, "Get access to your Orders, Wishlist and Recommendations");
		function.checkElementPresence(requestotp, "Request OTP");
	}
	
	
	
	
	
	
	
	

}
