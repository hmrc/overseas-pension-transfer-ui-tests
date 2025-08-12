@Test @AddOtherAssetsStart @acceptance
Feature: Start Page of Adding Property

  Background: Common Steps - Transfer Details Journey
Given I cleared the data for the service
When I navigate to the "Auth Login Stub Page"
And I enter redirect URL on Auth Login Stub Page for "What You Will Need Page"
When I enter Enrollment Key "HMRC-PODSPP-ORG", Identifier Name "PSPID" and Identifier Value "2131231231231" on "Auth Login Stub Page"
And I click submit button on "Auth Login Stub Page"
And I am presented with the "What You Will Need Page"
And I navigated to the "Other Assets Description Page"
Then I am presented with the "Other Assets Description Page"

  Scenario:1. Positive journey - PSA/PSP sees the following in the Property add start page
And I should see the heading "Describe the asset and how it was valued"
When I enter the following data into corresponding input fields on "Other Assets Description Page"
      | value | Other assets description|
And I click save and continue button on "Other Assets Description Page"
Then I am presented with the "Other Assets Value Page"

