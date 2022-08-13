package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.WebDriverUtility;

public class BooksCategoryPage extends WebDriverUtility 
{
@FindBy(xpath="//img[@src='admin/productimages/15/diary-of-a-wimpy-kid-do-it-yourself-book-original-1.jpeg']") private WebElement wimpyKidImg;
@FindBy(xpath="//a[text()='The Wimpy Kid Do -It- Yourself Book']") private WebElement wimpyText;
@FindBy(xpath="//a[text()='The Wimpy Kid Do -It- Yourself Book']/../../following-sibling::div/div/ul/li/a/button") private WebElement addToCartWimp;

@FindBy(xpath="//a[text()='Thea Stilton and the Tropical Treasure ']/../../following-sibling::div/div/ul/li/a/button") private WebElement addToCartStilton;
@FindBy(xpath="//img[@src='admin/productimages/16/22-thea-stilton-and-the-tropical-treasure-original-1.jpeg']") private WebElement stiltonImg;

//Initialisation
public BooksCategoryPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
//Utilization

public WebElement getWimpyKidImg() {
	return wimpyKidImg;
}

public WebElement getWimpyText() {
	return wimpyText;
}

public WebElement getAddToCartWimp() {
	return addToCartWimp;
}

public WebElement getAddToCartStilton() {
	return addToCartStilton;
}

public WebElement getStiltonImg() {
	return stiltonImg;
}
public void clickWimpAddToCart()
{
	addToCartWimp.click();
}
public String handleAlertPopup(WebDriver driver,String expectedMsg)
{
	switchToAlertPopUpAndAccept(driver,expectedMsg);
	return expectedMsg;
}

}
