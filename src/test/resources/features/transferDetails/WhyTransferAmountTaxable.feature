@Test   @WhyTransferAmountTaxable @acceptance
Feature: Why Transfer amount Taxable?

  Background: Common Steps - Member Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
   # And I enter redirect URL on Auth Login Stub Page for "Overseas Transfer Index Page"
   And I enter redirect URL on Auth Login Stub Page for "Journey entry URL"
    # And I enter redirect URL on Auth Login Stub Page for "Member Has Ever Been UK Resident Page"
    # Redirection currently does not work for any other page other than the Index page
    When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "A2100005" on "Auth Login Stub Page"
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "Dashboard Page"
    And I click on "Start new transfer" hyperlink on "Dashboard Page"
   #Then I am presented with the "Overseas Transfer Index Page"
   #And I click continue button on "Overseas Transfer Index Page"
    And I am presented with the "What You Will Need Page"
    And I navigated to the "Why Transfer Amount Taxable Page"
    Then I am presented with the "Why Transfer Amount Taxable Page"
    And I should see the heading "Why is this a taxable overseas transfer?"
    And I should see the hint text "Select one."
    And I should see two radio buttons: "Transfer exceeds member's overseas transfer allowance and there is an applicable exclusion." and "There is no applicable exclusion."

  Scenario:1. Positive Journey - Select 'Transfer exceeds member's overseas transfer allowance and there is an applicable exclusion' radio button
    When I select radio button "Transfer exceeds member's overseas transfer allowance and there is an applicable exclusion." on "Why Transfer Amount Taxable Page"
    And I click save and continue button on "Why Transfer Amount Taxable Page"
    Then I am presented with the "Applicable Transfer Exclusion Page"

  Scenario:2. Positive Journey - Select 'There is no applicable exclusion' radio button
    When I select radio button "There is no applicable exclusion." on "Why Transfer Amount Taxable Page"
    And I click save and continue button on "Why Transfer Amount Taxable Page"
    Then I am presented with the "Amount Of Tax Deducted Page"

  Scenario:3. Negative Journey - No Selection Error
    When I click save and continue button on "Why Transfer Amount Taxable Page"
    Then I am presented with the "Why Transfer Amount Taxable Page" error page
    And I should see the "There is a problem" and below error messages
      | Select why this is a taxable overseas transfer|
    And Clicking each error message should focus on the corresponding input field on "Why Transfer Amount Taxable Page"