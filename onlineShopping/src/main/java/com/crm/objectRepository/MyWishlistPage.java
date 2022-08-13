package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyWishlistPage {


	//==============================Declaration of Forgot Your Password=============================


	@FindBy(xpath = "//div[@class='product-name']//a[text()='Micromax 81cm (32) HD Ready LED TV  (32T6175MHD, 2 x HDMI, 2 x USB)']")
	private WebElement micromax81cmProduct;

	@FindBy(xpath = "//div[@class='product-name']//a[text()='SAMSUNG Galaxy On5']")
	private WebElement samsungProduct;

	//==============================================================================================	

	//initialization

	public MyWishlistPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//==============================================================================================

	//Utilization

	//===============================Utilization for Sign In======================================

	public WebElement getMicromax81cmProduct()
	{
		return micromax81cmProduct;
	}

	public WebElement getSamsungProduct()
	{
		return samsungProduct;
	}


}
