package com.crm.OnlineShoping;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;

import com.crm.objectRepository.*;

import com.crm.objectRepository.*;



/**
 * 
 * @author MAQBOOL
 *
 */
public class TestCase02 extends BaseClass{

	/**
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void CreateCategory() throws InterruptedException {



		//take data from excel

		String categoryName = eLib.readDataFromExcel("Project", 1, 0);
		String description= eLib.readDataFromExcel("Project", 1, 1);
		String subCategoryname= eLib.readDataFromExcel("Project", 1, 2);

		//Click on Create Category major tab
		AdminHomePage adminHomePage=new AdminHomePage(driver);
		adminHomePage.getCreateCategoryLnk().click();

		//Enter Category name, description and click on create
		CreateCategoryPage createCategoryPage=new CreateCategoryPage(driver);
		createCategoryPage.createButn(categoryName, description);
		//click on insert product major tab
		adminHomePage.getInsertProductLnk().click();

		//Click on Category dropdown
		createCategoryPage.getCategoryDrpDwn().click();

		//Click on Sub Category major tab
		adminHomePage.getSubCategoryLnk().click();
		Thread.sleep(5000);

		//Enter Category, Sub category and click on Create button
		wLib.selectDropDownByVtext(createCategoryPage.getCategoryDrpDwn(), "Clothing");
		Thread.sleep(5000);
		//click on sub category and select clothing and create jeans
		createCategoryPage.getSubCategory().sendKeys(subCategoryname);
		Thread.sleep(5000);
		createCategoryPage.getCreateBtn().click();
		
		//Click on Insert Product major tab
		adminHomePage.getInsertProductLnk().click();
		
		//Click on Sub Category dropdown
		createCategoryPage.getSubCategoryDrpDwn().click();
		
		//Click on Logout
		adminHomePage.logoutToApplication();





	}
}
