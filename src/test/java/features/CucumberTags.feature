@FunctionalTest
Feature: Free CRM Feature

@SmokeTest @RegressionTest
Scenario: Login with correct usernm and password
Given This is valid login test

@SmokeTest
Scenario: Login with invalid username and password
Given This is invalid login test

@SmokeTest
Scenario: Create Contact
Given This is contact test case

@SmokeTest
Scenario: Create deal
Given This is deal test case 

@SmokeTest @RegressionTest
Scenario: Create Task
Given This is task test case

@RegressionTest
Scenario: Create case
Given This is case test case

@SmokeTest
Scenario: Seach deal
Given This is search deal test

@RegressionTest
Scenario: Seach contact
Given This is search contact test

@RegressionTest @E2ETest
Scenario: Seach task
Given This is search task test

@SmokeTest @RegressionTest
Scenario: Seach a call
Given This is search a call test

@SmokeTest @RegressionTest
Scenario: Seach an email
Given This is search email test

@RegressionTest @E2ETest
Scenario: Seach docs
Given This is search forms test

@E2ETest
Scenario: Validate a report
Given This is report test

@E2ETest
Scenario: Application logout
Given This is application logout test
