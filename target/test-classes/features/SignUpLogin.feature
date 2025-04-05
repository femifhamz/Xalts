Feature: User Sign Up, Login, and Sign Out

  Scenario: Successful Sign Up
    Given User opens the browser and navigates to the portal
    Then Navigate to signup page
    When User enters email "femi199@gmail.com", password "@Tatabyebye05", and confirm password "@Tatabyebye05"
    And User clicks on sign up
    Then User clicks on sign out

  Scenario: Successful Login
    Given User opens the browser and navigates to the portal
    Then Navigate to signin page and click here
    When User enters login email "femi199@gmail.com" and password "@Tatabyebye05"
    And User clicks on login
    Then User clicks on sign out

  Scenario: Sign Up with mismatched passwords
    Given User opens the browser and navigates to the portal
    Then Navigate to signup page
    When User enters email "fem123@gmail.com", password "@Tatabyebye09", and confirm password "@Tatabyebye07"
    Then Verify sign up button is disabled and error message is displayed
    
