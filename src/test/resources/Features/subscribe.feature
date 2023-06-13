@all_tests @subscribeNewsletter
Feature: Subscribe Newsletter

    Background:
    Given Unregistered user goes to MLHub
    Then Unregistered user verifies onsite


    @Test01_ValidEmail
    Scenario Outline: Test01_ValidEmail
    When Unregistered user enters "<validEmail>" validEmail into text box
    And Unregistered user clicks on subscribe button
    Then Unregistered user verifies succesfully Message

        Examples: validEmail
        | validEmail |
        |a@nioyatech.com|

    @Test02_invalidEmail
    Scenario Outline: Test02_inValidEmail
    When Unregistered user enters "<invalidEmail>" invalidEmail into text box
    And Unregistered user clicks on subscribe button
    Then Unregistered user verifies invalid error Message

        Examples: invalid Email
        | invalidEmail |
        |mia@nioyatech|

    @Test03_registeredEmail
    Scenario Outline: Test03_registeredEmail
        When Unregistered user enters "<registeredEmail>" registeredEmail into text box
        And Unregistered user clicks on subscribe button
        Then Unregistered user verifies already exist Message

        Examples: validEmail
            | registeredEmail |
            |mia@nioyatech.com|