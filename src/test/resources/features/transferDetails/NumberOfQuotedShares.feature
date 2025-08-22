@Test @NumberOfQuotedShares @acceptance
Feature: Quoted Share Number

  Background: Common Steps - Transfer Details Journey
Given I cleared the data for the service
When I navigate to the "Auth Login Stub Page"
And I enter redirect URL on Auth Login Stub Page for "What You Will Need Page"
When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "2131231231231" on "Auth Login Stub Page"
And I click submit button on "Auth Login Stub Page"
And I am presented with the "What You Will Need Page"
And I navigated to the "Number Of Quoted Share Page"
Then I am presented with the "Number Of Quoted Share Page"
And I should see the heading "How many quoted shares in this company are part of this transfer?"

  Scenario:1. Positive journey - PSA/PSP types in a valid number for number of Quoted Share
    When I enter the following data into corresponding input fields on "Number Of Quoted Share Page"
      | value | 100 |
    And I click save and continue button on "Number Of Quoted Share Page"
    Then I am presented with the "Class Of Quoted Share Page"

  #Scenario:2. Positive journey - PSA/PSP types in a fractional number (with a decimal point) for Quoted share
   # When I enter the following data into corresponding input fields on "Number Of Quoted Share Page"
    #  | value | 100.50 |
    #And I click save and continue button on "Number Of Quoted Share Page"
    #Then I am presented with the "Class Of Quoted Share Page"
