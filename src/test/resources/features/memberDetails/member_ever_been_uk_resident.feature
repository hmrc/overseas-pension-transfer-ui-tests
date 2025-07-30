@Test   @EverBeenResident @acceptance
Feature: Has member ever been a resident in the UK for tax purposes?

  Background: Common Steps - Member Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "What You Will Need Page"
    When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "2131231231231" on "Auth Login Stub Page"
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "What You Will Need Page"
    And I navigated to the "Has Member Ever Been UK Resident Page"
    Then I am presented with the "Has Member Ever Been UK Resident Page"

  Scenario Outline: Verify Has Member Ever Been UK Resident Page
    Then I should see the heading "Has <memberName> ever been a resident in the UK for tax purposes?"
    And I should see the hint text "Select one."
    And I should see two radio buttons: "Yes" and "No"
    Examples:
      | memberName          |
      | Undefined Undefined |

  Scenario:1. Positive Journey - Select 'Yes' radio button
    When I select radio button "Yes" on "Has Member Ever Been UK Resident Page"
    And I click save and continue button on "Has Member Ever Been UK Resident Page"
    Then I am presented with the "Members Last UK Address Lookup Page"
# Above action would have to be rewritten upon page gets connected

  Scenario:2. Positive Journey - Select 'No' radio button
    When I select radio button "No" on "Has Member Ever Been UK Resident Page"
    And I click save and continue button on "Has Member Ever Been UK Resident Page"
    Then I am presented with the "Member Details Check Your Answers Page"
# Above action would have to be rewritten upon page gets connected

  Scenario:3. Negative Journey - No Selection Error
    When I click save and continue button on "Has Member Ever Been UK Resident Page"
    Then I am presented with the "Has Member Ever Been UK Resident Page" error page
    And I should see the "There is a problem" and below error messages
      | Select one option |
    And Clicking each error message should focus on the corresponding input field on "Has Member Ever Been UK Resident Page"