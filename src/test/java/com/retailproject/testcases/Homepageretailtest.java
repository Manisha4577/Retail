package com.retailproject.testcases;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.retailproject.base.baseclass;
import com.retailproject.pageobjects.Homepageretail;
import com.retailproject.pageobjects.Productspageretail;
import com.retailproject.pageobjects.loginPage;


public  class Homepageretailtest extends baseclass{
	Homepageretail homepageretail;
	
	

	@BeforeMethod
	public void setup(){
		 launchapp();
	}
	
	
	
	@Test(priority=3)
	public void verifylogo()  {
	homepageretail=new Homepageretail();
	boolean result=homepageretail.validateLogo();
	Assert.assertTrue(result);
	}
	
	@Test(priority=2)
	public  void clickonSignIn() throws Throwable{
		homepageretail=new Homepageretail();
		loginPage loginpage=new loginPage();
		loginpage=homepageretail.clickonSignIn();
	}
	
	@Test(priority=1)
	
	 public void clickonProducts()throws Throwable {
	 homepageretail=new Homepageretail();
	  Productspageretail productspageretail=new Productspageretail();
	  productspageretail=homepageretail.clickonProducts();
	 String expectedurl="https://automationexercise.com/products";
	 String actualurl="driver.getcurrenturl";
	 Assert.assertEquals(actualurl, expectedurl);
	 }
	
		
		
		
			
		
	
	}
	
	
	
	

	
	

