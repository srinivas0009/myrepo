package com.Adactin_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpag {
public static WebDriver driver;
	 @FindBy(xpath="//strong[text()='Go to Build 2 ']")
		private WebElement build2;
		        @FindBy(id="username")
		private  WebElement username;
		@FindBy(id ="password")
		private WebElement password;
		
		@FindBy(name = "login")
		private WebElement loginbutton;
		
		
		
	public WebElement getLoginbutton() {
			return loginbutton;
		}





		public void setLoginbutton(WebElement loginbutton) {
			this.loginbutton = loginbutton;
		}





	public Loginpag (WebDriver driver)	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}


	


	public WebElement getBuild2() {
		return build2;
	}


	public WebElement getUsername() {
		return username;
	}


	public WebElement getPassword() {
		return password;
	}


	
	
		
	
		
		
		
		
		
		
		
		
	//	WebDriver driver;
//		public static WebElement build2(WebDriver driver) {
//			return driver.findElement(By.xpath("//strong[text()='Go to Build 2 ']"));
//			
//		}
	//
//		public static WebElement username(WebDriver driver) {
//			return driver.findElement(By.id("username"));
//			
//		}
	//
//		public static WebElement pass(WebDriver driver) {
//			return driver.findElement(By.id("password"));
	//	
//		}
	//
//		public static WebElement loginbtn(WebDriver driver) {
//			return  driver.findElement(By.id("login"));
//			 
		}




