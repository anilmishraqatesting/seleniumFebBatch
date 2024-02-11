package com.flipkartPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maindriver.TestBase;
import com.utilties.CommonFunction;

public class ChecWelcomePage extends TestBase {
	
	@FindBy(xpath = "//picture[@title='Flipkart']")
	public WebElement flipkartglobalicon;
	
	
	@FindBy(xpath = "//span[contains(text(),'Login')]")
	public WebElement loginbutton;
	
	
	@FindBy(xpath = "//a[contains(text(),'Cart')]")
	public WebElement cartLink;
	
	
	
	public ChecWelcomePage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	CommonFunction function=new CommonFunction();
	public void checkFlipkartHomePage()
	{
		
		function.checkElementPresence(flipkartglobalicon, "Flipkart Global Image");
		function.checkElementPresence(loginbutton, "Login ");
		function.checkElementPresence(cartLink, "Cart Link");
		
	}
	
	
	

}
