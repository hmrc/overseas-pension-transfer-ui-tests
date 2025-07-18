@Test @NetAmountOfTransferAfterTax
Feature: Net Amount Transferred After Tax

  Background: Common Steps - Transfer Details Journey
Given I cleared the data for the service
When I navigate to the "Auth Login Stub Page"
And I enter redirect URL on Auth Login Stub Page for "What You Will Need Page"
When I enter Enrollment Key "HMRC-PODSPP-ORG", Identifier Name "PSPID" and Identifier Value "2131231231231" on "Auth Login Stub Page"
And I click submit button on "Auth Login Stub Page"
And I am presented with the "What You Will Need Page"
And I navigated to the "Net Amount Transferred After Tax Page"
Then I am presented with the "Net Amount Transferred After Tax Page"
And I should see the heading "What is the net amount of the transfer after deducting the tax charge?"
And I should see the hint text "For example, £60000 or £19,300.54."

  Scenario:1. Positive journey - PSA/PSP types in a numerical value into the field without ‘£’ sign
    When I enter the following data into corresponding input fields on "Net Amount Transferred After Tax Page"
      | netAmount | 500 |
    And I click save and continue button on "Net Amount Transferred After Tax Page"
    Then I am presented with the "Overseas Transfer Index Page"

  Scenario:2. Positive journey - PSA/PSP types in a numerical value into the field along with ‘£’ sign
    When I enter the following data into corresponding input fields on "Net Amount Transferred After Tax Page"
      | netAmount | £500 |
    And I click save and continue button on "Net Amount Transferred After Tax Page"
    Then I am presented with the "Overseas Transfer Index Page"

  Scenario:3. Positive journey - PSA/PSP enters a value with decimals
    When I enter the following data into corresponding input fields on "Net Amount Transferred After Tax Page"
      | netAmount | 500.00 |
    And I click save and continue button on "Net Amount Transferred After Tax Page"
    Then I am presented with the "Overseas Transfer Index Page"

  Scenario:4. Positive journey - PSA/PSP enters a a number with maximum allowed value (999999999.99)
    When I enter the following data into corresponding input fields on "Net Amount Transferred After Tax Page"
      | netAmount | 999999999.99 |
    And I click save and continue button on "Net Amount Transferred After Tax Page"
    Then I am presented with the "Overseas Transfer Index Page"

  Scenario:5. Positive journey - PSA/PSP types in a numerical value into the field with comma (,) separator
    When I enter the following data into corresponding input fields on "Net Amount Transferred After Tax Page"
      | netAmount | 500,000 |
    And I click save and continue button on "Net Amount Transferred After Tax Page"
    Then I am presented with the "Overseas Transfer Index Page"

  Scenario:6. Positive journey - PSA/PSP types in a numerical value into the field with comma (,) separator
    When I enter the following data into corresponding input fields on "Net Amount Transferred After Tax Page"
      | netAmount | 500,000 |
    And I click save and continue button on "Net Amount Transferred After Tax Page"
    Then I am presented with the "Overseas Transfer Index Page"

  Scenario:7. Positive journey - PSA/PSP types in a numerical value into the field with comma (,) separator in any position
    When I enter the following data into corresponding input fields on "Net Amount Transferred After Tax Page"
      | netAmount | 5,0,0,0,0,0 |
    And I click save and continue button on "Net Amount Transferred After Tax Page"
    Then I am presented with the "Overseas Transfer Index Page"

  Scenario:8. Positive journey - PSA/PSP types in a numerical value into the field with comma (,) separator in any position
    When I enter the following data into corresponding input fields on "Net Amount Transferred After Tax Page"
      | netAmount | 5,0,0,0,0,0 |
    And I click save and continue button on "Net Amount Transferred After Tax Page"
    Then I am presented with the "Overseas Transfer Index Page"

