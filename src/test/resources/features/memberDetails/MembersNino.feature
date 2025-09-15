  @Test @MemberNino @acceptance @solo
Feature: Adding national insurance number for a member

  Background: Common Steps - National Insurance Number Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "Journey entry URL"
    When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "A2100005" on "Auth Login Stub Page"
    # And I enter redirect URL on Auth Login Stub Page for "Is Member Currently UK Resident Page"
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "Dashboard Page"
    And I click on "Start new transfer" hyperlink on "Dashboard Page"
    And I am presented with the "What You Will Need Page"
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

  Scenario:5. Positive journey - PSA/PSP selects option to enter the address manually in the post code screen
    When I click on "Member doesn't have a National Insurance number." hyperlink on "Member Nino Page"
    And I am presented with the "Member Does Not Have NINO Page"
    And I should see the heading "Why does Undefined Undefined not have a National Insurance number?"
    And I should see the following values on the page
      | If the member has another HMRC reference number that relates to them as an individual, please give that number. |
