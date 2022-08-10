package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.WebDriverUtility;

/**
 * 
 * @author Sukesh
 *This Page Contains WebElements of Electronics Module
 */
public class ElectronicsPage extends WebDriverUtility {

	//initialization
	public ElectronicsPage(WebDriver driver)
	{
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//=============================Click on Electronics Page=========================================
	
	@FindBy(xpath = "//li[@class='dropdown yamm']/a[contains(.,'Electronics')]")
	private WebElement electronicsPage;
	

	public WebElement clickOnElectronicsPage() {
		return electronicsPage;
	}
	
	
	@FindBy(xpath = "//a[contains(.,'Login')]")
	private WebElement loginPage;

	public WebElement clickOnLoginPage() {
		return loginPage;
	}
	

//============================Declarations of Sub Categories====================================
	
	
	
	
	//declaration
	@FindBy(xpath = "//a[contains(.,'Led Television')]")
	private WebElement ledTelevesionSubCategory;

	@FindBy(xpath = "//a[contains(@href,'scid=3')]")
	private WebElement televesionSubCategory;


	@FindBy(xpath = "//a[contains(.,'Mobiles')]")
	private WebElement mobliesSubCategory;

	@FindBy(xpath = "//a[contains(.,'Mobile Accessories')]")
	private WebElement mobileAccessoriesSubCategory;

	@FindBy(xpath = "//a[contains(.,'Laptops')]")
	private WebElement laptopsSubCategory;

	@FindBy(xpath = "//a[contains(.,'Computers')]")
	private WebElement computersSubCategory;
	
//===============================Declarations of Categories============================================

	@FindBy(xpath = "//a[(@class='accordion-toggle collapsed') and (contains(.,'Books'))]")
	private WebElement booksShopByCategory;

	@FindBy(xpath = "//a[(@class='accordion-toggle collapsed') and (contains(.,'Fashion'))]")
	private WebElement fashionShopByCategory;
	

	@FindBy(xpath = "//a[(@class='accordion-toggle collapsed') and (contains(.,'Electronics'))]")
	private WebElement electronicsShopByCategory;
	
	@FindBy(xpath = "//a[(@class='accordion-toggle collapsed') and (contains(.,'Furniture'))]")
	private WebElement furnitureShopByCategory;
	

	//===============================Declarations of Click on Product============================================
	
	@FindBy(xpath = "//div[@class='product-info text-left']//a[text()='Micromax 81cm (32) HD Ready LED TV  (32T6175MHD, 2 x HDMI, 2 x USB)']")
	private WebElement micromax81cm;


	@FindBy(xpath = "//div[@class='product-info text-left']//a[text()='Apple iPhone 6 (Silver, 16 GB)']")
	private WebElement appleIphone6;

	@FindBy(xpath = "//div[@class='product-info text-left']//a[text()='Lenovo K6 Power (Silver, 32 GB) ']")
	private WebElement lenovoK6Power;

	@FindBy(xpath = "//div[@class='product-info text-left']//a[text()='Lenovo Vibe K5 Note (Gold, 32 GB)  ']")
	private WebElement lenovoVibeK5Note;

	@FindBy(xpath = "//div[@class='product-info text-left']//a[text()='Micromax Canvas Mega 4G']")
	private WebElement micromaxCanvasMega;

	@FindBy(xpath = "//div[@class='product-info text-left']//a[text()='SAMSUNG Galaxy On5']")
	private WebElement samsungGalaxyON5;

	@FindBy(xpath = "//div[@class='product-info text-left']//a[text()='OPPO A57']")
	private WebElement oppoA57;
	
	@FindBy(xpath = "//div[@class='product-info text-left']//a[text()='Affix Back Cover for Mi Redmi Note 4']")
	private WebElement affixBackCover;
	
	@FindBy(xpath = "//div[@class='product-info text-left']//a[text()='Acer ES 15 Pentium Quad Core']")
	private WebElement acerES15;
	
	@FindBy(xpath = "//div[@class='product-info text-left']//a[text()='Micromax Canvas Laptab II (WIFI) Atom 4th Gen']")
	private WebElement micromaxCanvasLaptab;
	
	@FindBy(xpath = "//div[@class='product-info text-left']//a[text()='HP Core i5 5th Gen']")
	private WebElement hPCoreI5;
	
	@FindBy(xpath = "//div[@class='product-info text-left']//a[text()='Lenovo Ideapad 110 APU Quad Core A6 6th Gen']")
	private WebElement lenovoIdeapad;
	
	
	
	//===============================Declarations of Add To Cart============================================
	
	@FindBy(xpath = "//div//a[text()='Micromax 81cm (32) HD Ready LED TV  (32T6175MHD, 2 x HDMI, 2 x USB)']/../../..//li[@class='add-cart-button btn-group']")
	private WebElement micromax81cmToCart;

	@FindBy(xpath = "//div//a[text()='Apple iPhone 6 (Silver, 16 GB)']/../../..//li[@class='add-cart-button btn-group']")
	private WebElement appleIphone6ToCart;
	
	@FindBy(xpath = "//div//a[text()='Redmi Note 4 (Gold, 32 GB)  (With 3 GB RAM)']/../../..//li[@class='add-cart-button btn-group']")
	private WebElement redmiNote4ToCart;

	@FindBy(xpath = "//div//a[text()='Lenovo K6 Power (Silver, 32 GB) ']/../../..//li[@class='add-cart-button btn-group']")
	private WebElement lenovoK6PowerToCart;

	@FindBy(xpath = "//div//a[text()='Lenovo Vibe K5 Note (Gold, 32 GB)  ']/../../..//li[@class='add-cart-button btn-group']")
	private WebElement lenovoVibeK5ToCart;
	
	@FindBy(xpath = "//div//a[text()='Micromax Canvas Mega 4G']/../../..//li[@class='add-cart-button btn-group']")
	private WebElement micromaxCanvasMegaToCart;
	

	@FindBy(xpath = "//div//a[text()='SAMSUNG Galaxy On5']/../../..//li[@class='add-cart-button btn-group']")
	private WebElement samsungGalaxyOn5ToCart;
	

	@FindBy(xpath = "//div//a[text()='OPPO A57']/../../..//li[@class='add-cart-button btn-group']")
	private WebElement oppoA57ToCart;
	
	@FindBy(xpath = "//div//a[text()='Affix Back Cover for Mi Redmi Note 4']/../../..//li[@class='add-cart-button btn-group']")
	private WebElement affixBackCoverToCart;
	

	@FindBy(xpath = "//div//a[text()='Acer ES 15 Pentium Quad Core']/../../..//li[@class='add-cart-button btn-group']")
	private WebElement acerES15ToCart;
	

	@FindBy(xpath = "//div//a[text()='Micromax Canvas Laptab II (WIFI) Atom 4th Gen']/../../..//li[@class='add-cart-button btn-group']")
	private WebElement micromaxCanvasLaptabToCart;
	

	@FindBy(xpath = "//div//a[text()='HP Core i5 5th Gen']/../../..//li[@class='add-cart-button btn-group']")
	private WebElement hPCoreI5ToCart;
	

	@FindBy(xpath = "//div//a[text()='Lenovo Ideapad 110 APU Quad Core A6 6th Gen']/../../..//li[@class='add-cart-button btn-group']")
	private WebElement lenovoIdeaPadToCart;
	
	
	
	//===============================Declarations of Add to Wishlist============================================
	
	

	@FindBy(xpath = "//div//a[text()='Micromax 81cm (32) HD Ready LED TV  (32T6175MHD, 2 x HDMI, 2 x USB)']/../../..//li[@class='lnk wishlist']")
	private WebElement micromax81cmToWishlist;

	@FindBy(xpath = "//div//a[text()='Apple iPhone 6 (Silver, 16 GB)']/../../..//li[@class='lnk wishlist']")
	private WebElement appleIphone6ToWishlist;
	
	@FindBy(xpath = "//div//a[text()='Redmi Note 4 (Gold, 32 GB)  (With 3 GB RAM)']/../../..//li[@class='lnk wishlist']")
	private WebElement redmiNote4ToWishlist;

	@FindBy(xpath = "//div//a[text()='Lenovo K6 Power (Silver, 32 GB) ']/../../..//li[@class='lnk wishlist']")
	private WebElement lenovoK6PowerToWishlist;

	@FindBy(xpath = "//div//a[text()='Lenovo Vibe K5 Note (Gold, 32 GB)  ']/../../..//li[@class='lnk wishlist']")
	private WebElement lenovoVibeK5ToWishlist;
	
	@FindBy(xpath = "//div//a[text()='Micromax Canvas Mega 4G']/../../..//li[@class='lnk wishlist']")
	private WebElement micromaxCanvasMegaToWishlist;
	

	@FindBy(xpath = "//div//a[text()='SAMSUNG Galaxy On5']/../../..//li[@class='lnk wishlist']")
	private WebElement samsungGalaxyOn5ToWishlist;
	

	@FindBy(xpath = "//div//a[text()='OPPO A57']/../../..//li[@class='lnk wishlist']")
	private WebElement oppoA57ToWishlist;
	
	@FindBy(xpath = "//div//a[text()='Affix Back Cover for Mi Redmi Note 4']/../../..//li[@class='lnk wishlist']")
	private WebElement affixBackCoverToWishlist;
	

	@FindBy(xpath = "//div//a[text()='Acer ES 15 Pentium Quad Core']/../../..//li[@class='lnk wishlist']")
	private WebElement acerES15ToWishlist;
	

	@FindBy(xpath = "//div//a[text()='Micromax Canvas Laptab II (WIFI) Atom 4th Gen']/../../..//li[@class='lnk wishlist']")
	private WebElement micromaxCanvasLaptabToWishlist;
	

	@FindBy(xpath = "//div//a[text()='HP Core i5 5th Gen']/../../..//li[@class='lnk wishlist']")
	private WebElement hPCoreI5ToWishlist;
	

	@FindBy(xpath = "//div//a[text()='Lenovo Ideapad 110 APU Quad Core A6 6th Gen']/../../..//li[@class='lnk wishlist']")
	private WebElement lenovoIdeaPadToWishlist;
	
	
	
	
	//============================Utilization  of Sub Categories=============================================
	
	//utilization
	public WebElement getLedTelevesionSubCategory() {
		return ledTelevesionSubCategory;
	}
	
	public WebElement getTelevesionSubCategory() {
		return televesionSubCategory;
	}
	
	public WebElement getMobilesSubCategory() {
		return mobliesSubCategory;
	}
	
	public WebElement getMobileAccessoriesSubCategory() {
		return mobileAccessoriesSubCategory;
	}
	
	public WebElement getLaptopsSubCategory() {
		return laptopsSubCategory;
	}

	public WebElement getComputersSubCategory() {
		return computersSubCategory;
	}
//===========================Utilization  of Categories=================================================
	
	public WebElement getBooksShopByCategory() {
		return computersSubCategory;
	}

	public WebElement getFashionShopByCategory() {
		return computersSubCategory;
	}
	
	public WebElement getElectronicsShopByCategory() {
		return computersSubCategory;
	}

	public WebElement getFurnitureShopByCategory() {
		return computersSubCategory;
	}
	
//===============================Utilization of Add To Cart============================================
	
	
	
	
	public WebElement addmicromax81cmToCart() {
		return micromax81cmToCart;
	}

	public WebElement addappleIphone6ToCart() {
		return appleIphone6ToCart;
	}

	public WebElement addlenovoK6PowerToCart() {
		return lenovoK6PowerToCart;
	}

	public WebElement addlenovoVibeK5NoteToCart() {
		return lenovoVibeK5ToCart;
	}

	public WebElement addmicromaxCanvasMegaToCart() {
		return micromaxCanvasMegaToCart;
	}

	public WebElement addsamsungGalaxyON5ToCart() {
		return samsungGalaxyOn5ToCart;
	}

	public WebElement addoppoA57ToCart() {
		return oppoA57ToCart;
	}
	
	public WebElement addaffixBackCoverToCart() {
		return affixBackCoverToCart;
	}

	public WebElement addacerES15ToCart() {
		return acerES15ToCart;
	}

	public WebElement addmicromaxCanvasLaptabToCart() {
		return micromaxCanvasLaptabToCart;
	}

	public WebElement addhPCoreI5ToCart() {
		return hPCoreI5ToCart;
	}

	public WebElement addlenovoIdeapadToCart() {
		return lenovoIdeaPadToCart;
	}


//===============================Utilization of Add to Wishlist============================================
	
	
	
	
	
	
	
	
	
	
	
	
	
	public WebElement addmicromax81cmToWishlist() {
		return micromax81cmToWishlist;
	}	

	public WebElement addappleIphone6mToWishlist() {
		return appleIphone6ToWishlist;
	}	
	

	public WebElement addLenovoK6PowerToWishlist() {
		return lenovoK6PowerToWishlist;
	}	
	

	public WebElement addLenovoVibeK5NoteToWishlist() {
		return lenovoVibeK5ToWishlist;
	}	
	

	public WebElement addMicromaxCanvasMegaToWishlist() {
		return micromaxCanvasMegaToWishlist;
	}	
	

	public WebElement addSamsungGalaxyON5ToWishlist() {
		return samsungGalaxyOn5ToWishlist;
	}	
	

	public WebElement addOppoA57ToWishlist() {
		return oppoA57ToWishlist;
	}	

	public WebElement addAffixBackCoverToWishlist() {
		return affixBackCoverToWishlist;
	}	

	public WebElement addAcerES15ToWishlist() {
		return acerES15ToWishlist;
	}	
	
	public WebElement addMicromaxCanvasLaptabToWishlist() {
		return micromaxCanvasLaptabToWishlist;
	}	
	
	public WebElement addHPCoreI5ToWishlist() {
		return hPCoreI5ToWishlist;
	}	

	public WebElement addLenovoIdeapadToWishlist() {
		return lenovoIdeaPadToWishlist;
	}	
	

	
	//===============================Utilization of Click On Products============================================
	
	public WebElement clickOnmicromax81cm() {
		return micromax81cm;
	}

	public WebElement clickOnappleIphone6() {
		return appleIphone6ToCart;
	}

	public WebElement clickOnlenovoK6Power() {
		return lenovoK6Power;
	}

	public WebElement clickOnlenovoVibeK5Note() {
		return lenovoVibeK5Note;
	}

	public WebElement clickOnmicromaxCanvasMega() {
		return micromaxCanvasMega;
	}

	public WebElement clickOnsamsungGalaxyON5() {
		return samsungGalaxyON5;
	}

	public WebElement clickOnoppoA57() {
		return oppoA57;
	}
	
	public WebElement clickOnaffixBackCover() {
		return affixBackCover;
	}

	public WebElement clickOnacerES15() {
		return acerES15;
	}

	public WebElement clickOnmicromaxCanvasLaptab() {
		return micromaxCanvasLaptab;
	}

	public WebElement clickOnhPCoreI5() {
		return hPCoreI5;
	}

	public WebElement clickOnlenovoIdeapad() {
		return lenovoIdeapad;
	}
//===========================================================================================
}
