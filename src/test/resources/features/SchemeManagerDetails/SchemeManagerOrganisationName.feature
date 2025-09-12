@Test @OrganisationName @acceptance
Feature: Adding name of the organisation

  Background: Common Steps - QROPS Scheme Manager Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "Journey entry URL"
    When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "A2100005" on "Auth Login Stub Page"
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "Dashboard Page"
    And I click on "Start new transfer" hyperlink on "Dashboard Page"
    Then I am presented with the "What You Will Need Page"
    And I navigated to the "Organisation Name Page"
    And I should see the heading "What is the name of the organisation?"
    And I should see below input fields on "Organisation Name Page"
      | organisationName |

  Scenario:1. Positive journey - PSA/PSP enters a minimum of 1 character and a maximum 160 characters into the field
    When I enter the following data into corresponding input fields on "Organisation Name Page"
      | organisationName | Great Organisation |
    And I click save and continue button on "Organisation Name Page"
    Then I am presented with the "Organisation Individual Name Page"

  Scenario:2. Positive journey - PSA/PSP enters a minimum of 1 character into the field
    When I enter the following data into corresponding input fields on "Organisation Name Page"
      | organisationName | A |
    And I click save and continue button on "Organisation Name Page"
    Then I am presented with the "Organisation Individual Name Page"

  Scenario:3. Positive journey - PSA/PSP enters a minimum of 160 characters into the field
    When I enter the following data into corresponding input fields on "Organisation Name Page"
      | organisationName | Organisation Organisation Organisation Organisation Organisation Organisation Organisation Organisation Organisation Organisation Organisation Organisation Orga |
    And I click save and continue button on "Organisation Name Page"
    Then I am presented with the "Organisation Individual Name Page"

  Scenario:4. Negative Journeys - PSA/PSP enters invalid data in the organisation name field
    When I enter the following data into corresponding input fields on "Organisation Name Page"
      | organisationName | %% |
    And I click save and continue button on "Organisation Name Page"
    Then I am presented with the "Organisation Name Page" error page
    And I should see the "There is a problem" and below error messages
      | The name of the organisation must only include letters, spaces, apostrophes and hyphens |
    And I should see following erroneous fields are highlighted on "Organisation Name Page"
      | organisationName |
    And Clicking each error message should focus on the corresponding input field on "Organisation Name Page"

  Scenario:5. Negative Journeys - PSA/PSP does not enter anything in organisation name field
    When I enter the following data into corresponding input fields on "Organisation Name Page"
      | organisationName |  |
    And I click save and continue button on "Organisation Name Page"
    Then I am presented with the "Organisation Name Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the name of the organisation |
    And I should see following erroneous fields are highlighted on "Organisation Name Page"
      | organisationName |
    And Clicking each error message should focus on the corresponding input field on "Organisation Name Page"

  Scenario:6. Negative Journeys - PSA/PSP enters data > 160 characters in organisation name field
    When I enter the following data into corresponding input fields on "Organisation Name Page"
      | organisationName | Organisation Organisation Organisation Organisation Organisation Organisation Organisation Organisation Organisation Organisation Organisation Organisation Organisation Organisation Organisation Organisation |
    And I click save and continue button on "Organisation Name Page"
    Then I am presented with the "Organisation Name Page" error page
    And I should see the "There is a problem" and below error messages
      | The name of the organisation must be 160 characters or less|
    And I should see following erroneous fields are highlighted on "Organisation Name Page"
      | organisationName |
    And Clicking each error message should focus on the corresponding input field on "Organisation Name Page"