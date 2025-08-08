@Test @ValueOfProperty @acceptance
Feature: Value Of the Property

  Background: Common Steps - Transfer Details Journey
Given I cleared the data for the service
When I navigate to the "Auth Login Stub Page"
And I enter redirect URL on Auth Login Stub Page for "What You Will Need Page"
When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "2131231231231" on "Auth Login Stub Page"
And I click submit button on "Auth Login Stub Page"
And I am presented with the "What You Will Need Page"
And I navigated to the "Value Of Property Page"
Then I am presented with the "Value Of Property Page"
And I should see the heading "What is the value of this property?"
And I should see the hint text "For example, £10000 or £193,540"

  Scenario:1. Positive journey - PSA/PSP types in a numerical value into the field without ‘£’ sign
    When I enter the following data into corresponding input fields on "Value Of Property Page"
      | value | 500 |
    And I click save and continue button on "Value Of Property Page"
    Then I am presented with the "Property Description Page"

  Scenario:2. Positive journey - PSA/PSP types in a numerical value into the field along with ‘£’ sign
    When I enter the following data into corresponding input fields on "Value Of Property Page"
      | value | £500 |
    And I click save and continue button on "Value Of Property Page"
    Then I am presented with the "Property Description Page"

  Scenario:3. Positive journey - PSA/PSP enters a value with decimals
    When I enter the following data into corresponding input fields on "Value Of Property Page"
      | value | 500.00 |
    And I click save and continue button on "Value Of Property Page"
    Then I am presented with the "Property Description Page"

  Scenario:4. Positive journey - PSA/PSP enters a a number with maximum allowed value (999999999.99)
    When I enter the following data into corresponding input fields on "Value Of Property Page"
      | value | 999999999.99 |
    And I click save and continue button on "Value Of Property Page"
    Then I am presented with the "Property Description Page"

  Scenario:5. Positive journey - PSA/PSP types in a numerical value into the field with comma (,) separator
    When I enter the following data into corresponding input fields on "Value Of Property Page"
      | value | 500,000 |
    And I click save and continue button on "Value Of Property Page"
    Then I am presented with the "Property Description Page"

  Scenario:6. Positive journey - PSA/PSP types in a numerical value into the field with comma (,) separator
    When I enter the following data into corresponding input fields on "Value Of Property Page"
      | value | 500,000 |
    And I click save and continue button on "Value Of Property Page"
    Then I am presented with the "Property Description Page"

  Scenario:7. Positive journey - PSA/PSP types in a numerical value into the field with comma (,) separator in any position
    When I enter the following data into corresponding input fields on "Value Of Property Page"
      | value | 5,0,0,0,0,0 |
    And I click save and continue button on "Value Of Property Page"
    Then I am presented with the "Property Description Page"




