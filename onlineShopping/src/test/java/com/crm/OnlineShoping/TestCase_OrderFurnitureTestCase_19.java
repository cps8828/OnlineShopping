package com.crm.OnlineShoping;


import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.FurniturePage;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.MyCartPage;
import com.crm.objectRepository.PaymentPage;
@Listeners(com.crm.genericUtilities.ItestListenerImtn.class)
public class TestCase_OrderFurnitureTestCase_19 extends BaseClass{


	@Test
	public void clickOnFurniture() {
		HomePage hpage = new HomePage(driver);
		hpage.getFurnitureTab().click();

		FurniturePage fPage = new FurniturePage(driver);
		fPage.getBedsLink().click();

		fPage.getAddToCartLink().click();
		String alertmsg = fLib.getPropertKeyValue("AlertMsg");
		fPage.HandleAlertPopup(driver, alertmsg);
		Reporter.log("popup is verified",true);

		MyCartPage mcp= new MyCartPage(driver);
		
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


		mcp.toBilling(billingAddress,billingState,billingCity,billingPincode);
		String alertmsg1 = fLib.getPropertKeyValue("AlertMsg1");
		fPage.HandleAlertPopup(driver, alertmsg1);
		Reporter.log("billing popup is verified",true);
		
		mcp.toShipping(shippingAddress, shippingState, shippingCity, shippingPincode);

		
		String alertmsg2 = fLib.getPropertKeyValue("AlertMsg2");
		fPage.HandleAlertPopup(driver, alertmsg2);
		Reporter.log("shipping popup is verified",true);
		
		
	    mcp.getCheckoutBtn().click();
	    PaymentPage pp = new  PaymentPage(driver);
	    pp.getSubmitBtn().click();
	    
	    fPage.verify();
	    String confirmpage = fLib.getPropertKeyValue("confirmpage");
		fPage.HandleAlertPopup(driver, confirmpage);
		Reporter.log("confirm page is verified",true);
		
		
		}


}