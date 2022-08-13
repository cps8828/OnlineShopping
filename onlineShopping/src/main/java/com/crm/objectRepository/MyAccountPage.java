package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	
	//01 initialzation
	//home and checkout links
	@FindBy(xpath = "//div[@class='breadcrumb-inner']/ul/li/a") private WebElement homeLink;
	@FindBy(xpath = "//a[text()='Home']/../following-sibling::li[text()='Checkout']") private WebElement checkOutLink;
	
	//update MyProfile details
	@FindBy(id = "name") private WebElement userNameEdt;
	@FindBy(id = "exampleInputEmail1") private WebElement emailEdit;
	@FindBy(id = "contactno") private WebElement contactEdt;
	@FindBy(xpath = "//button[text()='Update']") private WebElement upadateBtn;
	
	//change password details
	@FindBy(xpath = "//a[contains(.,'Change Password')]") private WebElement changePwdEdt;
	@FindBy(id="cpass") private WebElement currentPwdEdt;
	@FindBy(id="newpass") private WebElement newPwdEdt;
	@FindBy(id="cnfpass") private WebElement confirmPwdEdt;
	@FindBy(xpath = "//button[text()='Change ']") private WebElement changePwdBtn;
	
	//Your checkOut Details
	@FindBy(xpath = "//h4[text()='Your Checkout Progress']/../following-sibling::div/ul/li/a[text()='My Account']")
	private WebElement myAcntLink;
	@FindBy(xpath = "//a[text()='Shipping / Billing Address']")
	private WebElement shippingAdressLink;
	@FindBy(xpath = "//a[text()='Order History']")
	private WebElement orderHistryLink;
	@FindBy(xpath = "//a[text()='Payment Pending Order']")
	private WebElement paymentPendinOrderlink;
	
	
	//02declaration
	public  MyAccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//03 utilization
	public WebElement getHomeLink() {
		return homeLink;
	}


	public WebElement getCheckOutLink() {
		return checkOutLink;
	}


	public WebElement getUserNameEdt() {
		return userNameEdt;
	}


	public WebElement getEmailEdit() {
		return emailEdit;
	}


	public WebElement getContactEdt() {
		return contactEdt;
	}


	public WebElement getUpadateBtn() {
		return upadateBtn;
	}


	public WebElement getChangePwdEdt() {
		return changePwdEdt;
	}


	public WebElement getCurrentPwdEdt() {
		return currentPwdEdt;
	}


	public WebElement getNewPwdEdt() {
		return newPwdEdt;
	}


	public WebElement getConfirmPwdEdt() {
		return confirmPwdEdt;
	}


	public WebElement getChangePwdBtn() {
		return changePwdBtn;
	}


	public WebElement getMyAcntLink() {
		return myAcntLink;
	}


	public WebElement getShippingAdressLink() {
		return shippingAdressLink;
	}


	public WebElement getOrderHistryLink() {
		return orderHistryLink;
	}


	public WebElement getPaymentPendinOrderlink() {
		return paymentPendinOrderlink;
	}

	//04
	//metod for To update the user details
	public void toUpdateMyprofile(String userName, String contactNumber)
	{
		userNameEdt.sendKeys(userName);
		contactEdt.sendKeys(contactNumber);
		upadateBtn.click();	
	}
	
	//method for TO change the user password
	public void toChangeThePassword(String currentPwd,String newPwd,String confirmPwd)
	{
		currentPwdEdt.sendKeys(currentPwd);
		newPwdEdt.sendKeys(newPwd);
		confirmPwdEdt.sendKeys(confirmPwd);
		changePwdBtn.click();
	}
}
