package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.WebDriverUtility;

public class MyCartPage1 extends WebDriverUtility
{
	//Declaration
	//Billing Address
	@FindBy(xpath="//a[text()='Continue Shopping']") private WebElement continueShoppingBtn;
	@FindBy(xpath="//button[@name='ordersubmit']") private WebElement proceedToCheckOut;
	@FindBy(name="submit")private WebElement submitBtn;
	
	@FindBy(name="billingaddress")private WebElement billingAddressTxtFld;
	@FindBy(id="bilingstate") private WebElement billingStateTxtFld;
	@FindBy(id="billingcity") private WebElement billingCityTxtFld;
	@FindBy(id="billingpincode") private WebElement pinCodeTxtFld;
	@FindBy(name="update") private WebElement billingupdateBtn;
	//Shipping Address
	@FindBy(name="shippingaddress") private WebElement shippingAddressTxtField;
	@FindBy(id="shippingstate")private WebElement shippingStateTxtField;
	@FindBy(id="shippingcity")private WebElement shippingCityTxtField;
	@FindBy(id="shippingpincode")private WebElement shippingPincodeTxtField;
	@FindBy(name="shipupdate")private WebElement shippingUpdateBtn;
	@FindBy(xpath="//a[@class='entry-thumbnail']/parent::td/following-sibling::td[@class='cart-product-name-info']/descendant::a")
	private WebElement textOfCart;
	
	//Initialization
	public MyCartPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilisation
	public void enterShippingAddress(String doorNo,String state,String city,String pincode)
	{
		
		billingAddressTxtFld.clear();
		billingStateTxtFld.clear();
		billingCityTxtFld.clear();
		pinCodeTxtFld.clear();
		billingupdateBtn.click();
		billingAddressTxtFld.sendKeys(doorNo);
		billingStateTxtFld.sendKeys(state);
		billingCityTxtFld.sendKeys(city);
		pinCodeTxtFld.sendKeys(pincode);
		billingupdateBtn.click();
	}
	public String handleAlertPOPup(WebDriver driver,String expectedMsg)
	{
		switchToAlertPopUpAndAccept(driver,expectedMsg);
		return expectedMsg;
	}
	public void enterBillingAddress(String doorNo,String state,String city,String pincode)
	{
		shippingAddressTxtField.clear();
		shippingStateTxtField.clear();
		shippingCityTxtField.clear();
		shippingPincodeTxtField.clear();
		shippingUpdateBtn.click();
		
		shippingAddressTxtField.sendKeys(doorNo);
		shippingStateTxtField.sendKeys(state);
		shippingCityTxtField.sendKeys(city);
		shippingPincodeTxtField.sendKeys(pincode);
		shippingUpdateBtn.click();
	
	}
	public String handleAlertPOPupShipping(WebDriver driver,String expectedMsg)
	{
		switchToAlertPopUpAndAccept(driver,expectedMsg);
		return expectedMsg;
	}
	
	public void clickOnProceedToChecOut()
	{
		proceedToCheckOut.click();
	}
	
	public void  clickOnSubmit()
	{
		submitBtn.click();
	}
	public String getTextOfCartPage()
	{
		String cartText = textOfCart.getText();
		return cartText;
	}
}

