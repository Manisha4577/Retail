package com.retailproject.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.retailproject.actiondriver.Action;
import com.retailproject.base.baseclass;



public class Homepageretail extends baseclass{
	
	public Productspageretail productpageretail;
		
		@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")
		WebElement signInBtn;
		
		@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")
		WebElement Products;
		
		@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
		WebElement Logo;
		
		public Homepageretail() {
			PageFactory.initElements(driver,this);
		}
		
		
		
		public loginPage clickonSignIn()throws Throwable {
			signInBtn.click();
			return new loginPage();
		}
			

		public Productspageretail clickonProducts() {
			Products.click();
			return new Productspageretail();
			
		}
		
		public boolean validateLogo() {
			 Logo.isDisplayed();
			 return true;
			 
			 
		}
}
