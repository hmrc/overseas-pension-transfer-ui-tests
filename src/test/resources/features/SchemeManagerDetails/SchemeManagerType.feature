@Test @SchemeManagerType @acceptance
Feature: Is the scheme manager an individual or organisation?

  Background: Common Steps - Member Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "What You Will Need Page"
    When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "2131231231231" on "Auth Login Stub Page"
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "What You Will Need Page"
    And I navigated to the "Scheme Manager Type Page"
    Then I am presented with the "Scheme Manager Type Page"

  Scenario Outline: Verify Scheme Manager Type
    Then I should see the heading "Is the scheme manager an individual or organisation?"
    And I should see the hint text "Select one."
    # the text is missing a DOT (.), this should be fixed
    And I should see two radio buttons: "Individual" and "Organisation"
    Examples:
      | memberName |
      | undefined  |

    Scenario:1. Positive Journey - Select 'Individual' radio button
      When I select radio button "Individual" on "Scheme Manager Type Page"
      And I click save and continue button on "Scheme Manager Type Page"
      Then I am presented with the "Scheme Manager Name Page"
# Above action would have to be rewritten upon page gets connected

  Scenario:2. Positive Journey - Select 'Organisation' radio button
    When I select radio button "Organisation" on "Scheme Manager Type Page"
    And I click save and continue button on "Scheme Manager Type Page"
    Then I am presented with the "Organisation Name Page"
# Above action would have to be rewritten upon page gets connected

  Scenario:3. Negative Journey - No Selection Error
    When I click save and continue button on "Scheme Manager Type Page"
    Then I am presented with the "Scheme Manager Type Page" error page
    And I should see the "There is a problem" and below error messages
      | Select if the scheme manager is an individual or an organisation |
    # And I should see following erroneous fields are highlighted on "Is Member Currently UK Resident Page"
      # | orgIndLastName |
    And Clicking each error message should focus on the corresponding input field on "Scheme Manager Type Page"