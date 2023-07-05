Feature: Login Functionality

@SmokeTest
  Scenario: Login should be successful with Valid credentials
    Given Website opened successful
    And Enter username and Password
    Then Click on the login button
    Then User should be able to login successfully

 Scenario Outline: Login should be successful with Valid credentials2
    Given Website opened successful
    And Enter <username> and <Password> fields
    Then Click on the login button
    Then User should be able to login successfully
    
Examples:
| username | Password | 
| Vamsi | ganesh |
| Sai   |Sree|
    
 