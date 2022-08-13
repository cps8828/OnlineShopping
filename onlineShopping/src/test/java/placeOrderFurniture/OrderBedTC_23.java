package placeOrderFurniture;

import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.FurniturePage;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.LoginPage;
import com.crm.objectRepository.MyCartPage;

import com.crm.objectRepository.*;


public class OrderBedTC_23 extends BaseClass {


	@Test

	public void orderBed() throws Throwable{

		//Fetch Shipping Address Data from Excel Sheet
		String billingAddress=eLib.readDataFromExcel("Furniture", 1, 0);
		String billingState=eLib.readDataFromExcel("Furniture", 1, 1);
		String billingCity=eLib.readDataFromExcel("Furniture", 1, 2);
		String billingPincode=eLib.readDataFromExcel("Furniture", 1, 3);


		//Fetch Billing Address data from excel sheet
		String shippingAddress=eLib.readDataFromExcel("Furniture", 1, 4);
		String shippingState=eLib.readDataFromExcel("Furniture", 1, 5);
		String shippingCity=eLib.readDataFromExcel("Furniture", 1, 6);
		String shippingPincode=eLib.readDataFromExcel("Furniture", 1, 7);
		
		HomePage hpage = new HomePage(driver);
		hpage.getFurnitureTab().click();
		
		FurniturePage fPage = new FurniturePage(driver);
		fPage.getBedsLink().click();
		
		fPage.getAddToCartLink().click();
		String alertmsg = fLib.getPropertKeyValue("AlertMsg");
		fPage.HandleAlertPopup(driver, alertmsg);
		
		MyCartPage mcp= new MyCartPage(driver);
		mcp.getBillingAddress();
	
		
		mcp.toBilling("Furniture", alertmsg, alertmsg, alertmsg);
		
		

//		launchTheBrowser();
//		
//
//		String USERNAME = null;
//		try {
//			USERNAME = fLib.getPropertKeyValue("username");
//		} catch (Throwable e) {
//			e.printStackTrace();
//		}
//		String PASSWORD = null;
//		try {
//			PASSWORD = fLib.getPropertKeyValue("password");
//		} catch (Throwable e) {
//			e.printStackTrace();
//		}
//		
//		
//		//Enter the Username, password and Click on login Button
//		LoginPage loginPage = new LoginPage(driver);
//		loginPage.loginToApplication(USERNAME, PASSWORD);
//		System.out.println("Login To Application Successful");
		//Click On furniture tab Page
		//HomePage hpage = new HomePage(driver);
		//hpage.getFurnitureTab().click();
		//System.out.println("Click On Furniture Link");


		//Add IPhone6 to Cart
		FurniturePage furniturePage = new FurniturePage(driver);
		//wLib.scrollBarAction(driver);
		furniturePage.getBedsLink().click();
		System.out.println("Add bed to Cart Successful");
		
		driver.switchTo().alert().accept();
		
		//Thread.sleep(20000);
        MyCartPage myCartPage = new MyCartPage(driver);
		myCartPage.getBillingAddress().sendKeys(billingAddress);
		myCartPage.getBillingCity().sendKeys(billingCity);
		myCartPage.getBillingState().sendKeys(billingState);
		myCartPage.getBillingPinCode().sendKeys(billingPincode);

		//Fill the Shipping Address

		myCartPage.getShippingAddress().sendKeys(billingAddress);
		myCartPage.getShippingCity().sendKeys(billingCity);
		myCartPage.getShippingState().sendKeys(billingState);
		myCartPage.getShippingPinCode().sendKeys(billingPincode);

		myCartPage.getCheckoutBtn().click();
		//Select Payment Mode
		// paymentPage = new PaymentPage(driver);
		//paymentPage.getSubmitBtn().click();
		hpage.getLogoutBtn();
		driver.quit();

	}



}
