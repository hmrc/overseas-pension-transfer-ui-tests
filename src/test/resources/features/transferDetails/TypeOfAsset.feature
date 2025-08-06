@Test @TypeOfAsset @acceptance
Feature: Type Of Asset

  Background: Common Steps - Transfer Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "What You Will Need Page"
    When I enter Enrollment Key "HMRC-PODSPP-ORG", Identifier Name "PSPID" and Identifier Value "2131231231231" on "Auth Login Stub Page"
    And I click submit button on "Auth Login Stub Page"
    And I am presented with the "What You Will Need Page"
    And I navigated to the "Type Of Asset Page"
    Then I am presented with the "Type Of Asset Page"
    And I should see the heading "Type of assets included in the transfer"
    #And I should see the following values on the page
     # | The QROPS is an occupational pension scheme and the individual is an employee of the sponsoring employer. |
    And I should see the hint text "Select all that apply."
   # And I should see two radio buttons: "Transfer exceeds member's overseas transfer allowance and there is an applicable exclusion." and "There is no applicable exclusion."

  Scenario:1. Positive journey - PSA/PSP selects one of the checkboxes
    When I "select" checkbox "Unquoted shares" on "Type Of Asset Page"
    And I click save and continue button on "Type Of Asset Page"
    Then I am presented with the "Add UnQuoted Share Start Page"
# Above action would have to be rewritten upon page gets connected

  Scenario:2. Positive journey - PSA/PSP selects all of the checkboxes
    When I "select" checkbox "Cash" on "Type Of Asset Page"
    And I "select" checkbox "Unquoted shares" on "Type Of Asset Page"
    And I "select" checkbox "Quoted shares" on "Type Of Asset Page"
    And I "select" checkbox "Property" on "Type Of Asset Page"
    And I "select" checkbox "Other" on "Type Of Asset Page"
    And I click save and continue button on "Type Of Asset Page"
#    Then I am presented with the "Add UnQuoted Share Start Page"

  Scenario:3. Positive Journey - PSA/PSP selects only 2 of the available checkboxes (excluding Cash)
    When I "select" checkbox "Unquoted shares" on "Type Of Asset Page"
    And I "select" checkbox "Property" on "Type Of Asset Page"
    And I click save and continue button on "Type Of Asset Page"
    Then I am presented with the "Add UnQuoted Share Start Page"

  Scenario:4. Positive Journey - PSA/PSP selects Cash and another of the available checkboxes
    When I "select" checkbox "Cash" on "Type Of Asset Page"
    And I "select" checkbox "Other" on "Type Of Asset Page"
    And I click save and continue button on "Type Of Asset Page"
#    Then I am presented with the "New Login Page"

  Scenario:5. Negative Journey - PSA/PSP selects only Cash in the checkbox
    When I "select" checkbox "Cash" on "Type Of Asset Page"
    And I click save and continue button on "Type Of Asset Page"
    And I am presented with the "Type Of Asset Page" error page
    And I should see the "There is a problem" and below error messages
      | You cannot select cash only. Select another asset type or go back to the previous question. |
    And Clicking each error message should focus on the corresponding input field on "Type Of Asset Page"