Feature: Testing login functionality


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

  Scenario: User should be able to login with valid credentials
    Given User should open chrome browser
    And User should be navigated to orange hrm launch page
    When User enters valid username Admin
    And User enters valid password admin123
    And User click on login button
    Then User should navigate to dashboard page
    And User click on Admin module
    Then User verify System Users is displayed
