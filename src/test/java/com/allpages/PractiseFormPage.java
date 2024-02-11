package com.allpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maindriver.TestBase;
import com.utilties.CommonFunction;

public class PractiseFormPage extends TestBase {




	@FindBy(xpath = "//a[contains(text(),'Forms')]")
	public WebElement formsLink;


	@FindBy(xpath = "//span[contains(text(),'Practice Form')]")
	public WebElement practicseformLink;


	@FindBy(name="name-1-first-name")
	public WebElement firstnametxtbox;


	@FindBy(name="name-1-last-name")
	public WebElement lastnametxtbox;


	@FindBy(name="email-1")
	public WebElement emailtxtbox;


	@FindBy(xpath = "(//label[input[@value='one']])[1]")
	public WebElement maleradiobutton;


	@FindBy(name="phone-1")
	public WebElement phonenumbertxtbox;

	@FindBy(name="date-1")
	public WebElement datetxtbox;


	@FindBy(xpath = "(//span[@class='select2-selection select2-selection--single'])[1]")
	public WebElement subjectLink;


	@FindBy(xpath = "//li[contains(text(),'English')]")
	public WebElement englishlink;


	@FindBy(xpath = "//span[contains(text(),'Sports')]")

	public WebElement sportscheckbox;


	@FindBy(xpath = "//input[@name='upload-1']")

	public WebElement uploadfilelink;


	@FindBy(xpath = "//textarea[@placeholder='Current Address']")
	public WebElement currentaddresstxtbox;



	@FindBy(name="address-1-city")
	public WebElement citytxtbox;


	@FindBy(name="address-1-state")
	public WebElement statetxtbox;


	@FindBy(xpath = "(//span[@class='select2-selection select2-selection--single'])[2]")
	public WebElement selectcountryLink;

	@FindBy(xpath = "//li[contains(text(),'Afghanistan')]")
	public WebElement afganistanLink;

	@FindBy(xpath = "//button[contains(text(),'Send Message')]")
	public WebElement sendmessagebutton;



	public PractiseFormPage()

	{
		PageFactory.initElements(driver, this);

	}

	CommonFunction function=new CommonFunction();

	public void submitForm()

	{

		function.click(formsLink, "Form link");
		function.click(practicseformLink, "Practicse form Link");
		function.enterData(firstnametxtbox, "Sachin", "Sachin");
		function.enterData(lastnametxtbox, "test", "test");
		function.enterData(emailtxtbox, "Sachin123@gmail.com", "Sachin123@gmail.com");
		function.click(maleradiobutton, "Male radio button");
		function.enterData(phonenumbertxtbox, "123123123", "123123123");
		function.enterData(datetxtbox, "11/02/1984", "11/02/1984");
		function.click(subjectLink, "subject link");
		function.click(englishlink, "english link");
		function.click(sportscheckbox, "sports checkbox");

		String path=System.getProperty("user.dir")+"\\uploadfiles\\Sample.txt";
		function.enterData(uploadfilelink, path, path);
		function.enterData(currentaddresstxtbox, "London UK", "London UK");
		function.enterData(citytxtbox, "London", "London ");
		function.enterData(statetxtbox, "UK", "UK");
		function.click(selectcountryLink, "country link");
		function.click(afganistanLink, "Afganistan Link");
		function.click(sendmessagebutton, "send message");











	}
















































































}
