package com.alltestcases;

import org.testng.annotations.Test;

import com.allpages.LoginPage;
import com.flipkartPages.BookStoreApplicationPage;
import com.flipkartPages.PurchaseBookPage;
import com.maindriver.TestBase;

public class BookStoreTest extends TestBase {


	@Test
	public void bookStoreTest()
	{

		createcurrentNode("bookStoreTest");
		LoginPage loginpage=new LoginPage();
		loginpage.login();
		
		BookStoreApplicationPage page=new BookStoreApplicationPage();
		page.movetobookStorePage();
		page.searchData();
		
		PurchaseBookPage book=new PurchaseBookPage();
		book.processPayment();
		
	}

}
