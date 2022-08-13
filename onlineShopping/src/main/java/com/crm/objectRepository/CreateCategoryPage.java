package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.genericUtilities.WebDriverUtility;



public class CreateCategoryPage extends WebDriverUtility{
      
	//initialization..........
	public CreateCategoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//declaration...
	@FindBy(name = "category") private WebElement categoryNameTxt;
	
	@FindBy(name = "description") private WebElement descriptionTxt;
	
	@FindBy(name = "submit") private WebElement createBtn;
	
	@FindBy(xpath = "//select[@class='span8 tip']") private WebElement categoryDropDwnLnk;
	
	@FindBy(xpath = "//input[@class='span8 tip']") private WebElement subCategoryTxt;
	
	@FindBy(id = "subcategory") private WebElement subCategoryDropDwnLnk;
	
	
    //utilization
	public WebElement getCategoryNameTxt() {
		return categoryNameTxt;
	}

	public WebElement getDescriptionTxt() {
		return descriptionTxt;
	}

	public WebElement getCreateBtn() {
		return createBtn;
	}
	public WebElement getCategoryDrpDwn() {
		return categoryDropDwnLnk;
	}
	public WebElement getSubCategory() {
		return subCategoryTxt;
	}
	public WebElement getSubCategoryDrpDwn() {
		return subCategoryDropDwnLnk;
	}
	
	
	public void createButn(String categoryName,String description) {
		categoryNameTxt.sendKeys(categoryName);
		descriptionTxt.sendKeys(description);
		createBtn.click();
	}
	
}
