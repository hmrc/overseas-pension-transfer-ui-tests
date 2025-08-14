@Test @AddOtherAssetsStart @acceptance
Feature: Start Page of Adding Other Assets

  Background: Common Steps - Transfer Details Journey
Given I cleared the data for the service
When I navigate to the "Auth Login Stub Page"
And I enter redirect URL on Auth Login Stub Page for "What You Will Need Page"
When I enter Enrollment Key "HMRC-PODSPP-ORG", Identifier Name "PSPID" and Identifier Value "2131231231231" on "Auth Login Stub Page"
And I click submit button on "Auth Login Stub Page"
And I am presented with the "What You Will Need Page"
And I navigated to the "Add Other Assets Start Page"
Then I am presented with the "Add Other Assets Start Page"

  Scenario:1. Positive journey - PSA/PSP sees the following in the Property add start page
And I should see the heading "Add other assets"
And I should see the following values on the page
      | The following questions are about other assets that are part of this transfer. |
    And I click save and continue button on "Add Other Assets Start Page"
    Then I am presented with the "Other Assets Description Page"

