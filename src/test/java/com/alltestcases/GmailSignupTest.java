package com.alltestcases;

import org.testng.annotations.Test;

import com.allpages.GmailSignupPage;
import com.maindriver.TestBase;

public class GmailSignupTest extends TestBase {
	
	
	
	@Test
	public void checkErrorMessage()
	{
		
		createcurrentNode("checkErrorMessage");
		GmailSignupPage page=new GmailSignupPage();
		page.checkLoginErrormessage();
		
	}

}
