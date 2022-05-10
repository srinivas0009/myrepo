package step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Adactin_project.Baseclass;
import com.Adactin_project.Orangehml_login_page;
import com.Adactin_project.Singleton_filereadermanager;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_definition extends Baseclass {
	
	
	public static WebDriver driver = getBrowser("chrome") ;
	public static Orangehml_login_page or = new Orangehml_login_page(driver);
	
	
	@Given("user is launching the browser")
	public void user_is_launching_the_browser() {
	    
	}

	@When("user is navigate to orange website")
	public void user_is_navigate_to_orange_website() {
	  geturl("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	}

	@And("user is enter the {string} in username field")
	public void user_is_enter_the_in_username_field(String string) {
	    inputText(or.getUsername(), string);
	}

	@And("user is enter the {string} in password field")
	public void user_is_enter_the_in_password_field(String string) {
	    inputText(or.getPassword(), string);
	}
		

	@And("user is click the login button")
	public void user_is_click_the_login_button() {
	  clickbutton(or.getButton());
	}
}
