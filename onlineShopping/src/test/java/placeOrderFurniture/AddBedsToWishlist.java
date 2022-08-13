package placeOrderFurniture;

import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.FurniturePage;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.LoginPage;
import com.crm.objectRepository.MyWishlistPage;


public class AddBedsToWishlist extends BaseClass {


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
		homePage.getFurnitureTab().click();
		System.out.println("click on beds tab is sceessful");
		
		//Electronics Page
		FurniturePage furniturPage = new FurniturePage(driver);
		//wLib.scrollBarAction(driver);
		String BedCreatedText=furniturPage.getBedsLink().getText();
		System.out.println(BedCreatedText);
		
		try {
			wLib.waitForElemenetToBeClickable(driver, furniturPage.getAddToCartLink());
			furniturPage.getAddToCartLink2().click();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Beds added to wishlist Successfully");

		//click on wishlist page
		homePage.getWishListLink().click();

		MyWishlistPage myWishlistPage= new MyWishlistPage(driver);

		String beds=myWishlistPage.getSamsungProduct().getText();

		if(beds.contains(BedCreatedText)) {
			System.out.println("The Product has been Added to Wishlist and Verified Successully");
		}
		else {
			System.out.println("The Product has not been Added to Wishlist");
		}

		//Logout
		homePage.getLogoutBtn();
		driver.quit();

	}


}
