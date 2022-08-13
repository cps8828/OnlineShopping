package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {

	//declaration

	//==============================Declaration of Elements================================	


	@FindBy(name = "submit")
	private WebElement submitBtn;

	//==============================================================================================	

	//initialization

	public PaymentPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Utilization

	//===============================Utilization for Sign In======================================

	public WebElement getSubmitBtn()
	{
		return submitBtn;
	}
	

}
