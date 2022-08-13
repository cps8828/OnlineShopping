package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;

public class HomePage1
{
	//Declaration
	@FindBy(xpath="//a[text()='Home']")	private WebElement homeBtn;
	@FindBy(xpath="//a[.=' Books']") private WebElement booksBtn;
	@FindBy(xpath="//a[text()=' Electronics']")private WebElement electronicsBtn;
	@FindBy(xpath="//a[text()=' Furniture']") private WebElement furnitureBtn;
	@FindBy(xpath="//a[text()=' Fashion']")private WebElement fashionBtn;

	@FindBy(xpath="//a[contains(text(),'My Account')]")private WebElement myAccountLink;
	@FindBy(xpath="//a[contains(text(),'Wishlist')]") private WebElement wishListLnk;
	@FindBy(xpath="//a[contains(text(),'My Cart')]") private WebElement myCartLnk;
	@FindBy(xpath="//a[contains(text(),'Login')]")private WebElement loginLnk;

	@FindBy(name="product")private WebElement searchTxtField;
	@FindBy(name="search")private WebElement searchIcon;

	@FindBy(xpath="//div[@class='basket']") private WebElement cartIcon;
	@FindBy(xpath="//span[text()='Track Order']")private WebElement trackOrderLnk;
	@FindBy(xpath="//a[contains(text(),'Comics')]")private WebElement comicsLnk; 
	@FindBy(xpath="//a[contains(text(),'Logout')]")private WebElement logoutBtn;

	//Initialization
	public HomePage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Utilisation
	public WebElement getBookBtn()
	{
		return booksBtn;
	}
	public void clickOnBook()
	{
		booksBtn.click();
	}
	public void clickLogout()
	{
		logoutBtn.click();
	}
}