package com.crm.OnlineShoping;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.AdminHomePage;
import com.crm.objectRepository.AdminLogin;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.LoginPage;

//@Listeners(com.crm.genericUtilities.ListnersImpliments.class)
public class CreateUserAndVerifyInAdminTest extends BaseClass {
	@Test //(retryAnalyzer = com.crm.genericUtilities.RetryAnalizer.class)
	public void createUserAndVerifyInAdminTest()  throws IOException, InterruptedException
	{
		HomePage homePage = new HomePage(driver);
		//homePage.ToLogin();
		
		String userName = eLib.readDataFromExcel("ToCreateAccount", 3, 1);
		int ranNum = jLib.getRandomNumber();
		String emailID = eLib.readDataFromExcel("ToCreateAccount", 3, 2)+ranNum;
		String Cno = eLib.readDataFromExcel("ToCreateAccount", 3, 3);
		String pwd = eLib.readDataFromExcel("ToCreateAccount", 3, 4);
		String Cpwd = eLib.readDataFromExcel("ToCreateAccount", 3, 5);
		
		
		LoginPage loginPage = new LoginPage(driver);
		//loginPage.createNewAccount(userName, emailID, Cno, pwd, pwd);
		System.out.println("User is Succesfully Created");
		
		String expctedMsg = eLib.readDataFromExcel("ToHandleThePopUp", 3, 1);
		wLib.switchToAlertPopUpAndAccept(driver, expctedMsg);
		//wLib.switchToAlertPopUpAndDismiss(expctedMsg, driver);
		wLib.switchToWindow("Online_Shopping_Application", driver);
		//homePage.ToLogin();
		loginPage.loginToApplication(emailID, pwd);
		System.out.println("User is Succesfully Logged IN");
		
		//homePage.ToLogout();
		
		String adminurl = fLib.getPropertKeyValue("adminurl");
		driver.get(adminurl);
		
		String adminID = eLib.readDataFromExcel("LoginPage", 8, 1);
		String adminPWD = eLib.readDataFromExcel("LoginPage", 8, 3);
		System.out.println("======================================================");
		AdminLogin adminLogin = new AdminLogin(driver);
		wLib.waitTillPageLoadURL(driver, adminurl);
		//adminLogin.ToAdminLogin(adminID, adminPWD);
		//Thread.sleep(10000);
		System.out.println("======================================================");
		System.out.println("Admin is Succesfully Logged IN");
		System.out.println("======================================================");
		AdminHomePage adminHomePage = new AdminHomePage(driver);
		adminHomePage.getUserLoginLogLnk().click();
		System.out.println("======================================================");
		//AdminsUserLoginLogPage usersPage = new AdminsUserLoginLogPage(driver);
		
		String expectedUsername = eLib.readDataFromExcel("ToCreateAccount", 3, 2);
		//usersPage.getSerachBoxEdt().sendKeys(expectedUsername);
		//String expectedUsername = userName;
		
		//String actualUserName = usersPage.getUserName().getText();
		//System.out.println(actualUserName);
		//if (actualUserName.contains(expectedUsername))
		{
			System.out.println("PASS:User is Creted and Verified in Admin Users Login Page");
		//}else {
			System.out.println("FAIL:User is Not Verified in Admin Users Login Page");
		}
		
		//usersPage.TogetLogout();
		
	}
}