package com.alltestcases;

import org.testng.annotations.Test;

import com.flipkartPages.CheckAllDataOfLoginPage;
import com.maindriver.TestBase;

public class FlipkartLoginElementTest extends TestBase{
	
	
	
	@Test
	public void flipkartLoginElement()
	{
		
		createcurrentNode("flipkartLoginElement");
	
		CheckAllDataOfLoginPage page=new CheckAllDataOfLoginPage();
		page.checkElementofLoginPage();
		
	}

}
