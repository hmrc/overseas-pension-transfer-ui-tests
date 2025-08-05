@Test @QROPSName @acceptance
Feature: Adding name of the QROPS

  Background: Common Steps - QROPS Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "What You Will Need Page"
    When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "2131231231231" on "Auth Login Stub Page"
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "What You Will Need Page"
    And I navigated to the "QROPS Name Page"
    And I should see the heading "What is the full name of the QROPS receiving the transfer?"
    And I should see below input fields on "QROPS Name Page"
      | value |

  Scenario:1. Positive journey - PSA/PSP enters name between 1 and 160 characters (inclusive) with spaces, apostrophes and/or hyphen and is accepted successfully
    When I enter the following data into corresponding input fields on "QROPS Name Page"
      | value | The great QROPS|
      | value | A |
      | value | The great QROPs The great QROPs The great QROPs The great QROPs The great QROPs The great QROPs The great QROPs The great QROPs The great QROPs The great QaROPs |
      | value | The Great - QROPS|
    And I click save and continue button on "QROPS Name Page"
    Then I am presented with the "QROPS Number Page"

  Scenario:2. Negative Journeys - PSA/PSP does not enter anything in QROPS name field
    When I enter the following data into corresponding input fields on "QROPS Name Page"
      | value |  |
    And I click save and continue button on "QROPS Name Page"
    Then I am presented with the "QROPS Name Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the full name of the QROPS receiving the transfer |
    And I should see following erroneous fields are highlighted on "QROPS Name Page"
      | value |
    And Clicking each error message should focus on the corresponding input field on "QROPS Name Page"

  Scenario:3. Negative Journeys - PSA/PSP enters data > 160 characters in QROPS name field
    When I enter the following data into corresponding input fields on "QROPS Name Page"
      | value | The great QROPs The great QROPs The great QROPs The great QROPs The great QROPs The great QROPs The great QROPs The great QROPs The great QROPs The great QaROPs The great QROPs|
    And I click save and continue button on "QROPS Name Page"
    Then I am presented with the "QROPS Name Page" error page
    And I should see the "There is a problem" and below error messages
      | The full name of the QROPS must be 160 characters or less|
    And I should see following erroneous fields are highlighted on "QROPS Name Page"
      | value |
    And Clicking each error message should focus on the corresponding input field on "QROPS Name Page"