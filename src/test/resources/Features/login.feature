# This is a place where you write the manual tcs
#Feature: particular feature you are testing
#Scenario: Normal tc
#Scenario Outline: tc having parametes or test data
#Examples: test data
#Given precondition
#When action
#Then outcome
#And connecting two statements
#But error msg or negative testing
Feature: To test the login functionality of orangehrm app

  #Scenario: User should be able to login with valid credentials
  #Given User should open chrome browser
  #And User should be navigated to orange hrm launch page
  #When User enters valid username "Admin"
  #And User enters valid password "admin123"
  #And User click on login button
  #Then User should navigate to dashboard page
  #And User logout of app and close the chrome browser
  
  
  Scenario Outline: User should be able to login with valid credentials
    Given User should open chrome browser
    And User should be navigated to orange hrm launch page
    When User enters valid username <id>
    And User enters valid password <pwd>
    And User click on login button
    Then User should navigate to dashboard page
    And User logout of app and close the chrome browser

    Examples: 
      | id     | pwd       |
      | Admin  | admin123  |
      | Admin2 | admin1234 |
