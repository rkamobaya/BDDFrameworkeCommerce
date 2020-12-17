package stepDefinitions;

import java.util.Properties;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.apache.commons.lang.RandomStringUtils;
import PageObjectModel.AddcustomerPage;
import PageObjectModel.LoginPage;
import PageObjectModel.SearchCustomerPage;

public class BaseClass {
	
	public WebDriver driver;
	public LoginPage lp;
	public AddcustomerPage addCust;
	public SearchCustomerPage searchPage;
	public static Logger logger;          //I make it static because this a same variable I will be referring to every in step method later.
	public Properties configProp;        //I create an object of properties class. This particular variable configProp, I will instantiate inside of steps file
	
	
	/*
	 * public void setup() throws IOException {
	 * logger=Logger.getLogger("nopCommerce");
	 * PropertyConfigurator.configure("log4j.properties");
	 * 
	 * configProp = new Properties(); FileInputStream configPropFile = new
	 * FileInputStream(
	 * "C:\\Users\\rkamo\\eclipse-workspace\\BDDFrameworkeCommerce\\config.properties"
	 * ); configProp.load(configPropFile);
	 * 
	 * 
	 * String br = configProp.getProperty("browser"); if(br.equals("chrome")) {
	 * System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+
	 * "//Drivers//chromedriver.exe"); driver = new ChromeDriver(); } else
	 * if(br.equals("edge")) {
	 * System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+
	 * "//Drivers//msedgedriver2.exe"); driver = new EdgeDriver(); } else
	 * if(br.equals("firefox")) {
	 * System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+
	 * "//Drivers//geckodriver.exe"); driver = new FirefoxDriver(); }
	 * 
	 * 
	 * //In the first method if I add many tasks here, later on it will difficult to
	 * manage. What I can to do is to create one separate method and inside //this
	 * method which I call setup(). And inside of this method (above) I create all
	 * the configuration cad Logger configuration, driver configuration and now
	 * //reading properties file configuration. Every will be in setup() and then I
	 * will one Cucumber hook, a Cucumber concept, so this method will execute only
	 * //one time before starting the class. So I have to remove Logger
	 * instantiation and driver configuration and write them in setup() method. }
	 */
	
	
	
	
	
	//Created for generating random string for unique email ---to allow us to do Data Driven Testing 
	public static String randomestring()
	{
		//There is a class RandomStringUtils in Java to create string randomly. From this class I'm using randomAlphabetic method to 
		//generate randomly in 5 character strings in alphabetical order. This class is static. Using that class I call the method
		//So whenever I need to generate some random values or random strings just I need to call that method.
		//Then I store that random string in a string variable. And I return that string.
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
		
	}
	
	
	

}
