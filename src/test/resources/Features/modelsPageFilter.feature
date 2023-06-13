@all_tests @modelsPageFilter
Feature: Models Page Filter

  Background:
    Given Unregistered user goes to MLHub
    Then  Unregistered user verifies onsite
    When  Unregistered user clicks Models button
    Then  Unregistered user verifies on Models Page

  @Test01_SortSelectBoxMostViwed
  Scenario: Test01_SortSelectBoxMostViwed
    When Unregistered user clicks Sort Select Box
    And Unregistered user selects MostViwed
    Then Unregistered user verifies Most Viwed
    When  Unregistered user goes to next page
    Then Unregistered user verifies go to second page
    And Unregistered user verifies Most Viwed
    And Unregistered user clicks Sort Select Box
    And Unregistered user selects MostLiked
    Then Unregistered user verifies Most Liked
    And Unregistered user verifies back to first page

  @Test02_SortSelectBoxLastUpdated
  Scenario: Test02_SortSelectBoxLastUpdated
    When Unregistered user clicks Sort Select Box
    And Unregistered user selects LastUpdated
    Then Unregistered user verifies Last Updated


  @Test03_SortSelectBoxMostLiked
  Scenario: Test03_SortSelectBoxMostLiked
    When Unregistered user clicks Sort Select Box
    And Unregistered user selects MostLiked
    Then Unregistered user verifies Most Liked
    When  Unregistered user goes to next page
    Then Unregistered user verifies go to second page
    And Unregistered user verifies Most Liked


  @Test04_randomlyClicksOnOneOfCheckboxes
  Scenario: Test04_randomlyClicksOnOneOfCheckboxes
    When Unregistered user randomly clicks one of the checkboxes
    Then Unregistered user verifies randomly clicks one of the checkboxes


  @Test05_randomlyClicksOnTwoOfCheckboxes
  Scenario: Test05_randomlyClicksOnTwoOfCheckboxes
    When Unregistered user randomly clicks on two of the checkboxes
    Then Unregistered user verifies first clicked checkbox
    Then Unregistered user verifies second clicked checkbox
  #  Then Unregistered user verifies numbers of models displayed


  @Test06_clickOnOneOfTheModelFiltersInTheDomainSection
  Scenario: Test06_clickOnOneOfTheModelFiltersInTheDomainSection
    When Unregistered user randomly clicks on one of the Model Filters in the DomainSection
    Then Unregistered user verifies clicked on one of the Model Filters
    Then Unregistered user verifies filtered model count


  @Test07_clickOnTwoOfTheModelFiltersInTheDomainSection
  Scenario: Test07_clickOnTwoOfTheModelFiltersInTheDomainSection
    When Unregistered user randomly clicks on two of the Model Filters in the DomainSection
    Then Unregistered user verifies first clicked filter
    Then Unregistered user verifies second clicked filter
  # Then Unregistered user verifies numbers of models displayed


  @Test08_clickOnOneOfTheModelFiltersInTheAIFieldSection
  Scenario: Test08_clickOnOneOfTheModelFiltersInTheAIFieldSection
    When Unregistered user randomly clicks on one of the Model Filters in the AIFieldSection
    Then Unregistered user verifies clicked on one of the Model Filters
    Then Unregistered user verifies filtered model count


  @Test09_clickOnTwoOfTheModelFiltersInTheAIFieldSection
  Scenario: Test09_clickOnTwoOfTheModelFiltersInTheAIFieldSection
    When Unregistered user randomly clicks on two of the Model Filters in the AIFieldSection
    Then Unregistered user verifies first clicked filter
    Then Unregistered user verifies second clicked filter
  # Then Unregistered user verifies numbers of models displayed


  @Test10_clickOnOneOfTheModelFiltersInTheTaskSection
  Scenario: Test10_clickOnOneOfTheModelFiltersInTheTaskSection
    When Unregistered user randomly clicks on one of the Model Filters in the TaskSection
    Then Unregistered user verifies clicked on one of the Model Filters
    Then Unregistered user verifies filtered model count


  @Test11_clickOnTwoOfTheModelFiltersInTheTaskSection
  Scenario: Test11_clickOnTwoOfTheModelFiltersInTheTaskSection
    When Unregistered user randomly clicks on two of the Model Filters in the TaskSection
    Then Unregistered user verifies first clicked filter
    Then Unregistered user verifies second clicked filter
  # Then Unregistered user verifies numbers of models displayed


  @Test12_clickOnOneOfTheModelFiltersInTheLanguageSection
  Scenario: Test12_clickOnOneOfTheModelFiltersInTheLanguageSection
    When Unregistered user randomly clicks on one of the Model Filters in the LanguageSection
    Then Unregistered user verifies clicked on one of the Model Filters


  @Test13_clickOnTwoOfTheModelFiltersInTheLanguageSection
  Scenario: Test13_clickOnTwoOfTheModelFiltersInTheLanguageSection
    When Unregistered user randomly clicks on two of the Model Filters in the LanguageSection
    Then Unregistered user verifies first clicked filter
    Then Unregistered user verifies second clicked filter


  @Test14_clickOnTwoOfTheModelFiltersInTheMoreDomainSection
  Scenario: Test14_clickOnTwoOfTheModelFiltersInTheMoreDomainSection
  When Unregistered user clicks moreDomainElementsButton
  And Unregistered user randomly clicks on two of the checkboxes
  And Unregistered user clicks BackButton
  Then Unregistered user verifies first clicked checkbox
  And Unregistered user verifies second clicked checkbox
  When Unregistered user Clears all DomainCheckboxes
  And Unregistered user verifies Cleared all checkboxes


  @Test15_clickOnTwoOfTheModelFiltersInTheMoreTaskSection
  Scenario: Test15_clickOnTwoOfTheModelFiltersInTheMoreTaskSection
    When Unregistered user clicks moreTaskElementsButton
    And Unregistered user randomly clicks on two of the checkboxes
    And Unregistered user clicks BackButton
    Then Unregistered user verifies first clicked checkbox
    And Unregistered user verifies second clicked checkbox
    When Unregistered user Clears all TaskCheckboxes
    And Unregistered user verifies Cleared all checkboxes


  @Test16_clickOnTwoOfTheModelFiltersInTheMoreLanguageSection
  Scenario: Test16_clickOnTwoOfTheModelFiltersInTheMoreLanguageSection
    When Unregistered user clicks moreLanguageElementsButton
    And Unregistered user randomly clicks on two of the checkboxes
    And Unregistered user clicks BackButton
    Then Unregistered user verifies first clicked checkbox
    And Unregistered user verifies second clicked checkbox
    When Unregistered user Clears all LanguageCheckboxes
    And Unregistered user verifies Cleared all checkboxes


  @Test18_modelPageSearchBox
  Scenario Outline: 18_modelPageSearchBox
    When Unregistered user enters "<searchedWord>" word into search box
    Then Unregistered user verifies viewed models "<searchedWord>"
    Then Unregistered user verifies Most Viwed
    And Unregistered user clicks Sort Select Box
    And Unregistered user selects MostLiked
    Then Unregistered user verifies Most Liked
    When Unregistered user clears the search box
    Then Unregistered user verifies clear the search box
    When Unregistered user enters "<searchedWord>" word into search box
    Then Unregistered user verifies viewed models "<searchedWord>"
    Then Unregistered user verifies Most Liked

    Examples: validEmail
      |searchedWord|
       |health|
       |nlp|
      #|***|



   # @Test17_clicksAllCheckboxes
   # Scenario: Test17_clicksAllCheckboxes
     # When Unregistered user clicks all checkboxes
    # Then Unregistered user verifies clicked all checkboxes
    #  When Unregistered user Clears all checkboxes
    # Then Unregistered user verifies Cleared all checkboxes


