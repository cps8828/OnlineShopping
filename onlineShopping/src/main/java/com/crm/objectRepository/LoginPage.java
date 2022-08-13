package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author Sukesh
 *This Page Contains WebElements of Login Page
 */
public class LoginPage {
	
										//declaration
	
//==============================Declaration of Sign In Elements================================	
	
	@FindBy(name = "email")
	private WebElement userEmailTextEdt;
	
	@FindBy(name = "password")
	private WebElement passwordtxtEdt;

	@FindBy(name = "login")
	private WebElement loginBtn;
	
//==============================Declaration of Forgot Your Password=============================
	
	
	@FindBy(xpath = "//a[@class='forgot-password pull-right']")
	private WebElement forgotPasswordLnk;
	

//==============================Declaration For Create New Account Elements======================
	
	@FindBy(id = "fullname")
	private WebElement fullNameTxtEdt;
	
	@FindBy(name = "emailid")
	private WebElement emailForNewAccountTxtEdt;

	@FindBy(name = "contactno")
	private WebElement contactNoForNewAccountTxtEdt;
	
	@FindBy(id = "password")
	private WebElement passwordForNewAccountTxtEdt;
	
	@FindBy(name = "confirmpassword")
	private WebElement confirmPasswordForNewAccountTxtEdt;

	@FindBy(name = "submit")
	private WebElement submitBtnForNewAccount;
	
//==============================================================================================	
									
										//initialization
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//==============================================================================================
	
									//Utilization
	
//===============================Utilization for Sign In======================================
	
	public WebElement getEmailTextEdt()
	{
		return userEmailTextEdt;
	}

	public WebElement getPasswordTxtEdt() {
		return passwordtxtEdt;
	}

	public WebElement getSubmitBtn() {
		return loginBtn;
	}

	//=======================Utilization for Get Password==========================================
	
	public WebElement getForgotPasswordLnk() {
		return forgotPasswordLnk;
	}
	
	//========================Utilization for Create a New Account==================================
	
	
	public WebElement getFullNameTxtEdt()
	{
		return fullNameTxtEdt;
	}

	public WebElement getEmailForNewAccountTxtEdt() {
		return emailForNewAccountTxtEdt;
	}

	public WebElement getPasswordForNewAccountTxtEdt() {
		return passwordForNewAccountTxtEdt;
	}

	public WebElement getConfirmPasswordForNewAccountTxtEdt() {
		return confirmPasswordForNewAccountTxtEdt;
	}

	public WebElement getSubmitBtnForNewAccount() {
		return submitBtnForNewAccount;
	}
	
	

	//==============================================================================================

	/**
	 * 
	 * @param username
	 * @param password
	 * click on submit button
	 */
	public void clickLogin() {
		
	}

	public void loginToApplication(String username,String password)
	{
		userEmailTextEdt.sendKeys(username);
		passwordtxtEdt.sendKeys(password);
		loginBtn.click();
	}
//	
//	public void createNewAccount(String fullname, String email, String contactno, String password, String confirmpassword ) {
//		fullNameTxtEdt.sendKeys(fullname);
//		emailForNewAccountTxtEdt.sendKeys(email);
//		contactNoForNewAccountTxtEdt.sendKeys(contactno);
//		passwordForNewAccountTxtEdt.sendKeys(password);
//		confirmPasswordForNewAccountTxtEdt.sendKeys(confirmpassword);
//	}
}
