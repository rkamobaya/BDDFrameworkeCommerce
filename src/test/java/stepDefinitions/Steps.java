package stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjectModel.AddcustomerPage;
import PageObjectModel.LoginPage;
import PageObjectModel.SearchCustomerPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Steps extends BaseClass {
	/*
	 * @Before public void setup() throws IOException { //Logger configuration
	 * logger = Logger.getLogger("nopCommerce"); //Instantiate logger object is
	 * already declared in BaseClass. And here we extends steps class to BaseClass
	 * PropertyConfigurator.configure("log4j.properties"); //Since this file is
	 * within the project itself we just specify the name. //If the file was in
	 * another location u will specify the complete path of file //Reading
	 * properties file configProp = new Properties(); FileInputStream configPropfile
	 * = new FileInputStream("config.properties"); //open this properties file in
	 * input mode configProp.load(configPropfile); // Then we need to load the
	 * properties file. Now using configProp object we read the values in the file.
	 */				
		/*
		 * //Now I need to create a browser variable and an if/else statements to pick
		 * up the value of the browser depending on whether it's Chrome, Firefox, Edge,
		 * IE etc ... String br = configProp.getProperty("browser");
		 * 
		 * if (br.equals("chrome")) {
		 * System.setProperty("webdriver.chrome.driver",configProp.getProperty(
		 * "ChromePath")); //I use configProp object to get the path of chrome. driver =
		 * new ChromeDriver(); } else if (br.equals("firefox")) {
		 * System.setProperty("webdriver.gecko.driver",configProp.getProperty(
		 * "FirefoxPath")); //I use configProp object to get the path of chrome. driver
		 * = new FirefoxDriver(); } else if (br.equals("edge")) {
		 * System.setProperty("webdriver.edge.driver",configProp.getProperty("EdgePath")
		 * ); //I use configProp object to get the path of chrome. driver = new
		 * EdgeDriver(); }
		 */
		
		
		
	
	
	
	
	
	@Given("^user launch Chrome browser$")
	public void user_launch_Chrome_browser() throws IOException 
	{
		  
		logger=Logger.getLogger("nopCommerce");
		PropertyConfigurator.configure("log4j.properties");
		
		configProp = new Properties();
		FileInputStream configPropFile = new FileInputStream("C:\\Users\\rkamo\\eclipse-workspace\\BDDFrameworkeCommerce\\config.properties");
		configProp.load(configPropFile);
		
		
		  String br = configProp.getProperty("browser"); 
		  if(br.equals("chrome")) 
		  {
			  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe"); 
			  driver = new ChromeDriver(); 
		  } 
		  else if(br.equals("edge")) 
		  {
			  System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"//Drivers//msedgedriver2.exe"); 
			  driver = new EdgeDriver(); 
		  } 
		  else if(br.equals("firefox")) 
		  {
			  System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Drivers//geckodriver.exe"); 
			  driver = new FirefoxDriver(); 
		  }
		 
		  
		  //In the first method if I add many tasks here, later on it will difficult to manage. What I can to do is to create one separate method and inside 
		  //this method which I call setup(). And inside of this method (above) I create all the configuration cad Logger configuration, driver configuration and now
		  //reading properties file configuration. Every will be in setup() and then I will one Cucumber hook, a Cucumber concept, so this method will execute only
		  //one time before starting the class. So I have to remove Logger instantiation and driver configuration and write them in setup() method.
		 
		lp= new LoginPage(driver);
	 }
	
	@When("^user opens URL \"([^\"]*)\"$")
	public void user_opens_URL(String url) throws InterruptedException
	{
		//logger.info("=============== Openning the application ===================");
		driver.get(url);
		Thread.sleep(5000);
		driver.manage().window().maximize();
	}
	

	@When("^user enters Email as \"([^\"]*)\" and \"([^\"]*)\" as password$")
	public void user_enters_Email_as_and_as_password(String email, String password) 
	{
		//logger.info("=============== Providing logging credential =============================");
		lp.setUsername().clear();
		lp.setUsername().sendKeys(email);
		lp.setPassword().clear();
		lp.setPassword().sendKeys(password);
	}
	

	@When("^user clicks on login$")
	public void user_clicks_on_login() throws InterruptedException 
	{
		//logger.info("============= starting logging =============");
		lp.loginButton().click();
		Thread.sleep(5000);
	}
	

	@Then("^page title should be \"([^\"]*)\"$")
	public void page_title_should_be(String title) 
	{
		
		String actualTitle = driver.getTitle();
			
		if(driver.getPageSource().contains("Login was unsuccessful"))
		{
			driver.close();
			//logger.info("================ login passed ======================");
			Assert.assertTrue(false);
		}
		else
		{
			//logger.info("============= login failed ==========================");
			Assert.assertEquals(title, actualTitle);
		}
 	}
	

	@When("^user click on Logout link$")
	public void user_click_on_Logout_link() throws InterruptedException {
		
		//logger.info("=========== logging out ==============");
		
		lp.logoutButton().click();
		
		Thread.sleep(3000);
	}
	

	@Then("^user close browser$")
	public void user_close_browser() {
		//logger.info("=========== closing browser ===========================");
		
		driver.quit();	
	}
	
	
	
	
	
	//==================================Customer Feature Step Definitions =========================================================
	//=============================================================================================================================
	
	@Then("^user can view Dashboard$")
	public void user_can_view_Dashboard() 
	{
		addCust = new AddcustomerPage(driver);
		String actualTitle = addCust.getPageTitle();                 // -------------> call getTitle method from pom addCustomerPage.
		String expectedTitle = "Dashboard / nopCommerce administration";
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	

	@When("^user clicks on customers Menu$")
	public void user_clicks_on_customers_Menu() throws InterruptedException 
	{
		addCust.customersLink().click();
		Thread.sleep(3000);
	}

	
	@When("^clicks on customers Menu item$")
	public void clicks_on_customers_Menu_item() throws InterruptedException  
	{
		addCust.customersItem().click();
		Thread.sleep(3000);
	 }

	
	@When("^clicks on Add new button$")
	public void clicks_on_Add_new_button() throws InterruptedException
	{
		addCust.addNewCustButton().click();
		Thread.sleep(3000);
	}

	
	@Then("^user can view Add new customer page$")
	public void user_can_view_Add_new_customer_page() 
	{
		String expectedPageTitle = "Add a new customer / nopCommerce administration";
		String actualPageTitle = addCust.getPageTitle();
		Assert.assertEquals(expectedPageTitle, actualPageTitle);
	 }

	
	@When("^user enters customer info$")
	public void user_enters_customer_info() throws InterruptedException  
	{
		//logger.info("===================== Enterring new customer information ========================");
		String email = randomestring() + "@gmail.com";
		addCust.setEmail().sendKeys(email);
		addCust.setPassword().sendKeys("test123");
		addCust.setFirstName().sendKeys("Peter");
		addCust.setLastName().sendKeys("Ken");
		addCust.selectMaleGender().click();
		addCust.setDateOfBirth().sendKeys("5/10/1996");
		addCust.setCompanyName().sendKeys("CRKAM");
		addCust.taxExemptOrNot().click();

		//addCust.delecteDefaultCustomerRole().click();
		Thread.sleep(3000);
		
		//JavascriptExecutor jb = (JavascriptExecutor)driver;
		//jb.executeScript("document.getElementsByClassName('k-button').click()");
		
		//document.getElementById('SelectedCustomerRoleIds_taglist')
		//Thread.sleep(5000);
		
		//  addCust.clickOnCustomerRoleField().click(); Thread.sleep(3000);
		 
		//  addCust.selectCustomerRole("Guests"); 
		//  Thread.sleep(3000);
		 
		
		
		addCust.SelectVendorManager("Vendor 2");
		Thread.sleep(3000);
				
		addCust.checkCustomerActiveOrNot().click();
	
		addCust.WriteAdminComment().sendKeys("This is a VIP customer");
	   
		
	}
	
	@When("^clicks on Save button$")
	public void clicks_on_Save_button() throws InterruptedException  
	{
	  addCust.saveAndContinueEditCust().click();
	  Thread.sleep(5000);
	}

	@Then("^User can view confirmation massage \"([^\"]*)\"$")
	public void user_can_view_confirmation_massage(String confMassage) 
	{
	//  logger.info("========== validating new customer adding successfully ==========================");
	  String expectedConfirmationText = "The new customer has been added successfully.";
	  String actualConfirmationText = addCust.getConfirmationText().getText();
	  System.out.println("The confirmation message is " + actualConfirmationText);
	  Assert.assertEquals(expectedConfirmationText, actualConfirmationText);
	}

	// ================================= Searching a customer using email ID =============================================
	// ===================================================================================================================
	
	
	
	@When("^Enters customer Email$")
	public void enters_customer_Email() {
		//logger.info(" =============== providing email for search ========================");;
		searchPage = new SearchCustomerPage(driver);
		searchPage.setEmailForSearch().sendKeys("victoria_victoria@nopCommerce.com");
	}

	@When("^clicks on search button$")
	public void clicks_on_search_button() throws InterruptedException {
		searchPage.clickSearchButton();
		Thread.sleep(3000);
	}

	@Then("^User should found Email in the Search table$")
	public void user_should_found_Email_in_the_Search_table() {
		//logger.info(" ========================= validation of search by email ================");
		//validation ---> iterate through the table to find if this email exit or not ---> so we just need to call that searchCustomerByEmail method we 
		//defined in the POM and the pass the parameter email. This method will return true if email exist in the table or false if not exist in the table
		//So we need to store the return value (true or false) in a variable and then we will write an assert stmt to validate
		boolean status = searchPage.searchCustomerByEmail("victoria_victoria@nopCommerce.com");
		Assert.assertEquals(true, status);
	}

	@Then("^close browser$")
	public void close_browser() {
		driver.quit();
	}
	
	// ================= Steps for searching the customer by First Name & Last Name =====================================
	//===================================================================================================================
	
	
	@When("^Enters customer FirstName$")
	public void enters_customer_FirstName() {
		searchPage = new SearchCustomerPage(driver);		
		searchPage.setFirstNameForSearch().sendKeys("Victoria");
	 }

	@When("^Enters customer LastName$")
	public void enters_customer_LastName() {
		searchPage.setLastNameForSearch().sendKeys("Terces");
	 }

	@Then("^User should found Name in the Search table$")
	public void user_should_found_Name_in_the_Search_table() {
		//logger.info("=================== validation of search by name ======================");
		boolean status = searchPage.searchCustomerByName("Victoria Terces");
		
		Assert.assertEquals(true, status);   
	}


	
	

}
