@Test @ValueOfOtherAssets @acceptance
Feature: Value Of the Other Assets

  Background: Common Steps - Transfer Details Journey
Given I cleared the data for the service
When I navigate to the "Auth Login Stub Page"
And I enter redirect URL on Auth Login Stub Page for "Journey entry URL"
When I enter Enrollment Key "HMRC-PODSPP-ORG", Identifier Name "PSPID" and Identifier Value "21000005" on "Auth Login Stub Page"
And I click submit button on "Auth Login Stub Page"
Then I am presented with the "Dashboard Page"
And I click on "Start new transfer" hyperlink on "Dashboard Page"
And I am presented with the "What You Will Need Page"
And I navigated to the "Other Assets Value Page"
Then I am presented with the "Other Assets Value Page"

  Scenario:1. Positive journey - PSA/PSP sees the following in the Other Assets Value Page
And I should see the heading "What is the value of the asset?"
When I enter the following data into corresponding input fields on "Other Assets Description Page"
      | value | 500.50|
And I click save and continue button on "Other Assets Value Page"
Then I am presented with the "Other Assets Check Your Answers Page"

  Scenario:2. Positive journey - PSA/PSP enters a numerical value into the field without ‘£’ sign in the Other Assets Value Page
    When I enter the following data into corresponding input fields on "Other Assets Value Page"
      | value | 500 |
    And I click save and continue button on "Other Assets Value Page"
    Then I am presented with the "Other Assets Check Your Answers Page"

  Scenario:3. Positive journey - PSA/PSP enters a numerical value into the field along with ‘£’ sign in the Other Assets Value Page
    When I enter the following data into corresponding input fields on "Other Assets Value Page"
      | value | £500 |
    And I click save and continue button on "Other Assets Value Page"
    Then I am presented with the "Other Assets Check Your Answers Page"

  Scenario:4. Positive journey - PSA/PSP enters a value with decimals in the Other Assets Value Page
    When I enter the following data into corresponding input fields on "Other Assets Value Page"
      | value | 500.00 |
    And I click save and continue button on "Other Assets Value Page"
    Then I am presented with the "Other Assets Check Your Answers Page"

  Scenario:5. Positive journey - PSA/PSP enters a a number with maximum allowed value (999999999.99) in the Other Assets Value Page
    When I enter the following data into corresponding input fields on "Other Assets Value Page"
      | value | 999999999.99 |
    And I click save and continue button on "Other Assets Value Page"
    Then I am presented with the "Other Assets Check Your Answers Page"

  Scenario:6. Positive journey - PSA/PSP types in a numerical value into the field with comma (,) separator in the Other Assets Value Page
    When I enter the following data into corresponding input fields on "Other Assets Value Page"
      | value | 500,000 |
    And I click save and continue button on "Other Assets Value Page"
    Then I am presented with the "Other Assets Check Your Answers Page"

  Scenario:7. Positive journey - PSA/PSP types in a numerical value into the field with comma (,) separator in the Other Assets Value Page
    When I enter the following data into corresponding input fields on "Other Assets Value Page"
      | value | 500,000 |
    And I click save and continue button on "Other Assets Value Page"
    Then I am presented with the "Other Assets Check Your Answers Page"

  Scenario:8. Positive journey - PSA/PSP types in a numerical value into the field with comma (,) separator in any position in the Other Assets Value Page
    When I enter the following data into corresponding input fields on "Other Assets Value Page"
      | value | 5,0,0,0,0,0 |
    And I click save and continue button on "Other Assets Value Page"
    Then I am presented with the "Other Assets Check Your Answers Page"


