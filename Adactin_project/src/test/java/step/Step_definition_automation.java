package step;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Adactin_project.Baseclass;
import com.Adactin_project.Singleton_filereadermanager;
import com.runner.Runner_class_automation;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.Adactin_project.Loginpag;
import com.Adactin_project.Pageobjects;;
public class Step_definition_automation extends Baseclass{
public static WebDriver driver=Runner_class_automation.driver;
  Pageobjects po = new Pageobjects(driver);


	@Given("user is launching the application")
	public void user_is_launching_the_application() throws IOException {
	    geturl(Singleton_filereadermanager.getFRM().getCR().geturl());
	}
	
	@When("user is click on build 2")
	public void user_is_click_on_build() {
	    po.getLp().getBuild2().click();
	}

	@And("user is enter {string} in username field")
	public void user_is_enter_in_username_field(String string) {
	    inputText(po.getLp().getUsername(), string);
	}

	@And("user is enter {string} in password field")
	public void user_is_enter_in_password_field(String string) {
	    inputText(po.getLp().getPassword(), string);
	}

	@Then("user is click on login button")
	public void user_is_click_on_login_button() {
	    clickbutton(po.getLp().getLoginbutton());
	}

	@Given("user is select location")
	public void user_is_select_location() {
dropdown(po.getHp().location(), "Byindex", "3");
		
	}

	@When("user is select hotel")
	public void user_is_select_hotel() {
dropdown(po.getHp().getHotel(), "Byindex", "3");
	}

	@When("user is select room type")
	public void user_is_select_room_type() {
	dropdown(po.getHp().getRoomtype(), "Byindex", "3");
	}

	@When("user is select number of room")
	public void user_is_select_number_of_room() {
	dropdown(po.getHp().getNumberofroom(), "Byinde", "2");
	}

	@When("user is select check in date")
	public void user_is_select_check_in_date() {
	   po.getHp().getCheckindate().clear();
	   inputText(po.getHp().getCheckindate(), "28/03/2022");

	}

	@When("user is select check out date")
	public void user_is_select_check_out_date() {
	   po.getHp().getCheckoutdate().clear();
	   inputText(po.getHp().getCheckoutdate(), "30/03/2022");
	}

	@When("user is select the adult per room")
	public void user_is_select_the_adult_per_room() {
	  dropdown(po.getHp().getAdultperroom(), "Byindex", "3");
	}

	@When("user is select the child per room")
	public void user_is_select_the_child_per_room() {
	dropdown(po.getHp().getNumberofchild(), "Byindex", "2");
	}

	@Then("user is click on search")
	public void user_is_click_on_search() {
	 po.getHp().getSearchbutton().click();
	}
	@Given("user is click the select button")
	public void user_is_click_the_select_button() throws InterruptedException {
		Thread.sleep(4000);
	   po.getHp().getRadiobutton().click();
	}

	@Then("user is click on continue button")
	public void user_is_click_on_continue_button() throws InterruptedException {
	po.getHp().getContinuebutton().click();
	}

	@Given("user is enter the enter the firstname")
	public void user_is_enter_the_enter_the_firstname() {
inputText(po.getHp().getFirstname(), "srinivas");
	}

	@When("user is enter the lastname")
	public void user_is_enter_the_lastname() {
	   inputText(po.getHp().getLastname(), "vadivel");
	}

	@When("user is enter the billing address")
	public void user_is_enter_the_billing_address() {
	 inputText(po.getHp().getBillingaddress(), "29,nehru street,virudhachalam,606001");
	}

	@When("user is enter the credit card number")
	public void user_is_enter_the_credit_card_number() {
inputText(po.getHp().getCreditnumber(), "0987654321098765");
	}

	@When("user is enter the credit card type")
	public void user_is_enter_the_credit_card_type() {
dropdown(po.getHp().getCardtype(), "Byindex", "2");
	}

	@When("user is select the exp month")
	public void user_is_select_the_exp_month() {
dropdown(po.getHp().getExpmonth(), "Byindex", "4");
	}

	@When("user is select the exp year")
	public void user_is_select_the_exp_year() {
	dropdown(po.getHp().getExpyear(), "Byindex", "12");
	}

	@Then("user is click on book now")
	public void user_is_click_on_book_now() {
		inputText(po.getHp().getCvvnumber(), "567");
	clickbutton(po.getHp().getBookbutton());
	}

	@Given("user is taking screenshot")
	public void user_is_taking_screenshot() throws IOException {
	  screenshot();
	}



}
