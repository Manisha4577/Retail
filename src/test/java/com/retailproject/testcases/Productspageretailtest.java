/**
 * 
 */
package com.retailproject.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.retailproject.base.baseclass;
import com.retailproject.pageobjects.Homepageretail;
import com.retailproject.pageobjects.Productspageretail;

/**
 * @author manis
 *
 */
public class Productspageretailtest extends baseclass{
	Homepageretail homepageretail;
	Productspageretail productpageretail;
	
	@Test(priority=4)
	public void ClickonSearchBtn() throws Throwable{
		homepageretail=new Homepageretail();
		productpageretail=homepageretail.clickonProducts();
		productpageretail.searchtext();
		 String expectedurl="https://automationexercise.com/products?search=Tshirt";
		 String actualurl="driver.getcurrenturl";
		 Assert.assertEquals(actualurl, expectedurl);
		
		
		
		
	}
	
}
