package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderHistoryPage {

	//01initialization
	@FindBy(xpath = "//li[text()='Shopping Cart']") private WebElement shopingCartEle;
	
	//02declaration
	public OrderHistoryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//03utlization
	public void toVerifyOrderHistoryPage(WebDriver driver)
	{
		String actualTitle = driver.getTitle();
		String expectedTitle = "OrderHistory";
		if (actualTitle.contains(expectedTitle)) {
			System.out.println("Title is Verified");
		}else {
			System.out.println("Title is not Verified");
		}
	}
}
