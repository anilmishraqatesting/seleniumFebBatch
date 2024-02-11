package com.allpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maindriver.TestBase;
import com.utilties.CommonFunction;

public class GmailSignupPage extends TestBase{
	
	
	
	
	@FindBy(xpath = "(//div[contains(text(),'Create an account')])[1]")
	public WebElement createaccountLink;
	
	@FindBy(xpath = "(//a[contains(text(),'For my personal use')])[1]")
	public WebElement formypersonalusageLink;
	
	
	@FindBy(name="firstName")
	public WebElement firstnametxtbox;
	
	
	@FindBy(xpath = "//span[contains(text(),'Next')]")
	public WebElement nextbutton;
	
	@FindBy(xpath = "//span[contains(text(),'Are you sure you entered your name correctly?')]")
	public WebElement errormessagetxt;
	
	
	public GmailSignupPage()
	{
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	CommonFunction function=new CommonFunction();
	public void checkLoginErrormessage()
	{
		function.click(createaccountLink, "Create account");
		function.click(formypersonalusageLink, "For my personal usage Link");
		function.enterData(firstnametxtbox, "123123123123123", "123123123123123");
		function.click(nextbutton, "Next button");
		function.checkElementPresence(errormessagetxt, "Error Message");
	}
	
	
	

}
