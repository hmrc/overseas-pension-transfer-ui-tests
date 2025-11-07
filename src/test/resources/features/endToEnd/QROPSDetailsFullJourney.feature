@Test @QROPsDetailsE2E @acceptance @regression
Feature: Is the members details journey fully connected

  Background: Common Steps
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "Journey entry URL"
    When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "A2100005" on "Auth Login Stub Page"
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "Dashboard Page"
    And I click on "Start new transfer" hyperlink on "Dashboard Page"
    And I click save and continue button on "What You Will Need Page"

  Scenario:1. Full QROPS Details - Valid country Selected
    When I navigated to the "QROPS Name Page"
    And I should see the heading "What is the full name of the QROPS receiving the transfer?"
    And I should see below input fields on "QROPS Name Page"
      | qropsName |
    When I enter the following data into corresponding input fields on "QROPS Name Page"
      | qropsName | The great QROPS |
    And I click save and continue button on "QROPS Name Page"
    Then I am presented with the "QROPS Reference Page"
    When I enter the following data into corresponding input fields on "QROPS Reference Page"
      | qropsRef | QROPS123456 |
    And I click save and continue button on "QROPS Reference Page"
    Then I am presented with the "QROPS Address Page"
    When I enter the following data into corresponding input fields on "QROPS Address Page"
      | addressLine1 | 21 Rosewood Close |
      | addressLine2 | Maple Hill Estate |
      | addressLine3 | Basingstoke       |
      | addressLine4 | Hampshire         |
      | addressLine5 | England           |
      | countryCode  | United Kingdom    |
    And I click save and continue button on "QROPS Address Page"
    Then I am presented with the "QROPS Country Page"
    When I enter the following data into corresponding input fields on "QROPS Country Page"
      | countryCode | United Kingdom |
    And I click save and continue button on "QROPS Country Page"
    And I click save and continue button on "QROPS Country Page"
    Then I am presented with the "QROPS Check Your Answers Page"
    And I should see the following details
      | Full name                  | The great QROPS                                                                  |
      | Reference                  | QROPS123456                                                                      |
      | Address                    | 21 Rosewood Close,Maple Hill Estate,Basingstoke,Hampshire,England,United Kingdom |
      | Country or territory established | United Kingdom                                                                   |
    And I click save and continue button on "QROPS Check Your Answers Page"
    Then I am presented with the "Task List Page"

  Scenario:2. Full QROPS Details - Other country selected
    When I navigated to the "QROPS Name Page"
    And I should see the heading "What is the full name of the QROPS receiving the transfer?"
    And I should see below input fields on "QROPS Name Page"
      | qropsName |
    When I enter the following data into corresponding input fields on "QROPS Name Page"
      | qropsName | QROPs but better than great|
    And I click save and continue button on "QROPS Name Page"
    Then I am presented with the "QROPS Reference Page"
    When I enter the following data into corresponding input fields on "QROPS Reference Page"
      | qropsRef | QROPS452312 |
    And I click save and continue button on "QROPS Reference Page"
    Then I am presented with the "QROPS Address Page"
    When I enter the following data into corresponding input fields on "QROPS Address Page"
      | addressLine1 | 45 Oakfield Way  |
      | addressLine2 | Sycamore Park    |
      | addressLine3 | Sutton Coldfield |
      | addressLine4 | West Midlands    |
      | addressLine5 | England          |
      | countryCode  | United Kingdom   |
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
    And I should see the following details
      | Full name                  | QROPs but better than great                                                         |
      | Reference                  | QROPS452312                                                                         |
      | Address                    | 45 Oakfield Way,Sycamore Park,Sutton Coldfield,West Midlands,England,United Kingdom |
      | Country or territory established | Other                                                                                   |
      | Other country or territory       | Wales                                                                               |
    And I click save and continue button on "QROPS Check Your Answers Page"
    Then I am presented with the "Task List Page"
