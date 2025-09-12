@Test @PropertyValueDescription @acceptance
Feature: Description Of the Other Assets

  Background: Common Steps - Transfer Details Journey
Given I cleared the data for the service
When I navigate to the "Auth Login Stub Page"
And I enter redirect URL on Auth Login Stub Page for "Journey entry URL"
When I enter Enrollment Key "HMRC-PODSPP-ORG", Identifier Name "PSPID" and Identifier Value "21000005" on "Auth Login Stub Page"
And I click submit button on "Auth Login Stub Page"
Then I am presented with the "Dashboard Page"
And I click on "Start new transfer" hyperlink on "Dashboard Page"
And I am presented with the "What You Will Need Page"
And I navigated to the "Property Description Page"
Then I am presented with the "Property Description Page"

  Scenario:1. Positive journey - PSA/PSP sees the following on the Property Value Description Page
And I should see the heading "Describe the property and how it was valued"
When I enter the following data into corresponding input fields on "Property Description Page"
      | value | Property value description|
And I click save and continue button on "Property Description Page"
Then I am presented with the "Property Check Your Answers Page"

