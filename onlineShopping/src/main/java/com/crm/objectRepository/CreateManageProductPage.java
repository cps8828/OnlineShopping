package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateManageProductPage {
          
	//initialization
	public CreateManageProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	@FindBy(xpath = "//select[@name='DataTables_Table_0_length']") private WebElement showDropDown;
	
	@FindBy(xpath = "//td[text()='Apple INC']//following-sibling::td/a/i[@class='icon-remove-sign']") private WebElement deleteIconBtn;
	
	
	//utilization
	public WebElement getShowDrpDwn() {
		return showDropDown;
	}
	public WebElement getDeleteIconBtn() {
		return deleteIconBtn;
	}
}
