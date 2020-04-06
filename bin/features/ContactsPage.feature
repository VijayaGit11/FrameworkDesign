Feature: Contacts page feature

Description: This feature is to validate contacts page

Scenario: Contacts page validation

Given User open browser and launch Free CRM
Then User login to Free CRM
|username|password|
|vijaya.zambre@gmail.com|Freecrm#11|
Then User moves to new Contacts page
Then User fills below details
|FirstName|LastName|
|Scotts|Hick|
|Pauls|Kirk|
Then user quits from application