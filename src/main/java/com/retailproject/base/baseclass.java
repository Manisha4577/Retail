package com.retailproject.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.retailproject.pageobjects.Homepageretail;
import com.retailproject.pageobjects.Productspageretail;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	
	  public static WebDriver driver;
	  public  Properties prop;
	  public Homepageretail homepageretail;
	  public Productspageretail productpageretail;
	 
	  
	 @BeforeMethod
	
	public  void launchapp() {
		readConfig1();
	        WebDriverManager.chromedriver().setup();
	         driver = new ChromeDriver();
	         driver.manage().window().maximize();
	        driver.get(prop.getProperty("url"));
	        homepageretail=new Homepageretail();
	        
	   }
	        
	    	public void readConfig1() {
	    		
	    		
				try {
					prop= new Properties();
					FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"/Configuration/config.properties");
					 	prop.load(fs);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 
	    	}
	    
	    	}
	    	
	    	

			
		
	        
	        

   




	

		
	
