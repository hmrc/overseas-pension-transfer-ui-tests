@Test @AddUnQuotedShareStart @acceptance
Feature: Start Page of Adding UnQuoted Share

  Background: Common Steps - Transfer Details Journey
Given I cleared the data for the service
When I navigate to the "Auth Login Stub Page"
And I enter redirect URL on Auth Login Stub Page for "What You Will Need Page"
When I enter Enrollment Key "HMRC-PODSPP-ORG", Identifier Name "PSPID" and Identifier Value "2131231231231" on "Auth Login Stub Page"
And I click submit button on "Auth Login Stub Page"
And I am presented with the "What You Will Need Page"
And I navigated to the "Add UnQuoted Share Start Page"
Then I am presented with the "Add UnQuoted Share Start Page"

  Scenario:1. Positive journey - PSA/PSP sees the following in the quoted shares add start page
And I should see the heading "Add unquoted shares"
#And I should see the hint text "For example, £60000 or £19,300.54."
And I should see the following values on the page
      | The following questions are about unquoted shares that are part of this transfer. |
    And I click save and continue button on "Add UnQuoted Share Start Page"
    Then I am presented with the "Name Of Company Unquoted Share Page"

