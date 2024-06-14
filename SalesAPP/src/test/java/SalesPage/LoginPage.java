package SalesPage;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import BaseSales.BaseSales;
import io.appium.java_client.android.AndroidDriver;

public class LoginPage extends BaseSales {
	
	//AndroidDriver driver;
	
	public void user_navigate_to_the_application() throws InterruptedException, MalformedURLException {
		
		setup();
		WebElement navigate =driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Predicted app: SalesApp\""));
		Thread.sleep(3000);
		navigate.click();
		
	   
	}

	
	public void user_enter_the1(String EmailAdress) throws InterruptedException {
		WebElement EmailAddress=driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-flat\""));
		EmailAddress.sendKeys(EmailAdress);
		Thread.sleep(3000);
		
		
	   
	}

	
	public void user_enter_the(String Password) throws InterruptedException {
			WebElement password = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-flat\""));
			password.sendKeys(Password);
			Thread.sleep(2000);
			
			}
		
		
		
	  
	

	
	public void user_click_on_the_login_button() throws InterruptedException {
		WebElement login=driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"button-text\"]"));
		login.click();
		Thread.sleep(8000);
	}

	
	public void otp_screen_should_open() {
	    System.out.println("OTP screen is visible");
	}

	
	public void enter_otp_from_email() throws InterruptedException {
	   
		WebElement OTP =driver.findElement(By.xpath(""));
		OTP.sendKeys("");;
		Thread.sleep(3000);
		
	}

	
	public void user_click_submit() {
		WebElement submit =driver.findElement(By.xpath(""));
	    submit.click();
		
		
	}


	public void user_should_be_able_to_login() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	public void home_page_should_be_shown() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	


}
