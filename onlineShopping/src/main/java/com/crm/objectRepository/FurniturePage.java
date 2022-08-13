package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.WebDriverUtility;

public class FurniturePage extends WebDriverUtility {
	/**
	 * C.p.Srivastava
	 */
	//declaration 
	 @FindBy(xpath="//a[contains(text(),'Beds')]")private WebElement BedsLink;
	 
	 @FindBy(xpath="//a[contains(text(),'Sofas')]")private WebElement SofasLink;
	 
	 @FindBy(xpath="//a[contains(text(),'Dining Tables')]")private WebElement DinningTabLink;
	 
	 @FindBy(xpath="//div[@class='sidebar-widget wow fadeInUp outer-bottom-xs  animated']/..//a[contains(text(),'Books')]")
	 private WebElement BooksLink;
	 
	 @FindBy(xpath="//div[@class='sidebar-widget wow fadeInUp outer-bottom-xs  animated']/..//a[contains(text(),'Electronics')]")
	 private WebElement Electronicslink;
	
     @FindBy(xpath="//div[@class='sidebar-widget wow fadeInUp outer-bottom-xs  animated']/..//a[contains(text(),'Furniture')]")
     private WebElement FurnitureLink;
     
     @FindBy(xpath="//div[@class='sidebar-widget wow fadeInUp outer-bottom-xs  animated']/..//a[contains(text(),'Fashion')]")
     private WebElement FashionLink;
     
     @FindBy(xpath="//a[text()='Induscraft Solid Wood King Bed With Storage']/../..//following-sibling::div[@class='cart clearfix animate-effect']/div/ul/li/button")
     private WebElement addToCart1;
     
     @FindBy(xpath="//a[text()='Induscraft Solid Wood King Bed With Storage']/../..//following-sibling::div[@class='cart clearfix animate-effect']/div/ul/li/a/button")
     private WebElement AddToCartLink1;
     
     @FindBy(xpath="//a[text()='Induscraft Solid Wood King Bed With Storage']/../..//following-sibling::div[@class='cart clearfix animate-effect']/div/ul/li/a/i")
     private WebElement WishLishLink1;
     
     @FindBy(xpath="//img[@src='admin/productimages/18/flbdorsabrqbblk-queen-carbon-steel-home-by-nilkamal-na-na-original-1.jpeg']")
     private WebElement ImgLink;
     
     @FindBy(xpath="//a[text()='Nilkamal Ursa Metal Queen Bed']")private WebElement TextLink;
     
     @FindBy(xpath="//a[text()='Nilkamal Ursa Metal Queen Bed']/../..//following-sibling::div[@class='cart clearfix animate-effect']/div/ul/li/button")
     private WebElement addTocart2;
     
     @FindBy(xpath="//a[text()='Nilkamal Ursa Metal Queen Bed']/../..//following-sibling::div[@class='cart clearfix animate-effect']/div/ul/li/a/button")
     private WebElement AddToCartLink2;
     
     @FindBy(xpath="//a[text()='Nilkamal Ursa Metal Queen Bed']/../..//following-sibling::div[@class='cart clearfix animate-effect']/div/ul/li/a/i")
     private WebElement WishLink2;
     
     @FindBy(xpath="//input[@type='checkbox']")private WebElement Chechbox;
     
     @FindBy(xpath="//input[@type='submit']")private WebElement UpdateShoppingBtn;
     
     @FindBy(xpath="//a[text()='Continue Shopping']")private WebElement ContinueshopBtn;
     
     @FindBy(xpath="//textarea[@name='billingaddress']")private WebElement BillingAddTextBox;
     
     @FindBy(xpath="//input[@id='bilingstate']")private WebElement BillingStateTextBox;
     
     @FindBy(xpath="//input[@id='billingcity']")private WebElement BillingCityTextBox;
     
     @FindBy(xpath="//input[@id='billingpincode']")private WebElement BillinfPinCodeTextBox;
     
     @FindBy(xpath="//td[text()='1']/../td[@class='cart-product-name-info']")private WebElement TimeTakeConfirm;
     
     
     
     
     //initialization
     public FurniturePage(WebDriver driver) {
    	 PageFactory.initElements(driver, this);
     }
     //utilization

	public WebElement getBedsLink() {
		return BedsLink;
	}

	public WebElement getTimeTakeConfirm() {
		return TimeTakeConfirm;
	}

	public WebElement getSofasLink() {
		return SofasLink;
	}

	public WebElement getDinningTabLink() {
		return DinningTabLink;
	}

	public WebElement getBooksLink() {
		return BooksLink;
	}

	public WebElement getElectronicslink() {
		return Electronicslink;
	}

	public WebElement getFurnitureLink() {
		return FurnitureLink;
	}

	public WebElement getFashionLink() {
		return FashionLink;
	}

	public WebElement getAddToCart() {
		return addToCart1;
	}

	public WebElement getAddToCartLink() {
		return AddToCartLink1;
	}

	public WebElement getWishLishLink() {
		return WishLishLink1;
	}

	public WebElement getAddToCart1() {
		return addToCart1;
	}

	public WebElement getAddToCartLink1() {
		return AddToCartLink1;
	}

	public WebElement getWishLishLink1() {
		return WishLishLink1;
	}

	public WebElement getAddTocart2() {
		return addTocart2;
	}

	public WebElement getAddToCartLink2() {
		return AddToCartLink2;
	}

	public WebElement getWishLink2() {
		return WishLink2;
	}

	public WebElement getImgLink() {
		return ImgLink;
	}

	public WebElement getTextLink() {
		return TextLink;
	}
	public void HandleAlertPopup(WebDriver driver,String expectedMsg) {
		switchToAlertPopUpAndAccept(driver, expectedMsg);
	}
	public void verify() {
		TimeTakeConfirm.click();
		
		
	}
     
     
}
