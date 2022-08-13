package com.crm.OnlineShoping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.BooksCategoryPage;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.HomePage1;
import com.crm.objectRepository.MyCartPage;
import com.crm.objectRepository.MyCartPage1;
import com.crm.objectRepository.OrderHistroyPage;
@Listeners(com.crm.genericUtilities.ItestListenerImtn.class)
public class AddToCartBookAndVerifyTest extends BaseClass 
{
	@Test
	public void addBookToCart()
	{
		HomePage1 homePage = new HomePage1(driver);
		wLib.waitForPageToLoad(driver);

		homePage.clickOnBook();
		BooksCategoryPage bookCatogoryPage = new BooksCategoryPage(driver);
		bookCatogoryPage.clickWimpAddToCart();
		String alertMsg = fLib.getPropertKeyValue("alertMsg");
		bookCatogoryPage.handleAlertPopup(driver, alertMsg);
		//fetch data from excelSheet
		String shipAddress = eLib.readDataFromExcel("Biiling&Shipping", 1, 0);
		String shipState = eLib.readDataFromExcel("Biiling&Shipping", 1, 1);
		String shipCity = eLib.readDataFromExcel("Biiling&Shipping", 1, 2);
		String shipPincode = eLib.readDataFromExcel("Biiling&Shipping", 1, 3);
		
		
		MyCartPage1 myCartPage = new MyCartPage1(driver);
		myCartPage.enterShippingAddress(shipAddress, shipState, shipCity,shipPincode );
		//handling alert popup
		String alertMsg1 = fLib.getPropertKeyValue("alertMsg1");
		myCartPage.handleAlertPOPup(driver,alertMsg1);
		
		String billAddress = eLib.readDataFromExcel("Biiling&Shipping", 1, 4);
		String billState = eLib.readDataFromExcel("Biiling&Shipping", 1, 5);
		String billCity = eLib.readDataFromExcel("Biiling&Shipping", 1, 6);
		String billPincode = eLib.readDataFromExcel("Biiling&Shipping", 1, 7);
		
		
		myCartPage.enterBillingAddress(billAddress, billState, billCity, billPincode);
		String alertMsgShip = fLib.getPropertKeyValue("alertMsg2");
		myCartPage.handleAlertPOPupShipping(driver,alertMsgShip);
		
		String prodText1 = fLib.getPropertKeyValue("productText1");
		String productText = myCartPage.getTextOfCartPage();
		Assert.assertEquals(prodText1, productText);
		Reporter.log("Product is successfully added in cart,true",true);

		
	}
}
