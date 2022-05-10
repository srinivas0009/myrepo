package com.Adactin_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orangehml_login_page {
  
	public static WebDriver driver;
	

	
	@FindBy(name = "txtUsername")
	private WebElement username;
	
	@FindBy(name = "txtPassword")
	private WebElement password;
	
	@FindBy(name = "Submit")
	private WebElement button;
	
	
	public Orangehml_login_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
}
		
	public WebElement getButton() {
		return button;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}


}
