package stepDefinition;

import java.net.MalformedURLException;


import BaseSales.BaseSales;
import SalesPage.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends BaseSales {
	
	
	
	
	
	LoginPage login = new LoginPage();
	
	
	@Given("User Navigate to the Application")
	public void user_navigate_to_the_application() throws InterruptedException, MalformedURLException {
		
	   login.user_navigate_to_the_application();	
	}

	@When("User Enter the {string}")
	public void user_enter_the1(String EmailAddress) throws InterruptedException {
	   login.user_enter_the1(EmailAddress);
	}

	@When("User enter the {string}")
	public void user_enter_the(String password) throws InterruptedException {
		login.user_enter_the(password);
	    
		
		
	}

	@When("user click on the Login Button")
	public void user_click_on_the_login_button() throws InterruptedException {
		
		login.user_click_on_the_login_button();
	   
	}

	@When("Otp screen should open")
	public void otp_screen_should_open() {
		
		login.otp_screen_should_open();
	    
	}

	@When("Enter otp from email")
	public void enter_otp_from_email() throws InterruptedException {
		login.enter_otp_from_email();
	   
	}

	@When("user click Submit")
	public void user_click_submit() {
	    login.user_click_submit();
	}

	@Then("User should be able to login")
	public void user_should_be_able_to_login() {
	    login.user_should_be_able_to_login();
	}

	@Then("Home Page should be shown")
	public void home_page_should_be_shown() {
	  login.home_page_should_be_shown();
	}



}
