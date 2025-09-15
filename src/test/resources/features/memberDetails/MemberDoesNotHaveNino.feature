@Test @DoesNotHaveNINO @acceptance @solo
Feature: Adding details for the member who does not have NINO

  Background: Common Steps - Member Details Journey
    Given I cleared the data for the service
    When I navigate to the "Auth Login Stub Page"
    And I enter redirect URL on Auth Login Stub Page for "Journey entry URL"
    When I enter Enrollment Key "HMRC-PODS-ORG", Identifier Name "PSAID" and Identifier Value "A2100005" on "Auth Login Stub Page"
    # And I enter redirect URL on Auth Login Stub Page for "Is Member Currently UK Resident Page"
    # Redirection currently does not work for any other page other than the Index page
    And I click submit button on "Auth Login Stub Page"
    Then I am presented with the "Dashboard Page"
    And I click on "Start new transfer" hyperlink on "Dashboard Page"
    Then I am presented with the "What You Will Need Page"
    And I navigated to the "Member Does Not Have NINO Page"
    Then I am presented with the "Member Does Not Have NINO Page"

  Scenario Outline: Verify Why the member does not have a National Insurance number?
    Then I should see the heading "Why does <memberName> not have a National Insurance number?"
    #And I should see the hint text "If the member has another HMRC reference number that relates to them as an individual, please give that number."
    And I should see the following values on the page
      | If the member has another HMRC reference number that relates to them as an individual, please give that number. |
    Examples:
      | memberName          |
      | Undefined Undefined |

  Scenario:1. Positive journey - PSA/PSP enters 1 to 160 characters into the field
    When I enter "This is the reason for not having NINO" in the textarea field on "Member Does Not Have NINO Page"
    And I click save and continue button on "Member Does Not Have NINO Page"
#    Then I am presented with the "Member Date Of Birth Page"

  Scenario:3. Positive journey - PSA/PSP enters 160 characters into the field
    When I enter "I am currently not having a National Insurance Number due to new recent arrival in the UK, age, lack of employment, or awaiting processing of their application." in the textarea field on "Member Does Not Have NINO Page"
    And I click save and continue button on "Member Does Not Have NINO Page"
#    Then I am presented with the "Member Date Of Birth Page"

  Scenario:4. Negative Journey - PSA/PSP does not enter a value into the field
    When I click save and continue button on "Member Does Not Have NINO Page"
    Then I am presented with the "Member Does Not Have NINO Page" error page
    And I should see the "There is a problem" and below error messages
      | Enter the reason the member does not have a National Insurance number and a reference we can use to identify them |

  Scenario:5. Negative Journey - PSA/PSP enters more than 160 characters into the field
    When I enter "More than 160 characters, More than 160 characters, More than 160 characters, More than 160 characters, More than 160 characters, More than 160 characters. This is more." in the textarea field on "Member Does Not Have NINO Page"
    And I click save and continue button on "Member Does Not Have NINO Page"
    Then I am presented with the "Member Does Not Have NINO Page" error page
    And I should see the "There is a problem" and below error messages
      | The reason for not having a National Insurance number and reference in its place must be must be 160 characters or less |

