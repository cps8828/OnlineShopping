package com.crm.OnlineShoping;

import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.AdminHomePage;
import com.crm.objectRepository.CreateManageProductPage;



public class TestCase05 extends BaseClass{
	     @Test
         public void manageProduct() throws InterruptedException {
	    	 //take data from excel..........
	    	 String expectedMsg = eLib.readDataFromExcel("Project", 1, 3);
	    	 
        	 //Click on Manage Products major tab
	    	 AdminHomePage adminHomePage=new AdminHomePage(driver);
	    	 adminHomePage.getManageProductLnk().click();
	    	 
	    	 // on Show Entry dropdown and select the option
	    	 CreateManageProductPage createManageProductPage=new CreateManageProductPage(driver);
	    	 createManageProductPage.getShowDrpDwn().click();
	    	 
	    	 //Select one product and click on  delete icon
	    	 Thread.sleep(5000);
	    	 createManageProductPage.getDeleteIconBtn().click();
	    	 Thread.sleep(5000);
	    	 
	    	 //Click on Ok in the popup
	    	 wLib.switchToAlertPopUpAndAccept(driver, expectedMsg);
	    	 
	    	 //Click on Logout
	    	 adminHomePage.getLogoutLnk().click();
	    	
	    	 
         }
}
