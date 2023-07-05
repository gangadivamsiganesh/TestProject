package StepDefinitions;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginPage 
{
	@Given("^Website opened successful$")
	public void website_opened_successful() 
	{
	   System.out.println("Website Opened");
	}
	
	@Given("^Enter (.*) and (.*) fields$")
	public void enter_username_and_password_fields(String Username,String Password) 
	{
		System.out.println("Entered username:"+ Username +"Entered password:"+ Password);
	}

	
	@And("^Enter username and Password$")
	public void enter_username_and_password() 
	{
		System.out.println("Entered username  Password");	
	}

	@Then("^Click on the login button$")
	public void click_on_the_login_button() 
	{
		System.out.println("Clicked on the login button");
	}

	@Then("^User should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() 
	{
		System.out.println("User Login successful");
	}

}
