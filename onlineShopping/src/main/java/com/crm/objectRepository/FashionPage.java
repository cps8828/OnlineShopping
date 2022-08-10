package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FashionPage {
         
	 //initialization.............
	public FashionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//uppdate
	//declaration............
	@FindBy(xpath = "//a[text()=' Fashion']") private WebElement fashionLink;
	
	@FindBy(xpath = "//li[@class='dropdown menu-item']/..//a[@class='dropdown-toggle']") private WebElement menFootwears;
	
	@FindBy(xpath = "//a[text()='Asian Casuals  (White, White)']/../..//following-sibling::div[@class='cart clearfix animate-effect']/div/ul/li/button") private WebElement cartBtn1;
	
	@FindBy(xpath = "//a[text()='Asian Casuals  (White, White)']/../..//following-sibling::div[@class='cart clearfix animate-effect']/div/ul/li/a/button") private WebElement addToCartBtn1;
	
	@FindBy(xpath = "//a[text()='Asian Casuals  (White, White)']/../..//following-sibling::div[@class='cart clearfix animate-effect']/div/ul/li/a/i") private WebElement wishlistBtn1;
	
	@FindBy(xpath = "//a[text()='Adidas MESSI 16.3 TF Football turf Shoes  (Blue)']/../..//following-sibling::div[@class='cart clearfix animate-effect']/div/ul/li/button") private WebElement cartBtn2;
	
	@FindBy(xpath = "//a[text()='Adidas MESSI 16.3 TF Football turf Shoes  (Blue)']/../..//following-sibling::div[@class='cart clearfix animate-effect']/div/ul/li/a/button") private WebElement addToCartBtn2;

	@FindBy(xpath = "//a[text()='Adidas MESSI 16.3 TF Football turf Shoes  (Blue)']/../..//following-sibling::div[@class='cart clearfix animate-effect']/div/ul/li/a/i") private WebElement wishlistBtn2;
	
	//utilization
	public WebElement getFashionLnk() {
		return fashionLink;
	}
	public WebElement getMenFootWear() {
		return menFootwears;
	}
	public WebElement getCartBtn1() {
		return cartBtn1;
	}
	public WebElement getAddToCart1() {
		return addToCartBtn1;
	}
	public WebElement getWishlist1() {
		return wishlistBtn1;
	}
	public WebElement getCartBtn2() {
		return cartBtn2;
	}
	public WebElement getAddToCart2() {
		return addToCartBtn2;
	}
	public WebElement getWishlist2() {
		return wishlistBtn2;
		
	}
}
