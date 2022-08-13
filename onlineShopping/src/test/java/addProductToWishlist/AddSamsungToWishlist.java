package addProductToWishlist;

import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass1;
import com.crm.objectRepository.ElectronicsPage;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.LoginPage;
import com.crm.objectRepository.MyWishlistPage;

public class AddSamsungToWishlist extends BaseClass1 {


	@Test
	public void addToWishlist() throws Throwable{

		//Launch the Browser
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
		
		//Electronics Page
		ElectronicsPage electronicsPage = new ElectronicsPage(driver);
		//wLib.scrollBarAction(driver);
		String samsungCreatedText=electronicsPage.clickOnsamsungGalaxyON5().getText();
		System.out.println(samsungCreatedText);
		
		try {
			wLib.waitForElemenetToBeClickable(driver, electronicsPage.addSamsungGalaxyON5ToWishlist());
			electronicsPage.addSamsungGalaxyON5ToWishlist().click();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Samsung added to wishlist Successfully");

		//click on wishlist page
		homePage.getWishListLink().click();

		MyWishlistPage myWishlistPage= new MyWishlistPage(driver);

		String samsungGeneratedText=myWishlistPage.getSamsungProduct().getText();

		if(samsungGeneratedText.contains(samsungCreatedText)) {
			System.out.println("The Product has been Added to Wishlist and Verified Successully");
		}
		else {
			System.out.println("The Product has not been Added to Wishlist");
		}

		//Logout
		homePage.getLogoutBtn().click();
		driver.quit();

	}


}
