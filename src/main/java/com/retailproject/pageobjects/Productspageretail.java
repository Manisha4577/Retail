/**
 * 
 */
package com.retailproject.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.retailproject.base.baseclass;

/**
 * @author manis
 *
 */
public class Productspageretail extends baseclass {
	
	@FindBy(id="search_product")
	WebElement Search;
	
	@FindBy(id="submit_search")
	WebElement Searchbtn;

	
	
	public Productspageretail () {
		PageFactory.initElements(driver, this);
	}
	
	public void searchtext() {
		Search.sendKeys("Tshirt");
		Searchbtn.click();
		
		
		
	}

}
