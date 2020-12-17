Feature: Customer

Background: Below are common steps for every scenario
	Given user launch Chrome browser
	When user opens URL "http://admin-demo.nopcommerce.com/login"
	And user enters Email as "admin@yourstore.com" and "admin" as password
	And user clicks on login
	Then user can view Dashboard
	
@regression
Scenario: Add a new customer
	
	When user clicks on customers Menu
	And clicks on customers Menu item
	And clicks on Add new button
	Then user can view Add new customer page
	When user enters customer info
	And clicks on Save button
	Then User can view confirmation massage "The new customer has been added successfully." 
	And user close browser

@regression	
Scenario: Search Customer by EmailID
	
	When user clicks on customers Menu
	And clicks on customers Menu item
	And Enters customer Email
	When clicks on search button
	Then User should found Email in the Search table
	And close browser

@sanity
Scenario: Search Customer by Name

	When user clicks on customers Menu
	And clicks on customers Menu item
	And Enters customer FirstName
	And Enters customer LastName
	When clicks on search button
	Then User should found Name in the Search table
	And close browser
	
	