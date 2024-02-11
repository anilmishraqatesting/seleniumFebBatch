package com.alltestcases;

import org.testng.annotations.Test;

import com.allpages.LoginPage;
import com.allpages.PractiseFormPage;
import com.maindriver.TestBase;

public class PracticseFormTest extends TestBase{
	
	
	
	@Test
	public void sendForm()
	{
		
		createcurrentNode("sendForm");
		LoginPage loginpage=new LoginPage();
		loginpage.login();
		PractiseFormPage page=new PractiseFormPage();
		page.submitForm();
		
	}

}
