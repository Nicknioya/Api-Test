@login
Feature: login
  @Test01_login
Scenario Outline: Test01_login
    Given Unregistered user goes to MLHub
    Then  Unregistered user verifies onsite
    When Unregistered user clicks on login button
    Then Unregistered user verifies click on login button
    When Admin enters "<username>" username into text box
    And Admin enters "<password>" password into text box
    And Admin clicks on sign in button
   Then Admin verifies successful login

      Examples: user information
          | username | password|
          |mia@nioyatech.com|Pl123456@|