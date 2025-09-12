@Test @OverseasTransferAllowance @acceptance
Feature: Member's Overseas Transfer Allowance

  Background: Common Steps - Transfer Details Journey
Given I cleared the data for the service
When I navigate to the "Auth Login Stub Page"
And I enter redirect URL on Auth Login Stub Page for "Journey entry URL"
When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "A2100005" on "Auth Login Stub Page"
And I click submit button on "Auth Login Stub Page"
Then I am presented with the "Dashboard Page"
And I click on "Start new transfer" hyperlink on "Dashboard Page"
And I am presented with the "What You Will Need Page"
And I navigated to the "Overseas Transfer Allowance Page"
Then I am presented with the "Overseas Transfer Allowance Page"
And I should see the heading "What is the amount of the overseas transfer allowance before making this transfer?"
And I should see the hint text "For example, £60000 or £19,300.54."

  Scenario:1. Positive journey - PSA/PSP types in a numerical value into the field without ‘£’ sign
    When I enter the following data into corresponding input fields on "Overseas Transfer Allowance Page"
      | otAllowance | 500 |
    And I click save and continue button on "Overseas Transfer Allowance Page"
    Then I am presented with the "Amount Of Transfer Page"

  Scenario:2. Positive journey - PSA/PSP types in a numerical value into the field along with ‘£’ sign
    When I enter the following data into corresponding input fields on "Overseas Transfer Allowance Page"
      | otAllowance | £500 |
    And I click save and continue button on "Overseas Transfer Allowance Page"
    Then I am presented with the "Amount Of Transfer Page"

  Scenario:3. Positive journey - PSA/PSP enters a value with decimals
    When I enter the following data into corresponding input fields on "Overseas Transfer Allowance Page"
      | otAllowance | 500.00 |
    And I click save and continue button on "Overseas Transfer Allowance Page"
    Then I am presented with the "Amount Of Transfer Page"

  Scenario:4. Positive journey - PSA/PSP enters a a number with maximum allowed value (999999999.99)
    When I enter the following data into corresponding input fields on "Overseas Transfer Allowance Page"
      | otAllowance | 999999999.99 |
    And I click save and continue button on "Overseas Transfer Allowance Page"
    Then I am presented with the "Amount Of Transfer Page"

  Scenario:5. Positive journey - PSA/PSP types in a numerical value into the field with comma (,) separator
    When I enter the following data into corresponding input fields on "Overseas Transfer Allowance Page"
      | otAllowance | 500,000 |
    And I click save and continue button on "Overseas Transfer Allowance Page"
    Then I am presented with the "Amount Of Transfer Page"

  Scenario:6. Positive journey - PSA/PSP types in a numerical value into the field with comma (,) separator
    When I enter the following data into corresponding input fields on "Overseas Transfer Allowance Page"
      | otAllowance | 500,000 |
    And I click save and continue button on "Overseas Transfer Allowance Page"
    Then I am presented with the "Amount Of Transfer Page"

  Scenario:7. Positive journey - PSA/PSP types in a numerical value into the field with comma (,) separator in any position
    When I enter the following data into corresponding input fields on "Overseas Transfer Allowance Page"
      | otAllowance | 5,0,0,0,0,0 |
    And I click save and continue button on "Overseas Transfer Allowance Page"
    Then I am presented with the "Amount Of Transfer Page"

  Scenario:8. Positive journey - PSA/PSP types in a numerical value into the field with comma (,) separator in any position
    When I enter the following data into corresponding input fields on "Overseas Transfer Allowance Page"
      | otAllowance | 5,0,0,0,0,0 |
    And I click save and continue button on "Overseas Transfer Allowance Page"
    Then I am presented with the "Amount Of Transfer Page"

  Scenario:9. Positive journey - PSA/PSP clicks on "Help with available allowance" link
    When I click on the Details component "Help with available allowance" on "Overseas Transfer Allowance Page"
    Then I should see the following values on the page
      | You will need to contact your member to confirm what their available allowance is, as it may have been used across multiple schemes. |


