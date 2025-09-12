@Test @QuotedShareClass @acceptance
Feature: Quoted Share Class

  Background: Common Steps - Transfer Details Journey
Given I cleared the data for the service
When I navigate to the "Auth Login Stub Page"
And I enter redirect URL on Auth Login Stub Page for "Journey entry URL"
When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "A2100005" on "Auth Login Stub Page"
And I click submit button on "Auth Login Stub Page"
Then I am presented with the "Dashboard Page"
And I click on "Start new transfer" hyperlink on "Dashboard Page"
And I am presented with the "What You Will Need Page"
And I navigated to the "Class Of Quoted Share Page"
And I should see the heading "What class are these quoted shares?"

  Scenario:1. Positive journey - PSA/PSP types in a valid name for the Company for Unquoted Share
    When I enter the following data into corresponding input fields on "Class Of Quoted Share Page"
      | value | Class A|
    And I click save and continue button on "Class Of Quoted Share Page"
    Then I am presented with the "Quoted Share Check Your Answers Page"

  Scenario:2. Positive journey - PSA/PSP types in a exactly 160 characters for name for the Company for Unquoted Share
    When I enter the following data into corresponding input fields on "Class Of Quoted Share Page"
      | value | Class A Class A Class A Class A Class A Class A Class A Class A Class A Class A Class A Class A Class A Class A Class A Class A Class A Class A Class A Class A|
    And I click save and continue button on "Class Of Quoted Share Page"
    Then I am presented with the "Quoted Share Check Your Answers Page"

  Scenario:3. Positive journey - PSA/PSP types in a single character for name for the Company for Unquoted Share
    When I enter the following data into corresponding input fields on "Class Of Quoted Share Page"
      | value | A |
    And I click save and continue button on "Class Of Quoted Share Page"
    Then I am presented with the "Quoted Share Check Your Answers Page"