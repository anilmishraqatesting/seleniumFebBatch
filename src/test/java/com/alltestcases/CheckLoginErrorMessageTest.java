package com.alltestcases;

import org.testng.annotations.Test;

import com.flipkartPages.CheckLoginErrorMessage;
import com.maindriver.TestBase;

public class CheckLoginErrorMessageTest extends TestBase {




	@Test
	public void checkErrorMessage()

	{

		createcurrentNode("checkErrorMessage");
		CheckLoginErrorMessage page=new CheckLoginErrorMessage();

		page.checkAllerrorMessage();

		page.checkwrongmobilenumberErrorMessage();
        page.checkpostiveScenario();

	}





}
