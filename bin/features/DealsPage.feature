Feature: Deals Page feature
  
  Description: This feature validates deals page

  Scenario: Deals page Scenario
 	Given User opens the browsers
 	Then User enters EmailId and password
 		| vijaya.zambre@gmail.com | Freecrm#11 |
 	Then User clicks on Submit button
 	Then User moves to new deals page
 	Then User enters deals details
 	| Mrs | Free CRM Description | New |
 	Then User closes the Chrome browser
    