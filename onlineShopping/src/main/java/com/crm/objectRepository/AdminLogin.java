package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLogin {
     
	//initialization
	public AdminLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//declaration......
	@FindBy(name = "username") private WebElement usernameTxt;
	
	@FindBy(name = "password") private WebElement passwordTxt;
	
	@FindBy(name = "submit") private WebElement loginBtn;
	
	//utilization
	public WebElement getAdminUsernaame() {
		return usernameTxt;
	}
	
	public WebElement getAdminPassword() {
		return passwordTxt;
	}
	public WebElement getAdminLoginBtn() {
		return loginBtn;
	}
	
	public void adminLogin(String username, String password) {
		usernameTxt.sendKeys(username);
		passwordTxt.sendKeys(password);
		loginBtn.click();
	}
}
