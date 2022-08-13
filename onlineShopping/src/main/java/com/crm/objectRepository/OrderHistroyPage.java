package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Declaration
public class OrderHistroyPage
{
@FindBy(xpath="//tr/td[text()='2']/../td/h4/a[contains(.,'The Wimpy Kid Do -It- Yourself Book')]")private WebElement product1;

//Initialisation
public OrderHistroyPage(WebDriver driver)
{
PageFactory.initElements(driver, this);	
}

//Utilisation
public WebElement getProduct1()
{
	return product1;
}
public String getTextOfProduct()
{
	String productText = product1.getText();
	return productText;	
}
}
