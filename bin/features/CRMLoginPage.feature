Feature: Login page feature
  
  Description: This feature is for Login Page validation

#  Scenario Outline: Login Page validation
Scenario: :Login page validation
  
    Given User is already on Login screen
    Then User enters username and password
#    Then User enters "<username>" and "<password>"
    Then User clicks on submit button
#    Then user is on home page
#    And User navigates to deals page
    Then User closes the browser
    
#    Examples: 
#      | username                | password   |
#      | Vijaya.Zambre@gmail.com | Freecrm#11 |
