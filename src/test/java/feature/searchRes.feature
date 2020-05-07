Feature: Use the website to find restaurants for hungry customer in my area 

Scenario: search for restaurants in area 

	Given I want food in "AR51 1AA" 
	When I search for restaurants 
	Then I should see some restaurants in "AR51 1AA" 
	Then Close the browser