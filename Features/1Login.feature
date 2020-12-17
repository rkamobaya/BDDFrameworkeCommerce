Feature: Login functionality

@sanity
Scenario: Testing of the login page
	Given user launch Chrome browser
	When user opens URL "http://admin-demo.nopcommerce.com/login"
	And user enters Email as "admin@yourstore.com" and "admin" as password
	And user clicks on login
	Then page title should be "Dashboard / nopCommerce administration"
	When user click on Logout link 
	Then page title should be "Your store. Login"
	And user close browser

@regression	
Scenario Outline: login data driven
	Given user launch Chrome browser
	When user opens URL "http://admin-demo.nopcommerce.com/login"
	And user enters Email as "<email>" and "<password>" as password
	And user clicks on login
	Then page title should be "Dashboard / nopCommerce administration"
	When user click on Logout link 
	Then page title should be "Your store. Login"
	And user close browser
	
	Examples:
		|email                   | password    |
		|admin@yourstore.com     | admin       |
		|admin@yourstore.com     | admin123    |
	
