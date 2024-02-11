package com.alltestcases;

import org.testng.annotations.Test;

import com.flipkartPages.ChecWelcomePage;
import com.maindriver.TestBase;
import com.utilties.CommonFunction;

public class FlipkartLoginTest extends TestBase {

	
	@Test
	public void checkhomePage()
	{
		
		createcurrentNode("checkhomePage");
		ChecWelcomePage page=new ChecWelcomePage();
		page.checkFlipkartHomePage();
		
		
		
	}
	
}
