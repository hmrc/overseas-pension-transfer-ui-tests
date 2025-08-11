@Test @AddProperty @acceptance
Feature: Start Page of Adding Property

  Background: Common Steps - Transfer Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "What You Will Need Page"
    When I enter Enrollment Key "HMRC-PODSPP-ORG", Identifier Name "PSPID" and Identifier Value "2131231231231" on "Auth Login Stub Page"
    And I click submit button on "Auth Login Stub Page"
    And I am presented with the "What You Will Need Page"
    And I navigated to the "Add Property Start Page"
    Then I am presented with the "Add Property Start Page"

  Scenario:1. Positive journey - PSA/PSP enters data into all the fields in Add Property Address page
    And I should see the heading "Add property"
    And I should see the following values on the page
      | The following questions are about property that is part of this transfer. |
    And I click save and continue button on "Add Property Start Page"
    Then I am presented with the "Property Address Page"
    And I should see the heading "What is the property address?"
    When I enter the following data into corresponding input fields on "Property Address Page"
      | addressLine1 | addressLine1         |
      | addressLine2 | addressLine2         |
      | addressLine3 | addressLine3         |
      | addressLine4 | addressLine4         |
      | countryCode  | United Kingdom       |
      | postcode     | postcode             |
    And I click save and continue button on "Property Address Page"
    Then I am presented with the "Value Of Property Page"

  Scenario:2. Positive journey - PSA/PSP enters data in required fields only in Add Property Address page
    And I should see the heading "Add property"
    And I should see the following values on the page
      | The following questions are about property that is part of this transfer. |
    And I click save and continue button on "Add Property Start Page"
    Then I am presented with the "Property Address Page"
    When I enter the following data into corresponding input fields on "Property Address Page"
      | addressLine1 | addressLine1         |
      | addressLine2 | addressLine2         |
      | countryCode  | United Kingdom       |
      | postcode     | postcode             |
    And I click save and continue button on "Property Address Page"
    Then I am presented with the "Value Of Property Page"