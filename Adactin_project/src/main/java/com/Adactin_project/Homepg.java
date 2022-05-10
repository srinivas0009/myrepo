package com.Adactin_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepg {
    
	public static WebDriver driver;
	@FindBy(name = "location")
	private WebElement location;
	
	@FindBy(id = "hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id= "room_nos")
	private WebElement numberofroom;
	
	@FindBy(id = "datepick_in")
	private WebElement checkindate;
	
	@FindBy(id= "datepick_out")
	private WebElement checkoutdate;
	
	@FindBy(id= "adult_room")
	private WebElement adultperroom;
	
	
	@FindBy(id= "child_room")
	private WebElement numberofchild;
	
	@FindBy(id="Submit")
	private WebElement searchbutton;
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy(id="continue")
	private WebElement continuebutton;
	
	@FindBy(id="first_name")
	private WebElement firstname;
	
	@FindBy(id="last_name")
	private WebElement lastname;
	
	
	@FindBy(id="address")
	private WebElement billingaddress;
	
	@FindBy(id="cc_num")
	private WebElement creditnumber;
	
	@FindBy(id="cc_type")
	private WebElement cardtype;
	
	@FindBy(id="cc_exp_month")
	private WebElement expmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expyear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvvnumber;
	
	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getBillingaddress() {
		return billingaddress;
	}

	public WebElement getCreditnumber() {
		return creditnumber;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvvnumber() {
		return cvvnumber;
	}

	public WebElement getBookbutton() {
		return bookbutton;
	}

	@FindBy(id="book_now")
	private WebElement bookbutton;
	
	
	

	public WebElement getContinuebutton() {
		return continuebutton;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNumberofroom() {
		return numberofroom;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public WebElement getAdultperroom() {
		return adultperroom;
	}

	public WebElement getNumberofchild() {
		return numberofchild;
	}

	
	public Homepg(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement location() {
		return location;
	}

}
