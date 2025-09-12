@Test @WhyTransferNotTaxable @acceptance
Feature: Why the transfer is not taxable

  Background: Common Steps - Transfer Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "Journey entry URL"
    When I enter Enrollment Key "HMRC-PODSPP-ORG", Identifier Name "PSPID" and Identifier Value "21000005" on "Auth Login Stub Page"
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "Dashboard Page"
    And I click on "Start new transfer" hyperlink on "Dashboard Page"
    And I am presented with the "What You Will Need Page"
    And I navigated to the "Why Transfer is not Taxable Page"
    Then I am presented with the "Why Transfer is not Taxable Page"
    And I should see the heading "Why isn't this a taxable overseas transfer?"
    And I should see the following values on the page
      | The transfer value does not exceed the members available overseas transfer allowance at the time of transfer and: |
    #And I should see the following values on the page
     # | The QROPS is an occupational pension scheme and the individual is an employee of the sponsoring employer. |
    And I should see the hint text "Select all that apply."
   # And I should see two radio buttons: "Transfer exceeds member's overseas transfer allowance and there is an applicable exclusion." and "There is no applicable exclusion."

  Scenario:1. Positive journey - PSA/PSP selects one of the checkboxes
    When I "select" checkbox "The QROPS is an occupational pension scheme and the individual is an employee of the sponsoring employer." on "Why Transfer is not Taxable Page"
    And I click save and continue button on "Why Transfer is not Taxable Page"
    Then I am presented with the "Date Of Transfer Page"

  Scenario:2. Positive journey - PSA/PSP selects all of the checkboxes
    When I "select" checkbox "The QROPS is an occupational pension scheme and the individual is an employee of the sponsoring employer." on "Why Transfer is not Taxable Page"
    And I "select" checkbox "The QROPS is an overseas public service scheme and the individual is employed by the public service." on "Why Transfer is not Taxable Page"
    And I "select" checkbox "The QROPS is a pension scheme of an international organisation and the individual is employed by that international organisation." on "Why Transfer is not Taxable Page"
    And I "select" checkbox "Both the individual and QROPS are resident in the same country." on "Why Transfer is not Taxable Page"
    And I click save and continue button on "Why Transfer is not Taxable Page"
    Then I am presented with the "Date Of Transfer Page"

  Scenario:3. Negative Journey - PSA/PSP selects only 2 of the available checkboxes
    When I "select" checkbox "The QROPS is an occupational pension scheme and the individual is an employee of the sponsoring employer." on "Why Transfer is not Taxable Page"
    And I "select" checkbox "Both the individual and QROPS are resident in the same country." on "Why Transfer is not Taxable Page"
    And I click save and continue button on "Why Transfer is not Taxable Page"
    Then I am presented with the "Date Of Transfer Page"
