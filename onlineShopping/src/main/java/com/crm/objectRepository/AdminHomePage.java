package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminHomePage {
       
	//initialization
	public AdminHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	
	@FindBy(xpath = "//a[text()=' Create Category ']") private WebElement createCategoryLnk;
	
	@FindBy(xpath = "//a[text()='Sub Category ']") private WebElement subCategoryLnk;
	
	@FindBy(xpath = "//a[text()='Insert Product ']") private WebElement insertProductLnk;
	
	@FindBy(xpath = "//a[text()='User Login Log ']") private WebElement UserLoginLogLnk;
	
	@FindBy(xpath = "//a[text()='Manage Products ']") private WebElement manageProductLnk;
	
	@FindBy(xpath = "//i[@class='menu-icon icon-signout']") private WebElement LogoutLnk;
	
	@FindBy(xpath = "//a[@class='collapsed']") private WebElement orderManagementLnk;
	
	@FindBy(xpath = "//i[@class='menu-icon icon-group']") private WebElement manageUsers;
	
	@FindBy(name = "password") private WebElement currentPasswordTxt;
	
	@FindBy(name = "newpassword") private WebElement newPasswordTxt;
	
	@FindBy(name = "confirmpassword") private WebElement confirmPasswordTxt;
	
	@FindBy(name = "submit") private WebElement submitBtn;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle']") private WebElement dropdownLnk;
	
	@FindBy(xpath = "//a[text()='Change Password']") private WebElement changePasswordLnk;
	
	@FindBy(xpath = "//a[text()='Logout']") private WebElement lgoutLnk;

	public WebElement getCreateCategoryLnk() {
		return createCategoryLnk;
	}

	public WebElement getSubCategoryLnk() {
		return subCategoryLnk;
	}

	public WebElement getInsertProductLnk() {
		return insertProductLnk;
	}

	public WebElement getUserLoginLogLnk() {
		return UserLoginLogLnk;
	}

	public WebElement getManageProductLnk() {
		return manageProductLnk;
	}

	public WebElement getLogoutLnk() {
		return LogoutLnk;
	}

	public WebElement getOrderManagementLnk() {
		return orderManagementLnk;
	}

	public WebElement getManageUsers() {
		return manageUsers;
	}

	public WebElement getCurrentPasswordTxt() {
		return currentPasswordTxt;
	}

	public WebElement getNewPasswordTxt() {
		return newPasswordTxt;
	}

	public WebElement getConfirmPasswordTxt() {
		return confirmPasswordTxt;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getDropdownLnk() {
		return dropdownLnk;
	}

	public WebElement getChangePasswordLnk() {
		return changePasswordLnk;
	}

	public WebElement getLgoutLnk() {
		return lgoutLnk;	
	}
	
	public void logoutToApplication() {
		dropdownLnk.click();
		lgoutLnk.click();
		
	}
	
}
