@CheckHomePage @TestNG
@severity=Normal
Feature: Check Home Page

  Background: 
    Given The user in on the Home Page

  Scenario: Validate Home Page
    When The user validate page hello
    Then User validate the button text
