package com.flipkartPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maindriver.TestBase;
import com.utilties.CommonFunction;

public class PurchaseBookPage extends TestBase{

	
	
	@FindBy(xpath = "//a[contains(text(),'No Middle Name')]")
	public WebElement nomiddlenameLink;
	
	
	
	@FindBy(xpath = "//button[contains(text(),'Add to Cart')]")
	public WebElement addtocartbutton;
	
	
	
	
	@FindBy(id="name")
	public WebElement nametxtbox;
	
	
	
	@FindBy(id="email")
	public WebElement emailtxtbox;
	
	
	@FindBy(id="cardNumber")
	public WebElement cardnumbertxtbox;
	
	
	
	
	@FindBy(id="cvv")
	public WebElement cvvtxtboox;
	
	
	@FindBy(id="pay-now-btn")
	public WebElement paynowbutton;
	
	
	public PurchaseBookPage()
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	CommonFunction function=new CommonFunction();
	
	public void processPayment()
	{
		
		
		function.click(nomiddlenameLink, "No Middle Name");
		function.click(addtocartbutton, "Add to Cart button");
		function.enterData(nametxtbox, "sachin", "Sachin");
		function.enterData(emailtxtbox, "sachin123@gmail.com", "sachin123@gmail.com");
		function.enterData(cardnumbertxtbox, "123123123", "123123123");
		function.enterData(cvvtxtboox, "111", "111");
		function.click(paynowbutton, "Pay Now button");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
