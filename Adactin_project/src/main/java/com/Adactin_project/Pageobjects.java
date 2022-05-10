package com.Adactin_project;

import java.lang.reflect.Method;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pageobjects {
	

         public static WebDriver driver;
         
         private Loginpag lp;
         
         private Homepg hp;

         public  Pageobjects (WebDriver driver) {
        	 this.driver=driver;
        	 PageFactory.initElements(driver, this);
         }
         
		public Loginpag getLp() {
			return lp=new Loginpag(driver);
		}

		public Homepg getHp() {
			return hp= new Homepg(driver);
		}
         
         
         
         
}
