Feature: Change Password Feature

  Scenario: Login with valid credentials
    Given user navigates to change password page
    And enters valid credentials and hits update button
    Then password should be changed successfully. 
    
   

  Scenario: Login with valid credentials
    Given user navigates to change password page
    And enters invalid credentials and hits update button
    Then password should be changed successfully. 
