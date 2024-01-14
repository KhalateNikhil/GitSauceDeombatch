package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class LoginPage extends BaseClass{
	
	@FindBy(name="user-name")
	private WebElement uname;
	
	
	@FindBy(name="password")
	private WebElement pass;
	

	@FindBy(name="login-button")
	private WebElement login;
	
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void loginFunctionality(String username,String password)
	{
		Wait.sendKeys(uname, username);
		Wait.sendKeys(pass, password);
		
	}
	
	
	public void clickOnLogin()
	{
		Wait.click(login);
	}
	
	
	
	
}
