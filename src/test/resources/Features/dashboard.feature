@dashboard
Feature: dashboard

  Background:
     Given Unregistered user goes to MLHub
    Then  Unregistered user verifies onsite
    When Unregistered user clicks on login button
    Then Unregistered user verifies click on login button


  @Test01
  Scenario Outline: Test01_dashboardMostViwedOfSection
    When Admin enters "<username>" username into text box
    And Admin enters "<password>" password into text box
    And Admin clicks on sign in button
    Then Admin verifies successful login
    When Unregistered user clicks Models button
    Then Unregistered user verifies on Models Page
    When Unregistered user clicks Sort Select Box
    And Unregistered user selects MostViwed
    Then Unregistered user verifies Most Viwed
    Then Admin verifies top five most viewed models on dashboard page

    Examples: user information
      | username | password|
      |mia@nioyatech.com|Pl123456@|

  @Test02
  Scenario Outline: Test02_dashboardMostLikedOfSection
    When Admin enters "<username>" username into text box
    And Admin enters "<password>" password into text box
    And Admin clicks on sign in button
    Then Admin verifies successful login
    When Unregistered user clicks Models button
    Then Unregistered user verifies on Models Page
    When Unregistered user clicks Sort Select Box
    And Unregistered user selects MostLiked
    Then Unregistered user verifies Most Liked
    When Admin verifies top five most liked models on dashboard page

    Examples: user information
      | username | password|
      |mia@nioyatech.com|Pl123456@|


  @Test03
    Scenario Outline:: Test03_dashboardVerifyUsage
    When Admin enters "<username>" username into text box
    And Admin enters "<password>" password into text box
    And Admin clicks on sign in button
    Then Admin verifies successful login
    When Admin goes to reports page
    Then Admin verifies on reports page
    When Admin gets the number of models run in the report
    When Admin goes to dashboards page
    Then Admin verifies on dashboards page
    Then Admin verifies number of models run in reports equals number of usages on dasboard


    Examples: user information
      | username | password|
      |mia@nioyatech.com|Pl123456@|

  @Test04
  Scenario Outline:: Test04_dashboardVerifyCreditBalance
    When Admin enters "<username>" username into text box
    And Admin enters "<password>" password into text box
    And Admin clicks on sign in button
    Then Admin verifies successful login
    Then Admin verifies that wallet balance and credit balance are equal

    Examples: user information
      | username | password|
      |mia@nioyatech.com|Pl123456@|

