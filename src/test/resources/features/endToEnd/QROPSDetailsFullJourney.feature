@Test @QROPsDetailsE2E @acceptance
Feature: Is the members details journey fully connected

  Background: Common Steps
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "What You Will Need Page"
    When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "2131231231231" on "Auth Login Stub Page"
    And I click submit button on "Auth Login Stub Page"

  Scenario:1. Full QROPS Details - Valid country Selected
    When I navigated to the "QROPS Name Page"
    And I should see the heading "What is the full name of the QROPS receiving the transfer?"
    And I should see below input fields on "QROPS Name Page"
      | qropsName |
    When I enter the following data into corresponding input fields on "QROPS Name Page"
      | qropsName | The great QROPS|
    And I click save and continue button on "QROPS Name Page"
    Then I am presented with the "QROPS Reference Page"
    When I enter the following data into corresponding input fields on "QROPS Reference Page"
      | qropsRef | QROPS123456 |
    And I click save and continue button on "QROPS Reference Page"
    Then I am presented with the "QROPS Address Page"
    When I enter the following data into corresponding input fields on "QROPS Address Page"
      | addressLine1 | 12 Burlington Avenue |
      | addressLine2 | Burlington Road      |
      | addressLine3 | Maidenhead           |
      | addressLine4 | Berkshire            |
      | addressLine5 | London               |
      | countryCode  | United Kingdom       |
    And I click save and continue button on "QROPS Address Page"
    Then I am presented with the "QROPS Country Page"
    When I enter the following data into corresponding input fields on "QROPS Country Page"
      | countryCode | United Kingdom|
    And I click save and continue button on "QROPS Country Page"
    And I click save and continue button on "QROPS Country Page"
    Then I am presented with the "QROPS Check Your Answers Page"

  Scenario:2. Full QROPS Details - Other country selected
    When I navigated to the "QROPS Name Page"
    And I should see the heading "What is the full name of the QROPS receiving the transfer?"
    And I should see below input fields on "QROPS Name Page"
      | qropsName |
    When I enter the following data into corresponding input fields on "QROPS Name Page"
      | qropsName | The great QROPS|
    And I click save and continue button on "QROPS Name Page"
    Then I am presented with the "QROPS Reference Page"
    When I enter the following data into corresponding input fields on "QROPS Reference Page"
      | qropsRef | QROPS123456 |
    And I click save and continue button on "QROPS Reference Page"
    Then I am presented with the "QROPS Address Page"
    When I enter the following data into corresponding input fields on "QROPS Address Page"
      | addressLine1 | 12 Burlington Avenue |
      | addressLine2 | Burlington Road      |
      | addressLine3 | Maidenhead           |
      | addressLine4 | Berkshire            |
      | addressLine5 | London               |
      | countryCode  | United Kingdom       |
    And I click save and continue button on "QROPS Address Page"
    Then I am presented with the "QROPS Country Page"
    When I enter the following data into corresponding input fields on "QROPS Country Page"
      | countryCode | Other |
    And I click save and continue button on "QROPS Country Page"
    And I click save and continue button on "QROPS Country Page"
    Then I am presented with the "QROPS Other Country Page"
    When I enter the following data into corresponding input fields on "QROPS Other Country Page"
      | otherEstablishedCountry | Wales |
    And I click save and continue button on "QROPS Other Country Page"
    Then I am presented with the "QROPS Check Your Answers Page"
