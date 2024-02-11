package com.alltestcases;

import org.testng.annotations.Test;

import com.allpages.LoginPage;
import com.maindriver.TestBase;

public class LoginTest extends TestBase {
	
	
	
	@Test
	public void logincase()
	{
		
		createcurrentNode("Login");
		LoginPage page=new LoginPage();
		
		page.login();
		
		
		
		
	}

}
