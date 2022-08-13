package com.crm.OnlineShoping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.FurniturePage;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.MyCartPage;

public class AddToCartBookTest extends BaseClass 
{
	@Test
	public void addBookToCart()
	{
		HomePage homePage = new HomePage(driver);
		wLib.waitForPageToLoad(driver);

		
		//	driver.findElement(By.xpath("//li[@class='dropdown yamm']/a[text()=' Books']")).click();
		//homePage.clickOnBook();

//
//		FurniturePage fPage = new FurniturePage(driver);
//		fPage.
//		String alertMsg = fLib.getPropertKeyValue("alertMsg");
//		bookCatogoryPage.handleAlertPopup(driver, alertMsg);
		//fetch data from excelSheet
		String shipAddress = eLib.readDataFromExcel("Furnitue", 1, 0);
		String shipState = eLib.readDataFromExcel("Furnitue", 1, 1);
		String shipCity = eLib.readDataFromExcel("Furnitue", 1, 2);
		String shipPincode = eLib.readDataFromExcel("Furnitue", 1, 3);
		
		
		MyCartPage myCartPage = new MyCartPage(driver);
		myCartPage.toBilling(shipAddress, shipState, shipCity, shipPincode);
		//handling alert popup
//		FurniturePage fPage = new FurniturePage();
//		String alertMsg1 = fLib.getPropertKeyValue("alertMsg1");
//		myCartPage.
		myCartPage.toShipping(shipAddress, shipPincode, shipPincode, shipPincode);
		String billAddress = eLib.readDataFromExcel("Furniture", 1, 4);
		String billState = eLib.readDataFromExcel("Furniture", 1, 5);
		String billCity = eLib.readDataFromExcel("Furniture", 1, 6);
		String billPincode = eLib.readDataFromExcel("Furniture", 1, 7);
		
//		myCartPage.enterBillingAddress(billAddress, billState, billCity, billPincode);
//		String alertMsgShip = fLib.getPropertKeyValue("alertMsg2");
//		myCartPage.handleAlertPOPupShipping(driver,alertMsgShip);
//		
//		myCartPage.clickOnProceedToChecOut();
//		myCartPage.clickOnSubmit();
	

	}
}
