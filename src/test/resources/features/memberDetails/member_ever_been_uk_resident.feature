@Test @HasEverBeenResident
Feature: Has member ever been a resident in the UK for tax purposes?

  Background: Common Steps - Member Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "Overseas Transfer Index Page"
    # And I enter redirect URL on Auth Login Stub Page for "Member Has Ever Been UK Resident Page"
    # Redirection currently does not work for any other page other than the Index page
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "Overseas Transfer Index Page"
    And I navigated to the "Has Member Ever Been UK Resident Page"
    Then I am presented with the "Has Member Ever Been UK Resident Page"

  Scenario Outline: Verify Has Member Ever Been UK Resident Page
    Then I should see the heading "Has <memberName> ever been a resident in the UK for tax purposes?"
    And I should see the hint text "Select one."
    And I should see two radio buttons: "Yes" and "No"
    Examples:
      | memberName |
      | undefined undefined |

  Scenario:1. Positive Journey - Select 'Yes' radio button
    When I select radio button "Yes" on "Has Member Ever Been UK Resident Page"
    And I click save and continue button on "Has Member Ever Been UK Resident Page"
    Then I am presented with the "Overseas Transfer Index Page"
# Above action would have to be rewritten upon page gets connected

  Scenario:2. Positive Journey - Select 'No' radio button
    When I select radio button "No" on "Has Member Ever Been UK Resident Page"
    And I click save and continue button on "Has Member Ever Been UK Resident Page"
    Then I am presented with the "Overseas Transfer Index Page"
# Above action would have to be rewritten upon page gets connected

  Scenario:3. Negative Journey - No Selection Error
    When I click save and continue button on "Has Member Ever Been UK Resident Page"
    Then I am presented with the "Has Member Ever Been UK Resident Page" error page
    And I should see the "There is a problem" and below error messages
      | Select one option |