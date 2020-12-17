package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.WaitHelper;

public class AddcustomerPage {
	
	
	public WebDriver driver;
	WaitHelper waithelper;
	
	public AddcustomerPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waithelper = new WaitHelper(driver);
	}
	
	
	@FindBy(xpath="//a[@href='#']//span[contains(text(), 'Customers')]")
	WebElement custLink;
	public WebElement customersLink()
	{
		waithelper.WaitForElement(custLink, 30);
		return custLink;
	}
		
	@FindBy(xpath="//span[@class='menu-item-title' and text()='Customers']")
	WebElement custItem;
	public WebElement customersItem()
	{
		waithelper.WaitForElement(custItem, 30);
		return custItem;
	}
		
	@FindBy(css="a[class='btn bg-blue']")
	WebElement adcustButton;
	public WebElement addNewCustButton()
	{
		waithelper.WaitForElement(adcustButton, 30);
		return adcustButton;
	}
			
	@FindBy(id="Email")
	WebElement email;
	public WebElement setEmail()
	{
		waithelper.WaitForElement(email, 30);
		return email;
	}
		
	@FindBy(id="Password")
	WebElement passw;                //password
	public WebElement setPassword()
	{
		waithelper.WaitForElement(passw, 30);
		return passw;
	}
		
	@FindBy(name="FirstName")
	WebElement firstN;                //First Name
	public WebElement setFirstName()
	{
		waithelper.WaitForElement(firstN, 30);
		return firstN;
	}
			
	@FindBy(name="LastName")
	WebElement lastN;                 // Last Name
	public WebElement setLastName()
	{
		waithelper.WaitForElement(lastN, 30);
		return lastN;
	}
		
	//Gender male & female locators
	@FindBy(id="Gender_Male")
	WebElement maleG;                 //Gender Male
	public WebElement selectMaleGender()
	{
		waithelper.WaitForElement(maleG, 30);
		return maleG;
	}
	
	@FindBy(id="Gender-Female")       //Gender Female
	WebElement femaleG;
	public WebElement selectFemaleGender()
	{
		waithelper.WaitForElement(femaleG, 30);
		return femaleG;
	}
			
	@FindBy(id="DateOfBirth")         // Date of Bird
	WebElement dob;
	public WebElement setDateOfBirth()
	{
		waithelper.WaitForElement(dob, 30);
		return dob;
	}
			
	@FindBy(name="Company")           // Company Name
	WebElement cyName;
	public WebElement setCompanyName()
	{
		waithelper.WaitForElement(cyName, 30);
		return cyName;
	}
		
	@FindBy(id="IsTaxExempt")           // Tax exempt
	WebElement tax;
	public WebElement taxExemptOrNot()
	{
		waithelper.WaitForElement(tax, 30);
		return tax;
	}	
		
	@FindBy(css="span[title='delete'][class='k-select']")    // Delete Default Customer Role
	WebElement del;

	public WebElement delecteDefaultCustomerRole()
	{
		waithelper.WaitForElement(del, 30);
		return del;
	}
	
	
	// ============================ Customer Role locators =====================
	
	//@FindBy(css="input[class='k-input k-readonly'][aria-describedby='SelectedCustomerRoleIds_taglist']")       //Customer Role
	//WebElement custRole;
	
	@FindBy(xpath="//*[@id='SelectedCustomerRoleIds_taglist']")
	WebElement custRole;
	public WebElement clickOnCustomerRoleField()
	{
		return custRole;
	}

	 @FindBy(xpath="//li[contains(text(),'Guests')]")
	 WebElement guest;
	 
	 @FindBy(xpath="//li[contains(text(),'Administrators')]") 
	 WebElement admin;
	 
	 @FindBy(xpath="//li[contains(text(),'Forum Moderators')]") 
	 WebElement fmod;
	 
	 @FindBy(xpath="//li[contains(text(),'Registered')]") 
	 WebElement regis;
	 
	 @FindBy(xpath="//li[contains(text(),'Vendors')]") 
	 WebElement vendor;
	 	 
	 public void selectCustomerRole(String role)
		{
			
			if(role.equalsIgnoreCase("Administrators"))
			{
				//driver.findElement(By.cssSelector("")).click();
				//admin.click();
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("role.click();", admin);		}
			else if(role.equalsIgnoreCase("Forum Moderators"))
			{
				//fmod.click();
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("role.click();", fmod);	
			}
			else if(role.equalsIgnoreCase("Guests"))
			{
				//guest.click();
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("role.click();", guest);	
			}
			else if(role.equalsIgnoreCase("Registered"))
			{
				//regis.click();
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("role.click();", regis);	
			}
			else if(role.equalsIgnoreCase("Vendors"))
			{
				//vendor.click();
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("role.click();", vendor);	
			}
		}	
	// ========================================End of customer role locators============================================== 
	
	
	 public void SelectVendorManager(String value)
	 {
		 Select drp = new Select(driver.findElement(By.xpath("//*[@id='VendorId']")));
		 drp.selectByVisibleText(value);
	 }
	 
	 //===================================================================
	
	@FindBy(name="Active")            // is customer active?
	WebElement custActive;
	public WebElement checkCustomerActiveOrNot()
	{
		return custActive;
	}
		
	@FindBy(id="AdminComment")         // Admin comment
	WebElement comment;
	public WebElement WriteAdminComment()
	{
		return comment;
	}
		
	@FindBy(name="save")              //Save button
	WebElement saveB;
	public WebElement saveButton()
	{
		return saveB;
	}
	
	@FindBy(name="save-continue")
	WebElement contEdit;
	public WebElement saveAndContinueEditCust()
	{
		return contEdit;
	}
	
	@FindBy(xpath="/html/body/div[3]/div[3]/div[1]")
	WebElement confText;
	public WebElement getConfirmationText()
	{
		return confText;
	}
	
	@FindBy(xpath="//a[@href='/Admin/Customer/List' and text()='back to customer list']")
	WebElement backToCustList;
	public WebElement backToCustomerListLink()
	{
		return backToCustList;
	}
	
	
	//I create this method so if i want to get the title of the page i just have to call that method 
	public String getPageTitle()
	{
		return driver.getTitle();
	}

}
