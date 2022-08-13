package placeOrder;

import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.ElectronicsPage;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.LoginPage;
import com.crm.objectRepository.MyCartPage;
import com.crm.objectRepository.PaymentPage;

public class OrderIphone extends BaseClass {


	@Test

	public void orderIphone() throws Throwable{

		//Fetch Shipping Address Data from Excel Sheet
		String billingAddress=eLib.readDataFromExcel("BillingAddres", 3, 2);
		String billingState=eLib.readDataFromExcel("BillingAddres", 3, 3);
		String billingCity=eLib.readDataFromExcel("BillingAddres", 3, 4);
		String billingPincode=eLib.readDataFromExcel("BillingAddres", 3, 5);


		//Fetch Billing Address data from excel sheet
		String shippingAddress=eLib.readDataFromExcel("BillingAddres", 3, 2);
		String shippingState=eLib.readDataFromExcel("BillingAddres", 3, 3);
		String shippingCity=eLib.readDataFromExcel("BillingAddres", 3, 4);
		String shippingPincode=eLib.readDataFromExcel("BillingAddres", 3, 5);

		launchTheBrowser();
		

		String USERNAME = null;
		try {
			USERNAME = fLib.getPropertKeyValue("username");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		String PASSWORD = null;
		try {
			PASSWORD = fLib.getPropertKeyValue("password");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		//Click On Login Button
		HomePage homePage = new HomePage(driver);
		homePage.getLoginLink().click();
		System.out.println("Click On Login Button Successful");

		//Enter the Username, password and Click on login Button
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginToApplication(USERNAME, PASSWORD);
		System.out.println("Login To Application Successful");
		//Click On Electronics Page
		homePage.getElectronicsTab().click();
		System.out.println("Click On Electronics Tab Successful");


		//Add IPhone6 to Cart
		ElectronicsPage electronicsPage = new ElectronicsPage(driver);
		//wLib.scrollBarAction(driver);
		electronicsPage.addappleIphone6ToCart().click();
		System.out.println("Add Iphone to Cart Successful");
		
		driver.switchTo().alert().accept();
		
		//Thread.sleep(20000);
		//Fill the Billing Address
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
		PaymentPage paymentPage = new PaymentPage(driver);
		paymentPage.getSubmitBtn().click();
		homePage.getLogoutBtn().click();
		driver.quit();

	}



}
