package com.allpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maindriver.TestBase;
import com.utilties.CommonFunction;

public class LoginPage extends TestBase {
	
	
	
	@FindBy(id="username-6")
	public WebElement usernametxtbox;
	
	
	@FindBy(id="user_password-6")
	public WebElement passwordtxtbox;
	
	
	@FindBy(id="um-submit-btn")
	public WebElement loginbutton;
	
	
	
	CommonFunction function=new CommonFunction();
	
	
	public LoginPage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void login()
	{
		
		
		function.enterData(usernametxtbox, CommonFunction.readPropertiesFile("username"), "user name");
		function.enterData(passwordtxtbox, CommonFunction.readPropertiesFile("password"), "user name");
		function.click(loginbutton, "Login button");

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
