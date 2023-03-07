package com.retailproject.pageobjects;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.retailproject.base.baseclass;

public class loginPage extends baseclass{
	@BeforeMethod
	public void setup(){
		 launchapp();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		}

}
