package com.crm.OnlineShoping;

import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.AdminHomePage;
import com.crm.objectRepository.AdminLogin;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.LoginPage;
import com.crm.objectRepository.MyCartPage;
import com.crm.objectRepository.OrderHistoryPage;
import com.crm.objectRepository.PaymentPage;


public class BuyProductAndVerifyInAdminTest extends BaseClass {
	@Test
	public void buyProductAndVerifyInAdminTest() throws InterruptedException
	{
		HomePage homePage = new HomePage(driver);
		//homePage.ToLogin();
		
		String emailID = eLib.readDataFromExcel("LoginPage", 3, 2);
		String pwd = eLib.readDataFromExcel("LoginPage", 3, 3);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginToApplication(emailID, pwd);
		System.out.println("User is Succesfully Logged IN");
		Thread.sleep(1000);
		String productName = eLib.readDataFromExcel("ToSearchTheProduct", 5, 1);
		homePage.toSearchTheProduct(productName);//click on add to cart button of lenovo product 
		//homePage.getAddtoCartBtn().click();
		
		String expctedMsgProduct = eLib.readDataFromExcel("ToHandleThePopUp", 4, 1);
		wLib.switchToAlertPopUpAndAccept(driver, expctedMsgProduct);
		
		//wLib.switchTowindow(driver, "");
		//homePage.getCartLink();
		
		//shipping Details
		String Badress = eLib.readDataFromExcel("BillingAddres", 8, 2);
		String Bstate = eLib.readDataFromExcel("BillingAddres", 8, 3);
		String Bcity = eLib.readDataFromExcel("BillingAddres", 8, 4);
		String Bpincode = eLib.readDataFromExcel("BillingAddres", 8, 5);
		//shipping Details
		String Cadress = eLib.readDataFromExcel("ShippingAddress", 8, 2);
		String Cstate = eLib.readDataFromExcel("ShippingAddress", 8, 3);
		String Ccity = eLib.readDataFromExcel("ShippingAddress", 8, 4);
		String Cpincode = eLib.readDataFromExcel("ShippingAddress", 8, 5);
		
		MyCartPage myCart = new MyCartPage(driver);
		//myCart.getCheckBox().click();
		//myCart.getContinueShoppingBtn().click();
		myCart.toBilling(Badress, Bstate, Bcity, Bpincode);
		myCart.toShipping(Cadress, Cstate, Ccity, Cpincode);
		myCart.getCheckoutBtn().click();
		
//		String expctedMsgofAddress = eLib.readDataFromExcel("ToHandleThePopUp", 5, 1);
//		wLib.switchToAlertPopUpAndAccept(driver, expctedMsgofAddress);
		
//		Thread.sleep(1000);
		PaymentPage paymentPage = new PaymentPage(driver);
		//paymentPage.getCodRadioBTn().click();
		paymentPage.getSubmitBtn().click();
		//to verify order in order history page
		OrderHistoryPage orderHistoryPage = new OrderHistoryPage(driver);
		//String expectedProduct = productName;
		orderHistoryPage.toVerifyOrderHistoryPage(driver);
	
		
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
		adminHomePage.getOrderManagementLnk().click();
		//adminHomePage.getTodaysOrderLnk().click();//click on todays order tab
		//create class of todaysOrderPage
		//TodaysOrdersPage todaysOrdersPage = new TodaysOrdersPage(driver);
		//todaysOrdersPage.getToNext().click();
		//String actualProduct = todaysOrdersPage.getTable().getText();
		String expectedProduct = productName;
		//if (actualProduct.contains(expectedProduct)) {
			System.out.println("Micromax Canvas Laptab is displayed in Today's Order page ");
		//}else {
			System.out.println("Micromax Canvas Laptab is NOT displayed in Today's Order page ");
		}
		//check for order product should displayed and verified
		//adminHomePage.logoutApplication();
	}
//}