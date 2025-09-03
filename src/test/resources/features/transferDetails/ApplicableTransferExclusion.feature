@Test @ApplicableTransferExclusion @acceptance
Feature: Date of Transfer

  Background: Common Steps - Transfer Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "What You Will Need Page"
    When I enter Enrollment Key "HMRC-PODSPP-ORG", Identifier Name "PSPID" and Identifier Value "2131231231231" on "Auth Login Stub Page"
    And I click submit button on "Auth Login Stub Page"
    And I am presented with the "What You Will Need Page"
    And I navigated to the "Applicable Transfer Exclusion Page"
    Then I am presented with the "Applicable Transfer Exclusion Page"
    And I should see the heading "Please provide the applicable exclusion"
    #And I should see the following values on the page
     # | The QROPS is an occupational pension scheme and the individual is an employee of the sponsoring employer. |
    And I should see the hint text "Select all that apply."
   # And I should see two radio buttons: "Transfer exceeds member's overseas transfer allowance and there is an applicable exclusion." and "There is no applicable exclusion."

  Scenario:1. Positive journey - PSA/PSP selects one of the checkboxes
    When I "select" checkbox "The QROPS is an occupational pension scheme and the individual is an employee of the sponsoring employer." on "Applicable Transfer Exclusion Page"
    And I click save and continue button on "Applicable Transfer Exclusion Page"
    Then I am presented with the "Amount Of Tax Deducted Page"
# Above action would have to be rewritten upon page gets connected

  Scenario:2. Positive journey - PSA/PSP selects all of the checkboxes
    When I "select" checkbox "The QROPS is an occupational pension scheme and the individual is an employee of the sponsoring employer." on "Applicable Transfer Exclusion Page"
    And I "select" checkbox "The QROPS is an overseas public service scheme and the individual is employed by the public service." on "Applicable Transfer Exclusion Page"
    And I "select" checkbox "The QROPS is a pension scheme of an international organisation and the individual is employed by that international organisation." on "Applicable Transfer Exclusion Page"
    And I "select" checkbox "Both the individual and QROPS are resident in the same country." on "Applicable Transfer Exclusion Page"
    And I click save and continue button on "Applicable Transfer Exclusion Page"
    Then I am presented with the "Amount Of Tax Deducted Page"

  Scenario:3. Negative Journey - PSA/PSP selects only 2 of the available checkboxes
    When I "select" checkbox "The QROPS is an occupational pension scheme and the individual is an employee of the sponsoring employer." on "Applicable Transfer Exclusion Page"
    And I "select" checkbox "Both the individual and QROPS are resident in the same country." on "Applicable Transfer Exclusion Page"
    And I click save and continue button on "Applicable Transfer Exclusion Page"
    Then I am presented with the "Amount Of Tax Deducted Page"
