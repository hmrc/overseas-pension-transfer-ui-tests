  @Test @MemberNino
Feature: Adding national insurance number for a member

  Background: Common Steps - National Insurance Number Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "Overseas Transfer Index Page"
    # And I enter redirect URL on Auth Login Stub Page for "Is Member Currently UK Resident Page"
    # Redirection currently does not work for any other page other than the Index page
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "Overseas Transfer Index Page"
    And I navigated to the "Member Nino Page"
    And I am presented with the "Member Nino Page"

  Scenario Outline: Verify the Member Nino Page
    And I should see the heading "What is <memberName>'s National Insurance number?"
    And I should see the hint text "For example, QQ123456A."

    Examples:
      | memberName |
      | Undefined Undefined       |


  Scenario:1. Positive journey - PSA/PSP enters a minimum of 1 character and a maximum 160 characters into the field
    When I enter the following data into corresponding input fields on "Member Nino Page"
      | value | QQ123456A |
    And I click save and continue button on "Member Nino Page"
    Then I am presented with the "Member Date Of Birth Page"
# Above action would have to be rewritten upon page gets connected

  Scenario:2. Negative Journey - PSA/PSP enters a NINO in wrong format
    When I enter the following data into corresponding input fields on "Member Nino Page"
      | value | QQ123456AAB |
    And I click save and continue button on "Member Nino Page"
    Then I am presented with the "Member Nino Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the member’s National Insurance number in the correct format |
    And I should see following erroneous fields are highlighted on "Member Nino Page"
      | value |
    And Clicking each error message should focus on the corresponding input field on "Member Nino Page"

  Scenario:3. Negative Journeys - Negative Journey - PSA/PSP enters a NINO with invalid character
    When I enter the following data into corresponding input fields on "Member Nino Page"
      | value | %QQ123456A |
    And I click save and continue button on "Member Nino Page"
    Then I am presented with the "Member Nino Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the member’s National Insurance number in the correct format |
    And I should see following erroneous fields are highlighted on "Member Nino Page"
      | value |
    And Clicking each error message should focus on the corresponding input field on "Member Nino Page"

  Scenario:4. Negative Journeys - PSA/PSP leaves the NINO field blank
    When I enter the following data into corresponding input fields on "Member Nino Page"
      | value |  |
    And I click save and continue button on "Member Nino Page"
    Then I am presented with the "Member Nino Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the member’s National Insurance number |
    And I should see following erroneous fields are highlighted on "Member Nino Page"
      | value |
    And Clicking each error message should focus on the corresponding input field on "Member Nino Page"