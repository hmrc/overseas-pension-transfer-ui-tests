@Test @NumberOfUnquotedShares @acceptance
Feature: Unquoted Share Number

  Background: Common Steps - Transfer Details Journey
Given I cleared the data for the service
When I navigate to the "Auth Login Stub Page"
And I enter redirect URL on Auth Login Stub Page for "What You Will Need Page"
When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "2131231231231" on "Auth Login Stub Page"
And I click submit button on "Auth Login Stub Page"
And I am presented with the "What You Will Need Page"
And I navigated to the "Number Of Unquoted Share Page"
Then I am presented with the "Number Of Unquoted Share Page"
And I should see the heading "How many unquoted shares in this company are part of this transfer?"

  Scenario:1. Positive journey - PSA/PSP types in a valid number for number of Unquoted Share
    When I enter the following data into corresponding input fields on "Number Of Unquoted Share Page"
      | value | 100 |
    And I click save and continue button on "Number Of Unquoted Share Page"
    Then I am presented with the "Class Of Unquoted Share Page"

  Scenario:2. Positive journey - PSA/PSP types in a a fractional number (with a decimal point)
    When I enter the following data into corresponding input fields on "Number Of Unquoted Share Page"
      | value | 100.50 |
    And I click save and continue button on "Number Of Unquoted Share Page"
    Then I am presented with the "Class Of Unquoted Share Page"
