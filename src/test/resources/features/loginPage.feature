@Login @Severity=Blocker
Feature: Login to the Application

  Background: 
    Given The user in on the Login page

  Scenario: Successful Login
    When The user enter username and password
    And Click on Login button
    Then User is navigated to home page

  Scenario Outline: Un-Successful Login
    When The user enter "<username>" and password
    And Click on Login button
    Then User is not navigated to home page

    Examples: 
      | username  |
      | invalid_1 |
      | invalid_2 |

  Scenario: Check Data Table
  When Check the datatable
  |user   | pass  |  Location |
  | saket | saketpass | saketLocation|
  | rocky | rockypass | rockyLocation|
  
  Then checklist
  |sree|
  |saket|

      
      
      
   