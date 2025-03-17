@Test @OrganisationName
Feature: Adding name of the organisation

  Background: Common Steps - QROPS Scheme Manager Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "Overseas Transfer Index Page"
    # And I enter redirect URL on Auth Login Stub Page for "Is Member Currently UK Resident Page"
    # Redirection currently does not work for any other page other than the Index page
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "Overseas Transfer Index Page"
    And I navigated to the "Organisation Name Page"
    And I should see the heading "What is the name of the organisation?"
    And I should see below input fields on "Organisation Name Page"
      | organisationName |

  Scenario:1. Positive journey - PSA/PSP enters a minimum of 1 character and a maximum 160 characters into the field
    When I enter the following data into corresponding input fields on "Organisation Name Page"
      | organisationName | A name of a Organisation |
    And I click save and continue button on "Organisation Name Page"
    Then I am presented with the "Overseas Transfer Index Page"
# Above action would have to be rewritten upon page gets connected

  Scenario Outline:2. Negative Journeys - PSA/PSP enters erroneous data in the organisation name field
    When I enter the following data into corresponding input fields on "Organisation Name Page"
      | organisationName | <inputValue> |
    And I click save and continue button on "Organisation Name Page"
    Then I am presented with the "Organisation Name Page" error page
    And I should see the "There is a problem" and below error messages
      | <errorMessage> |
    And I should see following erroneous fields are highlighted on "Organisation Name Page"
      | organisationName |
    And Clicking each error message should focus on the corresponding input field on "Organisation Name Page"

    Examples:
      | inputValue                    | errorMessage                                                                            |
      |                               | Enter the name of the organisation                                                      |
      | A @ invalid organisation name | The name of the organisation must only include letters, spaces, apostrophes and hyphens |
