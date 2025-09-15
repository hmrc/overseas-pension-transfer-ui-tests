@Test @UnquotedShareCompanyName @acceptance
Feature: Unquoted Share Company Name

  Background: Common Steps - Transfer Details Journey
Given I cleared the data for the service
When I navigate to the "Auth Login Stub Page"
And I enter redirect URL on Auth Login Stub Page for "Journey entry URL"
When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "A2100005" on "Auth Login Stub Page"
And I click submit button on "Auth Login Stub Page"
Then I am presented with the "Dashboard Page"
And I click on "Start new transfer" hyperlink on "Dashboard Page"
And I am presented with the "What You Will Need Page"
And I navigated to the "Name Of Company Unquoted Share Page"
Then I am presented with the "Name Of Company Unquoted Share Page"
And I should see the heading "What is the name of the company these unquoted shares relate to?"

  Scenario:1. Positive journey - PSA/PSP types in a valid name for the Company for Unquoted Share
    When I enter the following data into corresponding input fields on "Name Of Company Unquoted Share Page"
      | value | Company XYZ|
    And I click save and continue button on "Name Of Company Unquoted Share Page"
    Then I am presented with the "Value Of Unquoted Share Page"

  Scenario:2. Positive journey - PSA/PSP types in a single character for name for the Company for Unquoted Share
    When I enter the following data into corresponding input fields on "Name Of Company Unquoted Share Page"
      | value | C |
    And I click save and continue button on "Name Of Company Unquoted Share Page"
    Then I am presented with the "Value Of Unquoted Share Page"

  Scenario:3. Positive journey - PSA/PSP types in a name for the Company for Unquoted Share > 160 charecters
    When I enter the following data into corresponding input fields on "Name Of Company Unquoted Share Page"
      | value | Quantum Synergy Dynamics Global Innovations & Solutions Enterprises Unlimited Ventures Technologies Future Forward Strategic Nexus Industries Corporation Ltd LL |
    And I click save and continue button on "Name Of Company Unquoted Share Page"
    Then I am presented with the "Value Of Unquoted Share Page"

  Scenario:4. Positive journey - PSA/PSP types in a name for the Company for Unquoted Share which includes a number as a part of the name
    When I enter the following data into corresponding input fields on "Name Of Company Unquoted Share Page"
      | value | Company 11ABC|
    And I click save and continue button on "Name Of Company Unquoted Share Page"
    Then I am presented with the "Value Of Unquoted Share Page"
