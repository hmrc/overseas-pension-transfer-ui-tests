@Test @SchemeManagerDetailsE2E @acceptance
Feature: Is the members details journey fully connected

  Background: Common Steps
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "What You Will Need Page"
    When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "2131231231231" on "Auth Login Stub Page"
    And I click submit button on "Auth Login Stub Page"

  Scenario:1. Full Scheme Manager Details Journey - Individual
    And I navigated to the "Scheme Manager Type Page"
    Then I am presented with the "Scheme Manager Type Page"
    When I select radio button "Individual" on "Scheme Manager Type Page"
    And I click save and continue button on "Scheme Manager Type Page"
    Then I am presented with the "Scheme Manager Name Page"
    When I enter the following data into corresponding input fields on "Scheme Manager Name Page"
      | schemeManagersFirstName | John |
      | schemeManagersLastName | Doe  |
    And I click save and continue button on "Scheme Manager Name Page"
    Then I am presented with the "Scheme Manager Address Page"
    When I enter the following data into corresponding input fields on "Scheme Manager Address Page"
      | addressLine1 | 12 Burlington Avenue |
      | addressLine2 | Burlington Road      |
      | addressLine3 | Maidenhead           |
      | addressLine4 | Berkshire            |
      | addressLine5 | London               |
      | countryCode  | United Kingdom       |
    And I click save and continue button on "Scheme Manager Address Page"
    Then I am presented with the "Scheme Manager Email Page"
    When I enter the following data into corresponding input fields on "Scheme Manager Email Page"
      | emailAddress | thismail@gmail.com |
    And I click save and continue button on "Scheme Manager Email Page"
    Then I am presented with the "Scheme Manager Telephone Page"
    When I enter the following data into corresponding input fields on "Scheme Manager Telephone Page"
      | contactNumber | +441234567890 |
    And I click save and continue button on "Scheme Manager Telephone Page"
    Then I am presented with the "Scheme Manager Check Your Answer Page"

  Scenario:2. Full Scheme Manager Details Journey - Organisation
    And I navigated to the "Scheme Manager Type Page"
    Then I am presented with the "Scheme Manager Type Page"
    When I select radio button "Organisation" on "Scheme Manager Type Page"
    And I click save and continue button on "Scheme Manager Type Page"
    Then I am presented with the "Organisation Name Page"
    When I enter the following data into corresponding input fields on "Organisation Name Page"
      | organisationName | Great Organisation |
    And I click save and continue button on "Organisation Name Page"
    Then I am presented with the "Organisation Individual Name Page"
    When I enter the following data into corresponding input fields on "Organisation Individual Name Page"
      | orgIndFirstName | John |
      | orgIndLastName | Doe  |
    And I click save and continue button on "Scheme Manager Name Page"
    Then I am presented with the "Scheme Manager Address Page"
    When I enter the following data into corresponding input fields on "Scheme Manager Address Page"
      | addressLine1 | 12 Burlington Avenue |
      | addressLine2 | Burlington Road      |
      | addressLine3 | Maidenhead           |
      | addressLine4 | Berkshire            |
      | addressLine5 | London               |
      | countryCode  | United Kingdom       |
    And I click save and continue button on "Scheme Manager Address Page"
    Then I am presented with the "Scheme Manager Email Page"
    When I enter the following data into corresponding input fields on "Scheme Manager Email Page"
      | emailAddress | thismail@gmail.com |
    And I click save and continue button on "Scheme Manager Email Page"
    Then I am presented with the "Scheme Manager Telephone Page"
    When I enter the following data into corresponding input fields on "Scheme Manager Telephone Page"
      | contactNumber | +441234567890 |
    And I click save and continue button on "Scheme Manager Telephone Page"
    Then I am presented with the "Scheme Manager Check Your Answer Page"
