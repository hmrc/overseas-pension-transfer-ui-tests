@Test @IsCurrentlyResident
Feature: Is the member currently a resident of UK for tax purposes?

  Background: Common Steps - Member Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "What You Will Need Page"
    When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "2131231231231" on "Auth Login Stub Page"
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "Overseas Transfer Index Page"
    And I navigated to the "Is Member Currently UK Resident Page"

  Scenario Outline: Verify Is Member Currently UK Resident Page
    Then I should see the heading "Is <memberName> currently a resident of the UK for tax purposes?"
    And I should see the hint text "Select one."
    # the text is missing a DOT (.), this should be fixed
    And I should see two radio buttons: "Yes" and "No"
    Examples:
      | memberName          |
      | Undefined Undefined |

  Scenario:1. Positive Journey - Select 'Yes' radio button
      When I select radio button "Yes" on "Is Member Currently UK Resident Page"
      And I click save and continue button on "Is Member Currently UK Resident Page"
      Then I am presented with the "Member Details Check Your Answers Page"
# Above action would have to be rewritten upon page gets connected

  Scenario:2. Positive Journey - Select 'No' radio button
    When I select radio button "No" on "Is Member Currently UK Resident Page"
    And I click save and continue button on "Is Member Currently UK Resident Page"
    Then I am presented with the "Has Member Ever Been UK Resident Page"
# Above action would have to be rewritten upon page gets connected

  Scenario:3. Negative Journey - No Selection Error
    When I click save and continue button on "Is Member Currently UK Resident Page"
    Then I am presented with the "Is Member Currently UK Resident Page" error page
    And I should see the "There is a problem" and below error messages
      | Select one option |
    # And I should see following erroneous fields are highlighted on "Is Member Currently UK Resident Page"
      # | orgIndLastName |
    And Clicking each error message should focus on the corresponding input field on "Is Member Currently UK Resident Page"