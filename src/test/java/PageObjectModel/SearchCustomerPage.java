package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.WaitHelper;

public class SearchCustomerPage {
	
	public WebDriver driver;
	
	WaitHelper waithelper; 
	
	public SearchCustomerPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		waithelper = new WaitHelper(driver);                //Internally it will create an object of WaitHelper class once the construction is invoked.
															//I will use that object everytime whenever I want to wait for some elements.
	}
	
	
	//The next time is to identify all the elements
	
	@FindBy(id="SearchEmail")                                                        // Email for Search
	WebElement emailS;
	public WebElement setEmailForSearch()
	{
		waithelper.WaitForElement(emailS, 30);
		return emailS;
	}
	
	@FindBy(id="SearchFirstName")						                              // First Name for Search
	WebElement fname;
	public WebElement setFirstNameForSearch()
	{
		waithelper.WaitForElement(fname, 30);
		return fname;
	}
	
	@FindBy(id="SearchLastName")						                              // Last Name for Search
	WebElement lname;
	public WebElement setLastNameForSearch()
	{
		waithelper.WaitForElement(lname, 30);
		return lname;
	}
	
	@FindBy(id="SearchMonthOfBirth")												// Month of Birth for Search
	WebElement MonthoB;
	public void setMonthOfBirth(String month)
	{
		waithelper.WaitForElement(MonthoB, 30);
		Select drpMonth = new Select(MonthoB);
		drpMonth.selectByValue(month);
	}
	
	@FindBy(id="")																	//Day of birth for Search
	WebElement DayOB;
	public void setDateOfBirth(String day)
	{
		waithelper.WaitForElement(DayOB, 30);
		Select drpDay = new Select(DayOB);
		drpDay.selectByValue(day);
	}
	
	@FindBy(id="SearchCompany")													   // Company for Search
	WebElement cyS;
	public WebElement setCompanyForSearch()
	{
		waithelper.WaitForElement(cyS, 30);
		return cyS;
	}
	
	@FindBy(id="SearchIpAddress")											    	// IP address for Search
	WebElement ip;
	public WebElement IPAddressForSearch()
	{
		waithelper.WaitForElement(ip, 30);
		return ip;
	}
	
	@FindBy(xpath="//button[@id='search-customers']")							     // Search button
	WebElement searchB;
	public WebElement clickSearchButton()
	{
		waithelper.WaitForElement(searchB, 30);
		return searchB;
	}
	
	//================ Search result validation =====================
	
	//When u search a customer (by email or by name etc ---) the result will display in a table down the search page. We need to identify this table. 
	// NB---> all the rows in the table have a matching xpath Ex: xpath=//table[@id='customers-grid']/tbody/tr] 
	//We have multiple rows in that table means we need to have multiple WebElement. 
	//And similarly we have xpath=//table[@id='customers-grid']/tbody/tr/td] that is matching with multiple columns. Using those 2 xpath we get number of rows 
	//And number of columns.
	//To validate the result of Search -----> if we search by email, we need to go to the column where there is email address and check if that column contains
	//the email we used. Similarly we do the same if we search by first name of last name etc---- We iterate through the list of WebElements to find a matching
	//email, a matching first name or a matching last name etc ...
	@FindBy(xpath="//table[@id='customers-grid']")
	WebElement table;
	
	@FindBy(xpath="//*[@id=\"customers-grid\"]/tbody/tr")
	List<WebElement> elements;
	public int getNumberOfRows()
	{
		int noOfRow = elements.size();
		return noOfRow;
	}
	
	@FindBy(xpath="//*[@id=\"customers-grid\"]/tbody/tr/td")
	List<WebElement> elt;
	public int getNumberOfColumns()
	{
		int noOfColumn = elt.size();
		return noOfColumn;
	}
	
	public boolean searchCustomerByEmail(String email)
	{
		boolean flag = false;
		
		for (int i=1; i<=getNumberOfRows(); i++)
		{
			String emailid = table.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println(emailid);
					
			if(emailid.equals(email))
			{
			flag=true;
			}
			
		}
		return flag;
		
	}	
	public boolean searchCustomerByName(String Name)
	{
		boolean flag = false;
		
		for (int i=1; i<=getNumberOfRows();i++)
		{
			String name = table.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr["+i+"]/td[3]")).getText();     //name in the 3nd column
			
			System.out.println(name);
					
			String names[] = name.split("");       //splitting first name from last name because code just above we are getting full name. We need to split them
					
			if (names[0].equals("Victoria") && names[1].equals("Terces"))
			{
				flag = true;
			}
		}
		
	return flag;
		
		}		
	
}

// ============================= End to validation
