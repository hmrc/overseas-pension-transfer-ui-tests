@Test   @IsTransferPaymentTaxable @acceptance
Feature: Is Transfer Payment Taxable?

  Background: Common Steps - Transfer Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "Journey entry URL"
    When I enter Enrollment Key "HMRC-PODSPP-ORG", Identifier Name "PSPID" and Identifier Value "21000005" on "Auth Login Stub Page"
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "Dashboard Page"
    And I click on "Start new transfer" hyperlink on "Dashboard Page"
    And I am presented with the "What You Will Need Page"
    And I navigated to the "Is Transfer Amount Taxable Page"
    Then I am presented with the "Is Transfer Amount Taxable Page"
    And I should see the heading "Is this transfer payment a taxable overseas transfer?"
    And I should see two radio buttons: "Yes" and "No"

  Scenario:1. Positive Journey - Select 'Yes' radio button
    When I select radio button "Yes" on "Is Transfer Amount Taxable Page"
    And I click save and continue button on "Is Transfer Amount Taxable Page"
    Then I am presented with the "Why Transfer Amount Taxable Page"

  Scenario:2. Positive Journey - Select 'No' radio button
    When I select radio button "No" on "Is Transfer Amount Taxable Page"
    And I click save and continue button on "Is Transfer Amount Taxable Page"
    Then I am presented with the "Why Transfer is not Taxable Page"

  Scenario:3. Negative Journey - No Selection Error
    When I click save and continue button on "Is Transfer Amount Taxable Page"
    Then I am presented with the "Is Transfer Amount Taxable Page" error page
    And I should see the "There is a problem" and below error messages
      | Select yes if the transfer payment is taxable |
    And Clicking each error message should focus on the corresponding input field on "Is Transfer Amount Taxable Page"