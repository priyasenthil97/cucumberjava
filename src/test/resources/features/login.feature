Feature: Login screen

  Scenario: check login is successful with valid credential
    Given User is on login page
    When user enters user name and password
    And clicks on login button
    Then user is navigated to home page

    
    
    