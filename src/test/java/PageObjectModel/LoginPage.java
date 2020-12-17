package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement userid;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement passw;
	
	@FindBy(xpath="//input[@class='button-1 login-button']")
	WebElement lbutton;
	
	@FindBy(xpath="//a[@href='/logout']")
	WebElement logout;
	
	
	
	
	
	
	public WebElement logoutButton()
	{
		return logout;
	}
	
	public WebElement loginButton()
	{
		return lbutton;
	}
	
	public WebElement setPassword()
	{
		return passw;
	}
	
	public WebElement setUsername()
	{
		return userid;
	}

}
