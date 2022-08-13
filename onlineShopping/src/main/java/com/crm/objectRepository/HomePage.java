package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.WebDriverUtility;
/**
 * 
 * @author SanjayBabu
 *
 */
public class HomePage extends WebDriverUtility{
	WebDriver driver;
	//01declaretion
	
	//Top Elements
	@FindBy(xpath = "//a[text()='My Account']") private WebElement myAccountLink;
	@FindBy(xpath = "//a[text()='Wishlist']") private WebElement wishListLink;
	@FindBy(xpath = "//a[text()='My Cart']") private WebElement myCartLink;
	@FindBy(xpath = "//a[text()='Login']") private WebElement loginLink;
	@FindBy(xpath = "//span[text()='Track Order']") private WebElement trackOrderLink;
	@FindBy(xpath = "//a[text()='Logout']") private WebElement logoutBtn;
	
	
	//search Files Elements
	@FindBy(xpath  = "//h2[text()='Shopping Portal']") private WebElement shopingPortalLink;
	@FindBy(name = "//input[@name='product']") private WebElement productSearchTextField;
	@FindBy(name = "search") private WebElement searchButton;
	@FindBy(xpath = "//span[text()='cart -']") private WebElement cartLink;

	//main Modules
	@FindBy(xpath  = "//a[text()='Home']") private WebElement homeTab;
	@FindBy(xpath = "//a[text()=' Books']") private WebElement booksTab;
	@FindBy(xpath =  "//a[text()=' Electronics']") private WebElement electronicsTab;
	@FindBy(xpath = "//a[text()=' Furniture']") private WebElement furnitureTab;
	@FindBy(xpath = "//a[text()=' Fashion']") private WebElement fashionTab;

	//subCategories elements
	@FindBy(xpath = "//div[text()=' Categories']") private WebElement categoriesTab;
	@FindBy(xpath = "//a[contains(.,'  Books')]") private WebElement booksLink;
	@FindBy(xpath = "//a[contains(.,'     Electronics')]") private WebElement electronicsLink;
	@FindBy(xpath = "//a[contains(.,'      Furniture')]") private WebElement furnitureLink;
	@FindBy(xpath = "//a[contains(.,'          Fashion')]") private WebElement fashionLink;
	
	//To see backward and forward products
	@FindBy(xpath = "//div[@id='owl-main']/div/div//i[@class='icon fa fa-angle-left']")
	private WebElement previve01;
	@FindBy(xpath = "//div[@id='owl-main']/div/div//i[@class='icon fa fa-angle-right']")
	private WebElement next01;
	
	////dots to see backward and forward products
	@FindBy(xpath = "//div[@class='owl-page active']") private WebElement dot01;
	@FindBy(xpath = "//div[@class='owl-page']") private WebElement dot02;
	
	 //To see featured products 
	@FindBy(xpath = "//a[text()='All']") private WebElement allLink;
	@FindBy(xpath="//a[text()='Books']") private WebElement book1Link;
	@FindBy(xpath = "//a[text()='Furniture']") private WebElement furniture1Link;
	@FindBy(xpath = "//div[@data-item='4']//div//div//div[@class='owl-prev']") private WebElement previve02;
	@FindBy(xpath = "//div[@data-item='4']//div//div//div[@class='owl-next']") private WebElement next02;
	
	//To see next and previvs smartPhones and laptops
	@FindBy(xpath = "//h3[text()='Smart Phones']/../div/div[@class='owl-controls clickable']/div/div[@class='owl-prev']")
	private WebElement previve03;
	@FindBy(xpath = "//h3[text()='Smart Phones']/../div/div[@class='owl-controls clickable']/div/div[@class='owl-next']")
	private WebElement next03;
	@FindBy(xpath = "//h3[text()='Laptops']/../div/div[@class='owl-controls clickable']/div/div[@class='owl-prev']")
	private WebElement previve04;
	@FindBy(xpath = "//h3[text()='Laptops']/../div/div[@class='owl-controls clickable']/div/div[@class='owl-next']")
	private WebElement next04;
	
	//To see Our Brands
	@FindBy(xpath = "//h3[text()='Our Brands']/../div/div/div[@class='owl-controls clickable']/div/div")
	private WebElement previve05;
	@FindBy(xpath = "//h3[text()='Our Brands']/../div/div/div[@class='owl-controls clickable']/div/div[@class='owl-next']")
	private WebElement next05;
	
	
	//03initialization
	public HomePage(WebDriver driver)
	{
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	//03utilization
	public WebElement getMyAccountLink() {
		return myAccountLink;
	}

	public WebElement getWishListLink() {
		return wishListLink;
	}

	public WebElement getMyCartLink() {
		return myCartLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getTrackOrderLink() {
		return trackOrderLink;
	}

	public WebElement getShopingPortalLink() {
		return shopingPortalLink;
	}

	public WebElement getProductSearchTextField() {
		return productSearchTextField;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getCartLink() {
		return cartLink;
	}

	public WebElement getHomeTab() {
		return homeTab;
	}

	public WebElement getBooksTab() {
		return booksTab;
	}

	public WebElement getElectronicsTab() {
		return electronicsTab;
	}

	public WebElement getFurnitureTab() {
		return furnitureTab;
	}

	public WebElement getFashionTab() {
		return fashionTab;
	}

	public WebElement getCategoriesTab() {
		return categoriesTab;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}

	public WebElement getFurnitureLink() {
		return furnitureLink;
	}

	public WebElement getFashionLink() {
		return fashionLink;
	}

	public WebElement getPrevive01() {
		return previve01;
	}

	public WebElement getNext01() {
		return next01;
	}

	public WebElement getDot01() {
		return dot01;
	}

	public WebElement getDot02() {
		return dot02;
	}

	public WebElement getAllLink() {
		return allLink;
	}

	public WebElement getBook1Link() {
		return book1Link;
	}

	public WebElement getFurniture1Link() {
		return furniture1Link;
	}

	public WebElement getPrevive02() {
		return previve02;
	}

	public WebElement getNext02() {
		return next02;
	}

	public WebElement getPrevive03() {
		return previve03;
	}

	public WebElement getNext03() {
		return next03;
	}

	public WebElement getPrevive04() {
		return previve04;
	}

	public WebElement getNext04() {
		return next04;
	}

	public WebElement getPrevive05() {
		return previve05;
	}

	public WebElement getNext05() {
		return next05;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	
	//04
	public void toSearchTheProduct(String productName)
	{
		productSearchTextField.sendKeys(productName);
	}
	public void toSearchTheButton()
	{
		searchButton.click();
	}


	public Object getCreateCategoryLnk1() {
		// TODO Auto-generated method stub
		return null;
	}


	public Object getCreateCategoryLnk() {
		// TODO Auto-generated method stub
		return null;
	}


	
}
