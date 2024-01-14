package StepDefinition;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps extends BaseClass{
	private static LoginPage loginpage;

@Given("user is on login page")
public void user_is_on_login_page() {
	BaseClass.initialization();
	String url=prop.getProperty("url");
	driver.get(url);
    
}

@When("user enter firstname and lastname")
public void user_enter_firstname_and_lastname() {
	
	 loginpage=new LoginPage();
	 loginpage.loginFunctionality("standard_user", "secret_sauce");
    
}

@Then("user click on login button")
public void user_click_on_login_button() {
	loginpage.clickOnLogin();
   
}




}
