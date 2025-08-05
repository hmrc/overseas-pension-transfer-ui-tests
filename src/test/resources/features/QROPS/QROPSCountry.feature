@Test @QROPSCountry @acceptance
Feature: Adding QROPS Country

  Background: Common Steps - QROPS Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "What You Will Need Page"
    When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "2131231231231" on "Auth Login Stub Page"
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "What You Will Need Page"
    And I navigated to the "QROPS Country Page"
    And I should see the heading "Country or territory in which QROPS was established?"
    And I should see below input fields on "QROPS Country Page"
      | countryCode |

  Scenario:1. Positive journey - PSA/PSP enters a valid QROPS country
    When I enter the following data into corresponding input fields on "QROPS Country Page"
      | countryCode | United Kingdom|
    And I click save and continue button on "QROPS Country Page"
    And I click save and continue button on "QROPS Country Page"
    Then I am presented with the "QROPS Check Your Answers Page"
# Above action would have to be rewritten upon page gets connected

  Scenario:2. Positive journey - PSA/PSP leaves the QROPS country field blank
    When I enter the following data into corresponding input fields on "QROPS Country Page"
      | countryCode |  |
    And I click save and continue button on "QROPS Country Page"
    And I should see the "There is a problem" and below error messages
      | Enter a country or territory |
    And I should see following erroneous dropdown fields are highlighted on "QROPS Country Page"
      | countryCode |
    And Clicking each error message should focus on the corresponding input field on "QROPS Country Page"