package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {
	
	
	public WebDriver driver;
	
	public WaitHelper(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	//here I will create user defined method WaitForElement - So Whenever I want to identify some element, I will wait until the element become present
	//on the web page or until is visible on the web page. This method with the element for which we have to wait as parameter and how much time we 
	//need to wait. This particular method I want to use in multiple places whenever I want to wait for some elements. And specially where I write elements is 
	//in page object. So I will go to page object, make object of this class WaitHelper, and call the WaitForElement method.
	public void WaitForElement(WebElement element, long timeOutInSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));                     //This statement will wait until the element is visible on the page
	}

}
