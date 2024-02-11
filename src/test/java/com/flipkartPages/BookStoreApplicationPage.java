package com.flipkartPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maindriver.TestBase;
import com.utilties.CommonFunction;

public class BookStoreApplicationPage extends TestBase {
	
	
	
	@FindBy(xpath = "//a[contains(text(),'Book Store Application')]")
	public WebElement bookstoreapplicationLink;
	
	
	@FindBy(xpath = "(//span[contains(text(),'Book Store')])[1]")
	public WebElement bookstoreLink;
	
	
	@FindBy(id="searchInput")
	public WebElement searchinputbox;
	
	
	
	@FindBy(xpath = "//button[contains(text(),'Search')]")
	public WebElement searchbutton;
	
	
	@FindBy(xpath = "//tr[td[contains(text(),'Lee Child')]][td[contains(text(),'Dell')]]/td[contains(text(),'$17')]")
	public WebElement rowdatatxt;
	
	
	
	public BookStoreApplicationPage()
	{
		
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	CommonFunction function=new CommonFunction();
	public void movetobookStorePage()
	{
		
		function.click(bookstoreapplicationLink, "Book Store Application Link");
		function.click(bookstoreLink, "Book Store Link");
		
	}
	
	public void searchData()
	{
		
		function.enterData(searchinputbox, "Dell", "Dell");
		function.click(searchbutton, "search button");
		function.checkElementPresence(rowdatatxt, "All row data is displaying");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
