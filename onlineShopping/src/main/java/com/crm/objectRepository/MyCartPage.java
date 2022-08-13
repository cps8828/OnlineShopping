package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyCartPage {
      
	//initialization...........
	public MyCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//declaration.............
	@FindBy(xpath = "//input[@type='checkbox']") private WebElement chechBox;
	
	@FindBy(xpath = "//a[text()='Continue Shopping']") private WebElement continueShoppingBtn;
	
	@FindBy(xpath = "//input[@name='submit']") private WebElement updateShoppingBtn;
	
	@FindBy(name = "billingaddress") private  WebElement billingAddress;
	
	@FindBy(id = "bilingstate") private WebElement billingState;
	
	@FindBy(id = "billingcity") private WebElement billingCity;
	
	@FindBy(id = "billingpincode") private WebElement billingPinCode;
	
	@FindBy(xpath = "//span[text()='Shipping Address']/../../../../..//button") private WebElement shippingUpdateBtn;
	
	@FindBy(name = "shippingaddress") private WebElement shippingAddress;
	
	@FindBy(id = "shippingstate") private WebElement shippingState;
	
	@FindBy(id = "shippingcity") private WebElement shippingCity;
	
	@FindBy(id = "shippingpincode") private WebElement shippingPinCode;
	
	@FindBy(xpath = "//span[text()='Billing Address']/../../../../..//button") private WebElement billingUpdateBtn;
	
	@FindBy(xpath = "//button[text()='PROCCED TO CHEKOUT']") private WebElement checkoutBtn;

	public WebElement getChechBox() {
		return chechBox;
	}

	public WebElement getContinueShoppingBtn() {
		return continueShoppingBtn;
	}

	public WebElement getUpdateShoppingBtn() {
		return updateShoppingBtn;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getBillingState() {
		return billingState;
	}

	public WebElement getBillingCity() {
		return billingCity;
	}

	public WebElement getBillingPinCode() {
		return billingPinCode;
	}

	public WebElement getShippingUpdateBtn() {
		return shippingUpdateBtn;
	}

	public WebElement getShippingAddress() {
		return shippingAddress;
	}

	public WebElement getShippingState() {
		return shippingState;
	}

	public WebElement getShippingCity() {
		return shippingCity;
	}

	public WebElement getShippingPinCode() {
		return shippingPinCode;
	}

	public WebElement getBillingUpdateBtn() {
		return billingUpdateBtn;
	}

	public WebElement getCheckoutBtn() {
		return checkoutBtn;
	}
	
	//shipping address.......
	
	public void toBilling(String billAddressName, String billingStateName, String billingCityName, String  bllingPinCode ) {
		billingAddress.clear();
		billingState.clear();
		billingCity.clear();
		billingPinCode.clear();
		billingUpdateBtn.click();
		
		
		
		billingAddress.sendKeys(billAddressName);
		billingState.sendKeys(billingStateName);
		billingCity.sendKeys(billingCityName);
		billingPinCode.sendKeys(bllingPinCode);
		billingUpdateBtn.click();
	}
	
	//billing address.........
	
	public void toShipping(String shipAddressName, String shippingStateName, String shippingCityName, String shipingPinCode) {
		shippingAddress.clear();
		shippingState.clear();
		shippingCity.clear();
		shippingPinCode.clear();
		shippingUpdateBtn.click();
		
		
		
		shippingAddress.sendKeys(shipAddressName);
		shippingState.sendKeys(shippingStateName);
		shippingCity.sendKeys(shippingCityName);
		shippingPinCode.sendKeys(shipingPinCode);
		shippingUpdateBtn.click();
	}
	
	


}
