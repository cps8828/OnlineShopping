package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.WebDriverUtility;

/**
 * 
 * @author Sukesh
 *This Page Contains All WebElements of Particular Produv
 */
public class ProductDetails extends WebDriverUtility {


	
//============================Initialization====================================================
	
		//initialization
			public ProductDetails(WebDriver driver)
			{
				//this.driver=driver;
				PageFactory.initElements(driver, this);
			}
			
//============================Declarations ======================================================

			//declaretion
			
			@FindBy(xpath =  "//a[text()=' ADD TO CART']")
			private WebElement addToCart;
			
			@FindBy(xpath =  "//i[(@class='fa fa-heart')]")
			private WebElement addToWishlist;

			@FindBy(xpath =  "//div[@class='arrow plus gradient']")
			private WebElement increaseQuantityByOne;

			@FindBy(xpath =  "//div[@class='arrow minus gradient']")
			private WebElement decreaseQuantityByOne;

			@FindBy(xpath =  "//div[@class='arrows']/../input[@type='text']")
			private WebElement quantityValue;
			
			@FindBy(xpath =  "//li/a[text()='DESCRIPTION']")
			private WebElement descriptionOfProduct;
			
			@FindBy(xpath =  "//li/a[text()='REVIEW']")
			private WebElement reviewOfProduct;
			
			@FindBy(xpath =  "//input[@name='quality' and @value='1']")
			private WebElement rateQualityOfProduct1;
			
			@FindBy(xpath =  "//input[@name='quality' and @value='2']")
			private WebElement rateQualityOfProduct2;
			
			@FindBy(xpath =  "//input[@name='quality' and @value='3']")
			private WebElement rateQualityOfProduct3;	

			@FindBy(xpath =  "//input[@name='quality' and @value='4']")
			private WebElement rateQualityOfProduct4;	

			@FindBy(xpath =  "//input[@name='quality' and @value='5']")
			private WebElement rateQualityOfProduct5;	
			
			@FindBy(xpath =  "//input[@name='price' and @value='1']")
			private WebElement ratePriceOfProduct1;
			
			@FindBy(xpath =  "//input[@name='price' and @value='2']")
			private WebElement ratePriceOfProduct2;
			
			@FindBy(xpath =  "//input[@name='price' and @value='3']")
			private WebElement ratePriceOfProduct3;	

			@FindBy(xpath =  "//input[@name='price' and @value='4']")
			private WebElement ratePriceOfProduct4;	

			@FindBy(xpath =  "//input[@name='price' and @value='5']")
			private WebElement ratePriceOfProduct5;	
			
			@FindBy(xpath =  "//input[@name='value' and @value='1']")
			private WebElement rateValueOfProduct1;
			
			@FindBy(xpath =  "//input[@name='value' and @value='2']")
			private WebElement rateValueOfProduct2;
			
			@FindBy(xpath =  "//input[@name='value' and @value='3']")
			private WebElement rateValueOfProduct3;	

			@FindBy(xpath =  "//input[@name='value' and @value='4']")
			private WebElement rateValueOfProduct4;	

			@FindBy(xpath =  "//input[@name='value' and @value='5']")
			private WebElement rateValueOfProduct5;	

			@FindBy(name =  "name")
			private WebElement yourNameTxtEdt;	

			@FindBy(name =  "summary")
			private WebElement summaryTxtEdt;	

			@FindBy(name =  "review")
			private WebElement reviewTxtEdt;	

			@FindBy(xpath =  "//button[@name='submit']")
			private WebElement submitBtn;	

			
			
			
			
			
			
			
			
//============================Utilization========================================================
			
			//utilization
			
			public WebElement getAddToCart() {
				return addToCart;
			}

			public WebElement getAddToWishlist() {
				return addToWishlist;
			}

			public WebElement getIncreaseQuantityByOne() {
				return increaseQuantityByOne;
			}

			public WebElement getDecreaseQuantityByOne() {
				return decreaseQuantityByOne;
			}

			public WebElement getQuantityValue() {
				return quantityValue;
			}
			
			public WebElement getDescriptionOfProduct() {
				return descriptionOfProduct;
			}
			
			public WebElement getReviewOfProduct() {
				return quantityValue;
			}
			
			public WebElement getRateQualityOfProduct1() {
				return rateQualityOfProduct1;
			}

			public WebElement getRateQualityOfProduct2() {
				return rateQualityOfProduct2;
			}

			public WebElement getRateQualityOfProduct3() {
				return rateQualityOfProduct3;
			}

			public WebElement getRateQualityOfProduct4() {
				return rateQualityOfProduct4;
			}

			public WebElement getRateQualityOfProduct5() {
				return rateQualityOfProduct5;
			}
			
			public WebElement getRatePriceOfProduct1() {
				return ratePriceOfProduct1;
			}

			public WebElement getRatePriceOfProduct2() {
				return ratePriceOfProduct2;
			}

			public WebElement getRatePriceOfProduct3() {
				return ratePriceOfProduct3;
			}

			public WebElement getRatePriceOfProduct4() {
				return ratePriceOfProduct4;
			}

			public WebElement getRatePriceOfProduct5() {
				return ratePriceOfProduct5;
			}
			
			public WebElement getRateValueOfProduct1() {
				return rateValueOfProduct1;
			}

			public WebElement getRateValueOfProduct2() {
				return rateValueOfProduct2;
			}

			public WebElement getRateValueOfProduct3() {
				return rateValueOfProduct3;
			}

			public WebElement getRateValueOfProduct4() {
				return rateValueOfProduct4;
			}

			public WebElement getRateValueOfProduct5() {
				return rateValueOfProduct5;
			}
			
			public WebElement getSubmitBtn() {
				return submitBtn;
			}
			
	
}
