package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.WebDriverUtility;
/**
 * 
 * @author Sukesh
 *This Page Contains WebElements of Track Your Order Page
 */
public class TrackYourOrderPage extends WebDriverUtility {

//============================Initialization====================================================
	
	//initialization
		public TrackYourOrderPage(WebDriver driver)
		{
			//this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
//============================Declarations ======================================================

		//declaretion
		
		@FindBy(name = "orderid")
		private WebElement orderIdTextField;

		@FindBy(name = "email")
		private WebElement registeredEmailTextField;

		@FindBy(name = "submit")
		private WebElement trackBtn;
		
//============================Utilization========================================================
		
		//utilization
		
		public WebElement getorderIdTextField() {
			return orderIdTextField;
		}
		
		public WebElement getregisteredEmailTextField() {
			return registeredEmailTextField;
		}

		public WebElement gettrackBtn() {
			return trackBtn;
		}
}
